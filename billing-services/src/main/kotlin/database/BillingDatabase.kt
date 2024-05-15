package com.billing.database

import org.jetbrains.exposed.sql.Table
import org.jetbrains.exposed.sql.selectAll
import org.jetbrains.exposed.sql.transactions.transaction
import kotlinx.serialization.json.*
import org.jetbrains.exposed.sql.insert
import org.jetbrains.exposed.sql.json.json
import com.billing.model.Invoice


val format = Json { prettyPrint = true }

object BillingTable : Table() {
    private val invoice = json<Invoice>("invoice", format)


    fun getAll(): List<Invoice> = transaction {
        selectAll().map { row ->
            row[invoice]
        }
    }

    fun insert(newInvoice: Invoice) = transaction {
        BillingTable.insert { it[invoice] = newInvoice }
    }
}