package com.pushNotification.account.database

import org.jetbrains.exposed.sql.Table
import org.jetbrains.exposed.sql.selectAll
import org.jetbrains.exposed.sql.transactions.transaction
import kotlinx.serialization.json.*
import org.jetbrains.exposed.sql.insert
import org.jetbrains.exposed.sql.json.json
import org.openapitools.client.models.AddSubscriptionEntryJsonSubscriptionEntry



val format = Json { prettyPrint = true }

object SubscriptionTable : Table() {
    private val subscriptionEntry = json<AddSubscriptionEntryJsonSubscriptionEntry>("subscriptionEntry", format)


    fun getAll(): List<AddSubscriptionEntryJsonSubscriptionEntry> = transaction {
        selectAll().map { row ->
            row[subscriptionEntry]
        }
    }

    fun insert(newSubscription: AddSubscriptionEntryJsonSubscriptionEntry) = transaction {
        SubscriptionTable.insert { it[subscriptionEntry] = newSubscription }
    }
}