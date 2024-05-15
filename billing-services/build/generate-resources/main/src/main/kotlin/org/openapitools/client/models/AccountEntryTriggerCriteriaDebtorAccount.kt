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

import org.openapitools.client.models.OtherType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.serialization.Serializable

/**
 * 
 *
 * @param iban IBAN of an account.
 * @param bban Basic Bank Account Number (BBAN) Identifier.  This data element can be used in the body of the consent request.   Message for retrieving account access consent from this account. This   data elements is used for payment accounts which have no IBAN.   ISO20022: Basic Bank Account Number (BBAN).       Identifier used nationally by financial institutions, i.e., in individual countries,    generally as part of a National Account Numbering Scheme(s),    which uniquely identifies the account of a customer. 
 * @param pan Primary Account Number according to ISO/IEC 7812. 
 * @param maskedPan Masked Primary Account Number. 
 * @param msisdn Mobile phone number.
 * @param other 
 * @param currency ISO 4217 Alpha 3 currency code. 
 * @param cashAccountType ExternalCashAccountType1Code from ISO 20022. 
 */

@Serializable
data class AccountEntryTriggerCriteriaDebtorAccount (

    /* IBAN of an account. */
    @Json(name = "iban")
    val iban: kotlin.String? = null,

    /* Basic Bank Account Number (BBAN) Identifier.  This data element can be used in the body of the consent request.   Message for retrieving account access consent from this account. This   data elements is used for payment accounts which have no IBAN.   ISO20022: Basic Bank Account Number (BBAN).       Identifier used nationally by financial institutions, i.e., in individual countries,    generally as part of a National Account Numbering Scheme(s),    which uniquely identifies the account of a customer.  */
    @Json(name = "bban")
    val bban: kotlin.String? = null,

    /* Primary Account Number according to ISO/IEC 7812.  */
    @Json(name = "pan")
    val pan: kotlin.String? = null,

    /* Masked Primary Account Number.  */
    @Json(name = "maskedPan")
    val maskedPan: kotlin.String? = null,

    /* Mobile phone number. */
    @Json(name = "msisdn")
    val msisdn: kotlin.String? = null,

    @Json(name = "other")
    val other: String? = null,

    /* ISO 4217 Alpha 3 currency code.  */
    @Json(name = "currency")
    val currency: kotlin.String? = null,

    /* ExternalCashAccountType1Code from ISO 20022.  */
    @Json(name = "cashAccountType")
    val cashAccountType: kotlin.String? = null

)

