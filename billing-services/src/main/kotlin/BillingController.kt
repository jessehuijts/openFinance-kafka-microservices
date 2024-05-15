package com.billing

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import com.billing.database.BillingTable

@RestController
@RequestMapping("/invoices")
class InvoiceController() {

    @GetMapping
    fun getAllInvoices(): ResponseEntity<Any?> {
        val list = BillingTable.getAll()
        return ResponseEntity(list, HttpStatus.OK)
    }
}