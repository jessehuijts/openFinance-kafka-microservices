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
 * Message codes defined for Push AIS from the ASPSP's Server for HTTP Error code 403 (FORBIDDEN).
 *
 * Values: CONSENT_UNKNOWN,SERVICE_BLOCKED,RESOURCE_UNKNOWN,RESOURCE_EXPIRED
 */

@JsonClass(generateAdapter = false)
enum class MessageCode403PushAISASPSP(val value: kotlin.String) {

    @Json(name = "CONSENT_UNKNOWN")
    CONSENT_UNKNOWN("CONSENT_UNKNOWN"),

    @Json(name = "SERVICE_BLOCKED")
    SERVICE_BLOCKED("SERVICE_BLOCKED"),

    @Json(name = "RESOURCE_UNKNOWN")
    RESOURCE_UNKNOWN("RESOURCE_UNKNOWN"),

    @Json(name = "RESOURCE_EXPIRED")
    RESOURCE_EXPIRED("RESOURCE_EXPIRED");

    /**
     * Override [toString()] to avoid using the enum variable name as the value, and instead use
     * the actual value defined in the API spec file.
     *
     * This solves a problem when the variable name and its value are different, and ensures that
     * the client sends the correct enum values to the server always.
     */
    override fun toString(): kotlin.String = value

    companion object {
        /**
         * Converts the provided [data] to a [String] on success, null otherwise.
         */
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is MessageCode403PushAISASPSP) "$data" else null

        /**
         * Returns a valid [MessageCode403PushAISASPSP] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): MessageCode403PushAISASPSP? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}
