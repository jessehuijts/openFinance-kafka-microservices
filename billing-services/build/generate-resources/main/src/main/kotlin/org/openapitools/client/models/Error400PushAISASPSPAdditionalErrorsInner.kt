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

import org.openapitools.client.models.MessageCode400PushAISASPSP

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * This is a data element to support the declaration of additional errors in the context of [RFC7807].
 *
 * @param code 
 * @param title Short human readable description of error type.  Could be in local language.  To be provided by ASPSPs. 
 * @param detail Detailed human readable text specific to this instance of the error.  XPath might be used to point to the issue generating the error in addition. Remark for Future: In future, a dedicated field might be introduced for the XPath. 
 */


data class Error400PushAISASPSPAdditionalErrorsInner (

    @Json(name = "code")
    val code: MessageCode400PushAISASPSP,

    /* Short human readable description of error type.  Could be in local language.  To be provided by ASPSPs.  */
    @Json(name = "title")
    val title: kotlin.String? = null,

    /* Detailed human readable text specific to this instance of the error.  XPath might be used to point to the issue generating the error in addition. Remark for Future: In future, a dedicated field might be introduced for the XPath.  */
    @Json(name = "detail")
    val detail: kotlin.String? = null

)

