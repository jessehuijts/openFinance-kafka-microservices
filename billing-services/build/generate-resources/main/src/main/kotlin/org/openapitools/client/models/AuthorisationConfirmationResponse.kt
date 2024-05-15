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

import org.openapitools.client.models.LinksAuthorisationConfirmation
import org.openapitools.client.models.ScaStatusAuthorisationConfirmation

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Body of the JSON response for an authorisation confirmation request.
 *
 * @param scaStatus 
 * @param links 
 * @param psuMessage Text to be displayed to the PSU.
 */


data class AuthorisationConfirmationResponse (

    @Json(name = "scaStatus")
    val scaStatus: ScaStatusAuthorisationConfirmation,

    @Json(name = "_links")
    val links: LinksAuthorisationConfirmation,

    /* Text to be displayed to the PSU. */
    @Json(name = "psuMessage")
    val psuMessage: kotlin.String? = null

)

