package com.billing.model
import kotlinx.serialization.Serializable

@Serializable
class Invoice {
    var id: String? = null
    var subscriptionId: String? = null
    var amount: Int? = null
}