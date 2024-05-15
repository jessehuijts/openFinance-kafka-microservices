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

import org.openapitools.client.models.MessageCode404PushAISASPSP
import org.openapitools.client.models.TppMessageCategory

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param category 
 * @param code 
 * @param path 
 * @param text Additional explaining text to the TPP.
 */


data class TppMessage404PushAISASPSP (

    @Json(name = "category")
    val category: TppMessageCategory,

    @Json(name = "code")
    val code: MessageCode404PushAISASPSP,

    @Json(name = "path")
    val path: kotlin.String? = null,

    /* Additional explaining text to the TPP. */
    @Json(name = "text")
    val text: kotlin.String? = null

)

