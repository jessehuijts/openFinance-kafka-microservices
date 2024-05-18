package com.billing

import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Service
import org.openapitools.client.models.AddSubscriptionEntryJsonSubscriptionEntry
import kotlinx.coroutines.*


@Service
class SubscriptionListener(val billingService: BillingService) {

    // subscribes to the kafka topic "subscriptions"
    // this function is called for every record of the stream that has not yet been processed
    @KafkaListener(topics= ["subscriptions"])
     fun consume(subscription: AddSubscriptionEntryJsonSubscriptionEntry)
    {
        println(" subscription received from topic : $subscription");

        // create a new invoice for each subscription
        runBlocking {
            launch(Dispatchers.IO) {
                billingService.createInvoice(subscription)
            }
        }

    }
}