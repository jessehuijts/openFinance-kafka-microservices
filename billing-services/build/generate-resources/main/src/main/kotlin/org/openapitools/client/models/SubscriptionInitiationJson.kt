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

//import org.openapitools.client.models.SubscriptionInitiationJsonSubscriptionEntries

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Generic Body for a subscription initiation via JSON. 
 *
 * @param subscriptionEntries 
 * @param encryptionSupported If the flag is set to false, no encryption is provided by the ASPSP. If the flag is set to true, the ASPSP can choose to support encryption.
 * @param encryptionCertificate The certificate to be used for encryption by the ASPSP in base64 encoding. If not provided, no encryption will be provided.
 */


data class SubscriptionInitiationJson (

//    @Json(name = "subscriptionEntries")
//    val subscriptionEntries: SubscriptionInitiationJsonSubscriptionEntries,

    /* If the flag is set to false, no encryption is provided by the ASPSP. If the flag is set to true, the ASPSP can choose to support encryption. */
    @Json(name = "encryptionSupported")
    val encryptionSupported: kotlin.Boolean? = null,

    /* The certificate to be used for encryption by the ASPSP in base64 encoding. If not provided, no encryption will be provided. */
    @Json(name = "encryptionCertificate")
    val encryptionCertificate: kotlin.String? = null

)

