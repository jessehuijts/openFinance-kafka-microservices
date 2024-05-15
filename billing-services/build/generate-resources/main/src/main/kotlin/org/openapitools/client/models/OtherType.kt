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


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.serialization.Serializable

/**
 * In cases where the specifically defined criteria (IBAN, BBAN, MSISDN) are not provided to identify an instance of the respective account type (e.g. a savings account), the ASPSP shall include a proprietary ID of the respective account that uniquely identifies the account for this ASPSP.
 *
 * @param identification Proprietary identification of the account.
 * @param schemeNameCode An entry provided by an external ISO code list.
 * @param schemeNameProprietary A scheme name defined in a proprietary way.
 * @param issuer Issuer of the identification.
 */

@Serializable
data class OtherType (

    /* Proprietary identification of the account. */
    @Json(name = "identification")
    val identification: kotlin.String,

    /* An entry provided by an external ISO code list. */
    @Json(name = "schemeNameCode")
    val schemeNameCode: kotlin.String? = null,

    /* A scheme name defined in a proprietary way. */
    @Json(name = "schemeNameProprietary")
    val schemeNameProprietary: kotlin.String? = null,

    /* Issuer of the identification. */
    @Json(name = "issuer")
    val issuer: kotlin.String? = null

)

