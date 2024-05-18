package com.pushNotification.account

import org.openapitools.client.models.AddSubscriptionEntryJsonSubscriptionEntry
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Service
import com.pushNotification.account.database.SubscriptionTable
import java.util.*
import kotlinx.coroutines.*

@Service
class SubscriptionService(val kafkaTemplate: KafkaTemplate<String, AddSubscriptionEntryJsonSubscriptionEntry>) {

    suspend fun createSubscription(subscriptionEntry: AddSubscriptionEntryJsonSubscriptionEntry): String = coroutineScope {
        val subscriptionId = UUID.randomUUID().toString()

        subscriptionEntry.subscriptionEntryId = subscriptionId

        val insertDeferred = async { SubscriptionTable.insert(subscriptionEntry) }
        val kafkaSendDeferred = async { kafkaTemplate.send("subscriptions", "create", subscriptionEntry) }

        insertDeferred.await()
        println("subscription content stored");
        kafkaSendDeferred.await()
        println("subscription content sent to subscriptions topic");

        return@coroutineScope subscriptionId
    }
}