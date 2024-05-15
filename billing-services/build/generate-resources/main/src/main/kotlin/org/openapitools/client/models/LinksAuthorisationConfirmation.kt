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
 * A list of hyperlinks to be recognised by the TPP. The actual hyperlinks used in the response depend on the dynamical decisions of the ASPSP when processing the request.  **Remark:** All links can be relative or full links, to be decided by the ASPSP.  Type of links admitted in this response, (further links might be added for ASPSP  defined extensions):  - 'scaStatus': The link to retrieve the status of the corresponding transaction resource. 
 *
 * @param scaStatus 
 */


data class LinksAuthorisationConfirmation (

    @Json(name = "scaStatus")
    val scaStatus: HrefType? = null

) : kotlin.collections.HashMap<String, HrefType>()

