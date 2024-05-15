package com.billing
import org.openapitools.client.models.AddSubscriptionEntryJsonSubscriptionEntry
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Service
import java.util.*
import com.billing.model.Invoice
import com.billing.database.BillingTable

@Service
class BillingService(val kafkaTemplate: KafkaTemplate<String, Invoice>) {

    fun createInvoice(subscriptionEntry: AddSubscriptionEntryJsonSubscriptionEntry): Invoice {

        val invoice = Invoice().also {
            it.id = UUID.randomUUID().toString()
            it.subscriptionId = subscriptionEntry.subscriptionEntryId
            it.amount = 5
        }

        kafkaTemplate.send("invoices", "create", invoice)

        BillingTable.insert(invoice)

        return invoice;
    }
}