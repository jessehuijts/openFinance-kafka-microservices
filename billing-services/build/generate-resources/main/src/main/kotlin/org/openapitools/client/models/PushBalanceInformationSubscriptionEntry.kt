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

import org.openapitools.client.models.AccountReference
import org.openapitools.client.models.PushBalanceParameters

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param accountId 
 * @param apiClientPrimaryPushURI 
 * @param pushBalanceParameters 
 * @param validUntil 
 * @param subscriptionEntryName 
 * @param subscriptionEntryId Forbidden in an Initiate Subscription Request and in an Add a Subscription Entry Request by the TPP (as this is assigned by the ASPSP). Mandatory in each entry of a response from an ASPSP.
 * @param apiClientSecondaryPushURI 
 * @param callbackWithLinkPrefered API Client prefers to receive hyperlinks pointing to the related account information element if the related subservice criteria are met.
 * @param callbackWithStaticTextPrefered API Client prefers to get informed by static text if the related subservice criteria are met.
 * @param staticCallbackText 
 */


data class PushBalanceInformationSubscriptionEntry (

    @Json(name = "accountId")
    val accountId: AccountReference,

    @Json(name = "apiClientPrimaryPushURI")
    val apiClientPrimaryPushURI: kotlin.String,

    @Json(name = "pushBalanceParameters")
    val pushBalanceParameters: PushBalanceParameters,

    @Json(name = "validUntil")
    val validUntil: kotlin.Any? = null,

    @Json(name = "subscriptionEntryName")
    val subscriptionEntryName: kotlin.String? = null,

    /* Forbidden in an Initiate Subscription Request and in an Add a Subscription Entry Request by the TPP (as this is assigned by the ASPSP). Mandatory in each entry of a response from an ASPSP. */
    @Json(name = "subscriptionEntryId")
    val subscriptionEntryId: kotlin.String? = null,

    @Json(name = "apiClientSecondaryPushURI")
    val apiClientSecondaryPushURI: kotlin.String? = null,

    /* API Client prefers to receive hyperlinks pointing to the related account information element if the related subservice criteria are met. */
    @Json(name = "callbackWithLinkPrefered")
    val callbackWithLinkPrefered: kotlin.Boolean? = null,

    /* API Client prefers to get informed by static text if the related subservice criteria are met. */
    @Json(name = "callbackWithStaticTextPrefered")
    val callbackWithStaticTextPrefered: kotlin.Boolean? = null,

    @Json(name = "staticCallbackText")
    val staticCallbackText: kotlin.String? = null

)

