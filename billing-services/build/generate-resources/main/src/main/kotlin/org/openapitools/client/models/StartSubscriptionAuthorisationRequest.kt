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

import org.openapitools.client.models.PsuData
import org.openapitools.client.models.SelectPsuAuthenticationMethod
import org.openapitools.client.models.TransactionAuthorisation
import org.openapitools.client.models.UpdatePsuAuthentication

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param psuData 
 * @param authenticationMethodId An identification provided by the ASPSP for the later identification of the authentication method selection. 
 * @param scaAuthenticationData SCA authentication data, depending on the chosen authentication method.  If the data is binary, then it is base64 encoded. 
 */


data class StartSubscriptionAuthorisationRequest (

    @Json(name = "psuData")
    val psuData: PsuData,

    /* An identification provided by the ASPSP for the later identification of the authentication method selection.  */
    @Json(name = "authenticationMethodId")
    val authenticationMethodId: kotlin.String,

    /* SCA authentication data, depending on the chosen authentication method.  If the data is binary, then it is base64 encoded.  */
    @Json(name = "scaAuthenticationData")
    val scaAuthenticationData: kotlin.String

)

