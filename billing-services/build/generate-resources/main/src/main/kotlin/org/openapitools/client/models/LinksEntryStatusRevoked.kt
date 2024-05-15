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

import org.openapitools.client.models.HrefType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A hyperlink to an individual subscription entry that was within the lifecycle of the subscription included in the subscription but now has been revoked by the PSU. 
 *
 * @param entryRevokedStatus 
 */


data class LinksEntryStatusRevoked (

    @Json(name = "entryRevokedStatus")
    val entryRevokedStatus: HrefType? = null

)
