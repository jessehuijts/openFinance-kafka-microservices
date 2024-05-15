/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models

import org.openapitools.client.models.AddSubscriptionEntryJsonSubscriptionEntry
import org.openapitools.client.models.SubscriptionEntryStatus

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Body of the JSON response for a read subscription entry details request.
 *
 * @param subscriptionEntryStatus 
 * @param subscriptionEntry 
 */


data class ReadSubscriptionEntryDetailsResponse (

    @Json(name = "subscriptionEntryStatus")
    val subscriptionEntryStatus: SubscriptionEntryStatus,

    @Json(name = "subscriptionEntry")
    val subscriptionEntry: AddSubscriptionEntryJsonSubscriptionEntry

)

