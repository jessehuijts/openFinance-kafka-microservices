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

/**
 * Content of the body of an authorisation confirmation request 
 *
 * @param confirmationCode Confirmation Code as retrieved by the TPP from the redirect based SCA process.
 */


data class AuthorisationConfirmation (

    /* Confirmation Code as retrieved by the TPP from the redirect based SCA process. */
    @Json(name = "confirmationCode")
    val confirmationCode: kotlin.String

)
