package com.billing
import org.openapitools.client.models.AddSubscriptionEntryJsonSubscriptionEntry
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Service
import java.util.*
import com.billing.model.Invoice
import com.billing.database.BillingTable
import kotlinx.coroutines.*


@Service
class BillingService(val kafkaTemplate: KafkaTemplate<String, Invoice>) {

    suspend fun createInvoice(subscriptionEntry: AddSubscriptionEntryJsonSubscriptionEntry): Invoice = coroutineScope {

        val invoice = Invoice().also {
            it.id = UUID.randomUUID().toString()
            it.subscriptionId = subscriptionEntry.subscriptionEntryId
            it.amount = 5
        }


        launch(Dispatchers.IO) {
            kafkaTemplate.send("invoices", "create", invoice)
            println("Invoice content sent to 'invoices' topic")
        }

        launch(Dispatchers.IO) {
            BillingTable.insert(invoice)
            println("Invoice content stored")
        }

        return@coroutineScope invoice;
    }
}
