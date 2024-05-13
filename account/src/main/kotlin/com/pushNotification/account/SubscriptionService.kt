    package com.pushNotification.account

    import org.openapitools.client.models.AddSubscriptionEntryJsonSubscriptionEntry
    import org.springframework.kafka.core.KafkaTemplate
    import org.springframework.stereotype.Service
    import com.pushNotification.account.database.SubscriptionTable


    @Service
    class SubscriptionService(val kafkaTemplate: KafkaTemplate<String, AddSubscriptionEntryJsonSubscriptionEntry>
    ) {

        fun createSubscription(subscriptionEntry: AddSubscriptionEntryJsonSubscriptionEntry): AddSubscriptionEntryJsonSubscriptionEntry {

            SubscriptionTable.insert(subscriptionEntry)

            kafkaTemplate.send("subscriptions", "create", subscriptionEntry)

            return subscriptionEntry
        }
    }