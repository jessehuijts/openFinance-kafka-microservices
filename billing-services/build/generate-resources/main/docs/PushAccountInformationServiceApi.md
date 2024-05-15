# PushAccountInformationServiceApi

All URIs are relative to *https://api.testbank.com/openFinance*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addSubscriptionEntry**](PushAccountInformationServiceApi.md#addSubscriptionEntry) | **POST** /subscriptions/{push-accountinformation-subservice}/{subscriptionId}/subscription-entries | Creates and adds subscription entry sub-resource to an existing subscription.
[**cancelSubscription**](PushAccountInformationServiceApi.md#cancelSubscription) | **DELETE** /v1/subscriptions/{push-accountinformation-subservice}/{subscriptionId} | cancel a previously created subscription
[**deactivateSubscriptionEntry**](PushAccountInformationServiceApi.md#deactivateSubscriptionEntry) | **DELETE** /v1/subscriptions/{push-accountinformation-subservice}/{subscriptionId}/subscription-entries/{subscriptionEntryId} | Deactivates a given subscription entry resource.
[**getSubscriptionEntryScaStatus**](PushAccountInformationServiceApi.md#getSubscriptionEntryScaStatus) | **GET** /subscriptions/{push-accountinformation-subservice}/{subscriptionId}/subscription-entries/{subscriptionEntryId}/authorisations/{authorisationId} | Read the SCA status of the addition of a subscription entry authorisation
[**getSubscriptionInitiationScaStatus**](PushAccountInformationServiceApi.md#getSubscriptionInitiationScaStatus) | **GET** /subscriptions/{push-accountinformation-subservice}/{subscriptionId}/authorisations/{authorisationId} | Read the SCA status of the subscription initiation authorisation
[**initiateSubscription**](PushAccountInformationServiceApi.md#initiateSubscription) | **POST** /subscriptions/{push-accountinformation-subservice} | Initiate Subscription
[**pushAccountInformation**](PushAccountInformationServiceApi.md#pushAccountInformation) | **POST** / | Push Account Information
[**readSubscriptionDetails**](PushAccountInformationServiceApi.md#readSubscriptionDetails) | **GET** /v1/subscriptions/{push-accountinformation-subservice}/{subscriptionId} | read the details of a previously created subscription
[**readSubscriptionEntryDetails**](PushAccountInformationServiceApi.md#readSubscriptionEntryDetails) | **GET** /v1/subscriptions/{push-accountinformation-subservice}/{subscriptionId}/subscription-entries/{subscriptionEntryId} | read the details of a previously created subscriptionEntry
[**readSubscriptionEntryStatus**](PushAccountInformationServiceApi.md#readSubscriptionEntryStatus) | **GET** /v1/subscriptions/{push-accountinformation-subservice}/{subscriptionId}/subscription-entries/{subscriptionEntryId}/status | read the status of a previously created subscriptionEntry
[**readSubscriptionStatus**](PushAccountInformationServiceApi.md#readSubscriptionStatus) | **GET** /v1/subscriptions/{push-accountinformation-subservice}/{subscriptionId}/status | read the status of a previously created subscription
[**startSubscriptionAuthorisation**](PushAccountInformationServiceApi.md#startSubscriptionAuthorisation) | **POST** /subscriptions/{push-accountinformation-subservice}/{subscriptionId}/authorisations | Start the authorisation process for a subscription initiation
[**startSubscriptionEntryAuthorisation**](PushAccountInformationServiceApi.md#startSubscriptionEntryAuthorisation) | **POST** /subscriptions/{push-accountinformation-subservice}/{subscriptionId}/subscription-entries/{subscriptionEntryId}/authorisations | Start the authorisation process for the addition of a subscription entry
[**updatePaymentPsuData**](PushAccountInformationServiceApi.md#updatePaymentPsuData) | **PUT** /subscriptions/{push-accountinformation-subservice}/{subscriptionId}/authorisations/{authorisationId} | Update PSU data for subscription initiation
[**updateSubscriptionEntryPsuData**](PushAccountInformationServiceApi.md#updateSubscriptionEntryPsuData) | **PUT** /subscriptions/{push-accountinformation-subservice}/{subscriptionId}/subscription-entries/{subscriptionEntryId}/authorisations/{authorisationId} | Update PSU data for addition of a subscription entry initiation


<a id="addSubscriptionEntry"></a>
# **addSubscriptionEntry**
> AddSubscriptionEntryResponse addSubscriptionEntry(pushAccountinformationSubservice, subscriptionId, xRequestID, addSubscriptionEntryJson, tpPRedirectPreferred, tpPRedirectURI, tpPNokRedirectURI, tpPDecoupledPreferred, clientExplicitAuthorisationPreferred, clientBrandLoggingInformation, PSU_ID, psUIDType, psUCorporateID, psUCorporateIDType, digest, signature, tpPSignatureCertificate, psUIPAddress, psUIPPort, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUUserAgent, psUHttpMethod, psUDeviceID, psUGeoLocation)

Creates and adds subscription entry sub-resource to an existing subscription.

Creates and adds subscription entry sub-resource to an existing subscription. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PushAccountInformationServiceApi()
val pushAccountinformationSubservice : kotlin.String = pushAccountinformationSubservice_example // kotlin.String | push-accountinformation-subservice: The addressed subservice endpoint, e.g. for push-account-entries. The default list of sub services supported in this standard is: * push-account-entries * push-account-statements * push-balances * push-requests-to-pay 
val subscriptionId : kotlin.String = subscriptionId_example // kotlin.String | subscriptionId as received in the body of a (positive) initiateSubscription response 
val xRequestID : java.util.UUID = 99391c7e-ad88-49ec-a2ad-99ddcb1f7721 // java.util.UUID | ID of the request, unique to the call, as determined by the initiating party.
val addSubscriptionEntryJson : AddSubscriptionEntryJson =  // AddSubscriptionEntryJson | JSON request body for an add subscription entry request message. 
val tpPRedirectPreferred : kotlin.Boolean = true // kotlin.Boolean | If it equals \"true\", the TPP prefers a redirect over an embedded SCA approach. If it equals \"false\", the TPP prefers not to be redirected for SCA. The ASPSP will then choose between the Embedded or the Decoupled SCA approach, depending on the parameter TPP-Decoupled-Preferred and the choice of the SCA procedure by the TPP/PSU. If the parameter is not used, the ASPSP will choose the SCA approach to be applied depending on the SCA method chosen by the TPP/PSU. 
val tpPRedirectURI : java.net.URI = tpPRedirectURI_example // java.net.URI | URI of the TPP, where the transaction flow shall be redirected to after a Redirect.  Mandated for the Redirect SCA Approach, specifically  when TPP-Redirect-Preferred equals \"true\". It is recommended to always use this header field.  **Remark for Future:**  This field might be changed to mandatory in the next version of the specification. 
val tpPNokRedirectURI : java.net.URI = tpPNokRedirectURI_example // java.net.URI | If this URI is contained, the TPP is asking to redirect the transaction flow to this address instead of the TPP-Redirect-URI in case of a negative result of the redirect SCA method. This might be ignored by the ASPSP. 
val tpPDecoupledPreferred : kotlin.Boolean = true // kotlin.Boolean | If it equals \"true\", the TPP prefers a decoupled SCA approach.  If it equals \"false\", the TPP prefers not to use the decoupled approach for SCA. The ASPSP will then choose between the embedded or the redirect SCA approach, depending on the choice of the SCA procedure by the TPP/PSU.  If the parameter is not used, the ASPSP will choose the SCA approach to be applied depending on the parameter TPP-Redirect-Preferred and the SCA method chosen by the TPP/PSU.  The parameter might be ignored by the ASPSP. If both parameters TPP-Redirect-Preferred and TPP-Decoupled-Preferred are present and true, the request is still not rejected, but it is up to the ASPSP, which approach will actually be used.  **Remark for Future:**  TPP-Redirect-Preferred and TPP-Decoupled-Preferred will be revised in future versions, maybe merged. Currently kept separate for downward compatibility. 
val clientExplicitAuthorisationPreferred : kotlin.Boolean = true // kotlin.Boolean | If it equals \"true\", the TPP prefers to start the authorisation process separately,  e.g. because of the usage of a signing basket.  This preference might be ignored by the ASPSP, if a signing basket is not supported as functionality.  If it equals \"false\" or if the parameter is not used, there is no preference of the TPP.  This especially indicates that the TPP assumes a direct authorisation of the transaction in the next step,  without using a signing basket. 
val clientBrandLoggingInformation : kotlin.String = clientBrandLoggingInformation_example // kotlin.String | This header might be used by TPPs to inform the ASPSP about the brand used by the TPP towards the PSU.  This information is meant for logging entries to enhance communication between ASPSP and PSU or ASPSP and TPP.  This header might be ignored by the ASPSP. 
val PSU_ID : kotlin.String = PSU-1234 // kotlin.String | Client ID of the PSU in the ASPSP client interface.   Might be mandated in the ASPSP's documentation.  It might be contained even if an OAuth2 based authentication was performed in a pre-step or an OAuth2 based SCA was performed in an preceding AIS service in the same session. In this case the ASPSP might check whether PSU-ID and token match,  according to ASPSP documentation. 
val psUIDType : kotlin.String = psUIDType_example // kotlin.String | Type of the PSU-ID, needed in scenarios where PSUs have several PSU-IDs as access possibility.  In this case, the mean and use are then defined in the ASPSP’s documentation. 
val psUCorporateID : kotlin.String = psUCorporateID_example // kotlin.String | Might be mandated in the ASPSP's documentation. Only used in a corporate context. 
val psUCorporateIDType : kotlin.String = psUCorporateIDType_example // kotlin.String | Might be mandated in the ASPSP's documentation. Only used in a corporate context. 
val digest : kotlin.String = SHA-256=hl1/Eps8BEQW58FJhDApwJXjGY4nr1ArGDHIT25vq6A= // kotlin.String | Is contained if and only if the \"Signature\" element is contained in the header of the request.
val signature : kotlin.String = keyId="SN=9FA1,CA=CN=D-TRUST%20CA%202-1%202015,O=D-Trust%20GmbH,C=DE",algorithm="rsa-sha256", headers="Digest X-Request-ID PSU-ID TPP-Redirect-URI Date", signature="Base64(RSA-SHA256(signing string))"
 // kotlin.String | A signature of the request by the TPP on application level. This might be mandated by ASPSP. 
val tpPSignatureCertificate : kotlin.ByteArray = BYTE_ARRAY_DATA_HERE // kotlin.ByteArray | The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained. 
val psUIPAddress : kotlin.String = 192.168.8.78 // kotlin.String | The forwarded IP Address header field consists of the corresponding http request IP Address field between PSU and TPP. 
val psUIPPort : kotlin.String = 1234 // kotlin.String | The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available. 
val psUAccept : kotlin.String = psUAccept_example // kotlin.String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
val psUAcceptCharset : kotlin.String = psUAcceptCharset_example // kotlin.String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
val psUAcceptEncoding : kotlin.String = psUAcceptEncoding_example // kotlin.String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
val psUAcceptLanguage : kotlin.String = psUAcceptLanguage_example // kotlin.String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
val psUUserAgent : kotlin.String = psUUserAgent_example // kotlin.String | The forwarded Agent header field of the HTTP request between PSU and TPP, if available. 
val psUHttpMethod : kotlin.String = psUHttpMethod_example // kotlin.String | HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE 
val psUDeviceID : java.util.UUID = 99435c7e-ad88-49ec-a2ad-99ddcb1f5555 // java.util.UUID | UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device. 
val psUGeoLocation : kotlin.String = GEO:52.506931;13.144558 // kotlin.String | The forwarded Geo Location of the corresponding http request between PSU and TPP if available. 
try {
    val result : AddSubscriptionEntryResponse = apiInstance.addSubscriptionEntry(pushAccountinformationSubservice, subscriptionId, xRequestID, addSubscriptionEntryJson, tpPRedirectPreferred, tpPRedirectURI, tpPNokRedirectURI, tpPDecoupledPreferred, clientExplicitAuthorisationPreferred, clientBrandLoggingInformation, PSU_ID, psUIDType, psUCorporateID, psUCorporateIDType, digest, signature, tpPSignatureCertificate, psUIPAddress, psUIPPort, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUUserAgent, psUHttpMethod, psUDeviceID, psUGeoLocation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PushAccountInformationServiceApi#addSubscriptionEntry")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PushAccountInformationServiceApi#addSubscriptionEntry")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pushAccountinformationSubservice** | **kotlin.String**| push-accountinformation-subservice: The addressed subservice endpoint, e.g. for push-account-entries. The default list of sub services supported in this standard is: * push-account-entries * push-account-statements * push-balances * push-requests-to-pay  | [enum: push-account-entries, push-account-statements, push-balances, push-requests-to-pay]
 **subscriptionId** | **kotlin.String**| subscriptionId as received in the body of a (positive) initiateSubscription response  |
 **xRequestID** | **java.util.UUID**| ID of the request, unique to the call, as determined by the initiating party. |
 **addSubscriptionEntryJson** | [**AddSubscriptionEntryJson**](AddSubscriptionEntryJson.md)| JSON request body for an add subscription entry request message.  |
 **tpPRedirectPreferred** | **kotlin.Boolean**| If it equals \&quot;true\&quot;, the TPP prefers a redirect over an embedded SCA approach. If it equals \&quot;false\&quot;, the TPP prefers not to be redirected for SCA. The ASPSP will then choose between the Embedded or the Decoupled SCA approach, depending on the parameter TPP-Decoupled-Preferred and the choice of the SCA procedure by the TPP/PSU. If the parameter is not used, the ASPSP will choose the SCA approach to be applied depending on the SCA method chosen by the TPP/PSU.  | [optional]
 **tpPRedirectURI** | **java.net.URI**| URI of the TPP, where the transaction flow shall be redirected to after a Redirect.  Mandated for the Redirect SCA Approach, specifically  when TPP-Redirect-Preferred equals \&quot;true\&quot;. It is recommended to always use this header field.  **Remark for Future:**  This field might be changed to mandatory in the next version of the specification.  | [optional]
 **tpPNokRedirectURI** | **java.net.URI**| If this URI is contained, the TPP is asking to redirect the transaction flow to this address instead of the TPP-Redirect-URI in case of a negative result of the redirect SCA method. This might be ignored by the ASPSP.  | [optional]
 **tpPDecoupledPreferred** | **kotlin.Boolean**| If it equals \&quot;true\&quot;, the TPP prefers a decoupled SCA approach.  If it equals \&quot;false\&quot;, the TPP prefers not to use the decoupled approach for SCA. The ASPSP will then choose between the embedded or the redirect SCA approach, depending on the choice of the SCA procedure by the TPP/PSU.  If the parameter is not used, the ASPSP will choose the SCA approach to be applied depending on the parameter TPP-Redirect-Preferred and the SCA method chosen by the TPP/PSU.  The parameter might be ignored by the ASPSP. If both parameters TPP-Redirect-Preferred and TPP-Decoupled-Preferred are present and true, the request is still not rejected, but it is up to the ASPSP, which approach will actually be used.  **Remark for Future:**  TPP-Redirect-Preferred and TPP-Decoupled-Preferred will be revised in future versions, maybe merged. Currently kept separate for downward compatibility.  | [optional]
 **clientExplicitAuthorisationPreferred** | **kotlin.Boolean**| If it equals \&quot;true\&quot;, the TPP prefers to start the authorisation process separately,  e.g. because of the usage of a signing basket.  This preference might be ignored by the ASPSP, if a signing basket is not supported as functionality.  If it equals \&quot;false\&quot; or if the parameter is not used, there is no preference of the TPP.  This especially indicates that the TPP assumes a direct authorisation of the transaction in the next step,  without using a signing basket.  | [optional]
 **clientBrandLoggingInformation** | **kotlin.String**| This header might be used by TPPs to inform the ASPSP about the brand used by the TPP towards the PSU.  This information is meant for logging entries to enhance communication between ASPSP and PSU or ASPSP and TPP.  This header might be ignored by the ASPSP.  | [optional]
 **PSU_ID** | **kotlin.String**| Client ID of the PSU in the ASPSP client interface.   Might be mandated in the ASPSP&#39;s documentation.  It might be contained even if an OAuth2 based authentication was performed in a pre-step or an OAuth2 based SCA was performed in an preceding AIS service in the same session. In this case the ASPSP might check whether PSU-ID and token match,  according to ASPSP documentation.  | [optional]
 **psUIDType** | **kotlin.String**| Type of the PSU-ID, needed in scenarios where PSUs have several PSU-IDs as access possibility.  In this case, the mean and use are then defined in the ASPSP’s documentation.  | [optional]
 **psUCorporateID** | **kotlin.String**| Might be mandated in the ASPSP&#39;s documentation. Only used in a corporate context.  | [optional]
 **psUCorporateIDType** | **kotlin.String**| Might be mandated in the ASPSP&#39;s documentation. Only used in a corporate context.  | [optional]
 **digest** | **kotlin.String**| Is contained if and only if the \&quot;Signature\&quot; element is contained in the header of the request. | [optional]
 **signature** | **kotlin.String**| A signature of the request by the TPP on application level. This might be mandated by ASPSP.  | [optional]
 **tpPSignatureCertificate** | **kotlin.ByteArray**| The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained.  | [optional]
 **psUIPAddress** | **kotlin.String**| The forwarded IP Address header field consists of the corresponding http request IP Address field between PSU and TPP.  | [optional]
 **psUIPPort** | **kotlin.String**| The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available.  | [optional]
 **psUAccept** | **kotlin.String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptCharset** | **kotlin.String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptEncoding** | **kotlin.String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptLanguage** | **kotlin.String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUUserAgent** | **kotlin.String**| The forwarded Agent header field of the HTTP request between PSU and TPP, if available.  | [optional]
 **psUHttpMethod** | **kotlin.String**| HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE  | [optional] [enum: GET, POST, PUT, PATCH, DELETE]
 **psUDeviceID** | **java.util.UUID**| UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device.  | [optional]
 **psUGeoLocation** | **kotlin.String**| The forwarded Geo Location of the corresponding http request between PSU and TPP if available.  | [optional]

### Return type

[**AddSubscriptionEntryResponse**](AddSubscriptionEntryResponse.md)

### Authorization


Configure BearerAuthOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

<a id="cancelSubscription"></a>
# **cancelSubscription**
> cancelSubscription(pushAccountinformationSubservice, subscriptionId, xRequestID, digest, signature, tpPSignatureCertificate, psUIPAddress, psUIPPort, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUUserAgent, psUHttpMethod, psUDeviceID, psUGeoLocation)

cancel a previously created subscription

This method is used to cancel an existing subscription. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PushAccountInformationServiceApi()
val pushAccountinformationSubservice : kotlin.String = pushAccountinformationSubservice_example // kotlin.String | push-accountinformation-subservice: The addressed subservice endpoint, e.g. for push-account-entries. The default list of sub services supported in this standard is: * push-account-entries * push-account-statements * push-balances * push-requests-to-pay 
val subscriptionId : kotlin.String = subscriptionId_example // kotlin.String | subscriptionId as received in the body of a (positive) initiateSubscription response 
val xRequestID : java.util.UUID = 99391c7e-ad88-49ec-a2ad-99ddcb1f7721 // java.util.UUID | ID of the request, unique to the call, as determined by the initiating party.
val digest : kotlin.String = SHA-256=hl1/Eps8BEQW58FJhDApwJXjGY4nr1ArGDHIT25vq6A= // kotlin.String | Is contained if and only if the \"Signature\" element is contained in the header of the request.
val signature : kotlin.String = keyId="SN=9FA1,CA=CN=D-TRUST%20CA%202-1%202015,O=D-Trust%20GmbH,C=DE",algorithm="rsa-sha256", headers="Digest X-Request-ID PSU-ID TPP-Redirect-URI Date", signature="Base64(RSA-SHA256(signing string))"
 // kotlin.String | A signature of the request by the TPP on application level. This might be mandated by ASPSP. 
val tpPSignatureCertificate : kotlin.ByteArray = BYTE_ARRAY_DATA_HERE // kotlin.ByteArray | The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained. 
val psUIPAddress : kotlin.String = 192.168.8.78 // kotlin.String | The forwarded IP Address header field consists of the corresponding http request IP Address field between PSU and TPP. 
val psUIPPort : kotlin.String = 1234 // kotlin.String | The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available. 
val psUAccept : kotlin.String = psUAccept_example // kotlin.String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
val psUAcceptCharset : kotlin.String = psUAcceptCharset_example // kotlin.String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
val psUAcceptEncoding : kotlin.String = psUAcceptEncoding_example // kotlin.String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
val psUAcceptLanguage : kotlin.String = psUAcceptLanguage_example // kotlin.String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
val psUUserAgent : kotlin.String = psUUserAgent_example // kotlin.String | The forwarded Agent header field of the HTTP request between PSU and TPP, if available. 
val psUHttpMethod : kotlin.String = psUHttpMethod_example // kotlin.String | HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE 
val psUDeviceID : java.util.UUID = 99435c7e-ad88-49ec-a2ad-99ddcb1f5555 // java.util.UUID | UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device. 
val psUGeoLocation : kotlin.String = GEO:52.506931;13.144558 // kotlin.String | The forwarded Geo Location of the corresponding http request between PSU and TPP if available. 
try {
    apiInstance.cancelSubscription(pushAccountinformationSubservice, subscriptionId, xRequestID, digest, signature, tpPSignatureCertificate, psUIPAddress, psUIPPort, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUUserAgent, psUHttpMethod, psUDeviceID, psUGeoLocation)
} catch (e: ClientException) {
    println("4xx response calling PushAccountInformationServiceApi#cancelSubscription")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PushAccountInformationServiceApi#cancelSubscription")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pushAccountinformationSubservice** | **kotlin.String**| push-accountinformation-subservice: The addressed subservice endpoint, e.g. for push-account-entries. The default list of sub services supported in this standard is: * push-account-entries * push-account-statements * push-balances * push-requests-to-pay  | [enum: push-account-entries, push-account-statements, push-balances, push-requests-to-pay]
 **subscriptionId** | **kotlin.String**| subscriptionId as received in the body of a (positive) initiateSubscription response  |
 **xRequestID** | **java.util.UUID**| ID of the request, unique to the call, as determined by the initiating party. |
 **digest** | **kotlin.String**| Is contained if and only if the \&quot;Signature\&quot; element is contained in the header of the request. | [optional]
 **signature** | **kotlin.String**| A signature of the request by the TPP on application level. This might be mandated by ASPSP.  | [optional]
 **tpPSignatureCertificate** | **kotlin.ByteArray**| The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained.  | [optional]
 **psUIPAddress** | **kotlin.String**| The forwarded IP Address header field consists of the corresponding http request IP Address field between PSU and TPP.  | [optional]
 **psUIPPort** | **kotlin.String**| The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available.  | [optional]
 **psUAccept** | **kotlin.String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptCharset** | **kotlin.String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptEncoding** | **kotlin.String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptLanguage** | **kotlin.String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUUserAgent** | **kotlin.String**| The forwarded Agent header field of the HTTP request between PSU and TPP, if available.  | [optional]
 **psUHttpMethod** | **kotlin.String**| HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE  | [optional] [enum: GET, POST, PUT, PATCH, DELETE]
 **psUDeviceID** | **java.util.UUID**| UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device.  | [optional]
 **psUGeoLocation** | **kotlin.String**| The forwarded Geo Location of the corresponding http request between PSU and TPP if available.  | [optional]

### Return type

null (empty response body)

### Authorization


Configure BearerAuthOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a id="deactivateSubscriptionEntry"></a>
# **deactivateSubscriptionEntry**
> deactivateSubscriptionEntry(pushAccountinformationSubservice, subscriptionId, subscriptionEntryId, xRequestID, digest, signature, tpPSignatureCertificate, psUIPAddress, psUIPPort, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUUserAgent, psUHttpMethod, psUDeviceID, psUGeoLocation)

Deactivates a given subscription entry resource.

Deactivates a given subscription entry resource. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PushAccountInformationServiceApi()
val pushAccountinformationSubservice : kotlin.String = pushAccountinformationSubservice_example // kotlin.String | push-accountinformation-subservice: The addressed subservice endpoint, e.g. for push-account-entries. The default list of sub services supported in this standard is: * push-account-entries * push-account-statements * push-balances * push-requests-to-pay 
val subscriptionId : kotlin.String = subscriptionId_example // kotlin.String | subscriptionId as received in the body of a (positive) initiateSubscription response 
val subscriptionEntryId : kotlin.String = subscriptionEntryId_example // kotlin.String | subscriptionEntryId as received in the body of a (positive) initiateSubscription or addSubscriptionEntry response 
val xRequestID : java.util.UUID = 99391c7e-ad88-49ec-a2ad-99ddcb1f7721 // java.util.UUID | ID of the request, unique to the call, as determined by the initiating party.
val digest : kotlin.String = SHA-256=hl1/Eps8BEQW58FJhDApwJXjGY4nr1ArGDHIT25vq6A= // kotlin.String | Is contained if and only if the \"Signature\" element is contained in the header of the request.
val signature : kotlin.String = keyId="SN=9FA1,CA=CN=D-TRUST%20CA%202-1%202015,O=D-Trust%20GmbH,C=DE",algorithm="rsa-sha256", headers="Digest X-Request-ID PSU-ID TPP-Redirect-URI Date", signature="Base64(RSA-SHA256(signing string))"
 // kotlin.String | A signature of the request by the TPP on application level. This might be mandated by ASPSP. 
val tpPSignatureCertificate : kotlin.ByteArray = BYTE_ARRAY_DATA_HERE // kotlin.ByteArray | The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained. 
val psUIPAddress : kotlin.String = 192.168.8.78 // kotlin.String | The forwarded IP Address header field consists of the corresponding http request IP Address field between PSU and TPP. 
val psUIPPort : kotlin.String = 1234 // kotlin.String | The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available. 
val psUAccept : kotlin.String = psUAccept_example // kotlin.String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
val psUAcceptCharset : kotlin.String = psUAcceptCharset_example // kotlin.String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
val psUAcceptEncoding : kotlin.String = psUAcceptEncoding_example // kotlin.String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
val psUAcceptLanguage : kotlin.String = psUAcceptLanguage_example // kotlin.String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
val psUUserAgent : kotlin.String = psUUserAgent_example // kotlin.String | The forwarded Agent header field of the HTTP request between PSU and TPP, if available. 
val psUHttpMethod : kotlin.String = psUHttpMethod_example // kotlin.String | HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE 
val psUDeviceID : java.util.UUID = 99435c7e-ad88-49ec-a2ad-99ddcb1f5555 // java.util.UUID | UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device. 
val psUGeoLocation : kotlin.String = GEO:52.506931;13.144558 // kotlin.String | The forwarded Geo Location of the corresponding http request between PSU and TPP if available. 
try {
    apiInstance.deactivateSubscriptionEntry(pushAccountinformationSubservice, subscriptionId, subscriptionEntryId, xRequestID, digest, signature, tpPSignatureCertificate, psUIPAddress, psUIPPort, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUUserAgent, psUHttpMethod, psUDeviceID, psUGeoLocation)
} catch (e: ClientException) {
    println("4xx response calling PushAccountInformationServiceApi#deactivateSubscriptionEntry")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PushAccountInformationServiceApi#deactivateSubscriptionEntry")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pushAccountinformationSubservice** | **kotlin.String**| push-accountinformation-subservice: The addressed subservice endpoint, e.g. for push-account-entries. The default list of sub services supported in this standard is: * push-account-entries * push-account-statements * push-balances * push-requests-to-pay  | [enum: push-account-entries, push-account-statements, push-balances, push-requests-to-pay]
 **subscriptionId** | **kotlin.String**| subscriptionId as received in the body of a (positive) initiateSubscription response  |
 **subscriptionEntryId** | **kotlin.String**| subscriptionEntryId as received in the body of a (positive) initiateSubscription or addSubscriptionEntry response  |
 **xRequestID** | **java.util.UUID**| ID of the request, unique to the call, as determined by the initiating party. |
 **digest** | **kotlin.String**| Is contained if and only if the \&quot;Signature\&quot; element is contained in the header of the request. | [optional]
 **signature** | **kotlin.String**| A signature of the request by the TPP on application level. This might be mandated by ASPSP.  | [optional]
 **tpPSignatureCertificate** | **kotlin.ByteArray**| The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained.  | [optional]
 **psUIPAddress** | **kotlin.String**| The forwarded IP Address header field consists of the corresponding http request IP Address field between PSU and TPP.  | [optional]
 **psUIPPort** | **kotlin.String**| The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available.  | [optional]
 **psUAccept** | **kotlin.String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptCharset** | **kotlin.String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptEncoding** | **kotlin.String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptLanguage** | **kotlin.String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUUserAgent** | **kotlin.String**| The forwarded Agent header field of the HTTP request between PSU and TPP, if available.  | [optional]
 **psUHttpMethod** | **kotlin.String**| HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE  | [optional] [enum: GET, POST, PUT, PATCH, DELETE]
 **psUDeviceID** | **java.util.UUID**| UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device.  | [optional]
 **psUGeoLocation** | **kotlin.String**| The forwarded Geo Location of the corresponding http request between PSU and TPP if available.  | [optional]

### Return type

null (empty response body)

### Authorization


Configure BearerAuthOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a id="getSubscriptionEntryScaStatus"></a>
# **getSubscriptionEntryScaStatus**
> ScaStatusResponse getSubscriptionEntryScaStatus(pushAccountinformationSubservice, subscriptionId, subscriptionEntryId, authorisationId, xRequestID, digest, signature, tpPSignatureCertificate, psUIPAddress, psUIPPort, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUUserAgent, psUHttpMethod, psUDeviceID, psUGeoLocation)

Read the SCA status of the addition of a subscription entry authorisation

This method returns the SCA status of a subscription initiation&#39;s authorisation sub-resource. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PushAccountInformationServiceApi()
val pushAccountinformationSubservice : kotlin.String = pushAccountinformationSubservice_example // kotlin.String | push-accountinformation-subservice: The addressed subservice endpoint, e.g. for push-account-entries. The default list of sub services supported in this standard is: * push-account-entries * push-account-statements * push-balances * push-requests-to-pay 
val subscriptionId : kotlin.String = subscriptionId_example // kotlin.String | subscriptionId as received in the body of a (positive) initiateSubscription response 
val subscriptionEntryId : kotlin.String = subscriptionEntryId_example // kotlin.String | subscriptionEntryId as received in the body of a (positive) initiateSubscription or addSubscriptionEntry response 
val authorisationId : kotlin.String = authorisationId_example // kotlin.String | Resource identification of the related SCA.
val xRequestID : java.util.UUID = 99391c7e-ad88-49ec-a2ad-99ddcb1f7721 // java.util.UUID | ID of the request, unique to the call, as determined by the initiating party.
val digest : kotlin.String = SHA-256=hl1/Eps8BEQW58FJhDApwJXjGY4nr1ArGDHIT25vq6A= // kotlin.String | Is contained if and only if the \"Signature\" element is contained in the header of the request.
val signature : kotlin.String = keyId="SN=9FA1,CA=CN=D-TRUST%20CA%202-1%202015,O=D-Trust%20GmbH,C=DE",algorithm="rsa-sha256", headers="Digest X-Request-ID PSU-ID TPP-Redirect-URI Date", signature="Base64(RSA-SHA256(signing string))"
 // kotlin.String | A signature of the request by the TPP on application level. This might be mandated by ASPSP. 
val tpPSignatureCertificate : kotlin.ByteArray = BYTE_ARRAY_DATA_HERE // kotlin.ByteArray | The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained. 
val psUIPAddress : kotlin.String = 192.168.8.78 // kotlin.String | The forwarded IP Address header field consists of the corresponding http request IP Address field between PSU and TPP. 
val psUIPPort : kotlin.String = 1234 // kotlin.String | The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available. 
val psUAccept : kotlin.String = psUAccept_example // kotlin.String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
val psUAcceptCharset : kotlin.String = psUAcceptCharset_example // kotlin.String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
val psUAcceptEncoding : kotlin.String = psUAcceptEncoding_example // kotlin.String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
val psUAcceptLanguage : kotlin.String = psUAcceptLanguage_example // kotlin.String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
val psUUserAgent : kotlin.String = psUUserAgent_example // kotlin.String | The forwarded Agent header field of the HTTP request between PSU and TPP, if available. 
val psUHttpMethod : kotlin.String = psUHttpMethod_example // kotlin.String | HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE 
val psUDeviceID : java.util.UUID = 99435c7e-ad88-49ec-a2ad-99ddcb1f5555 // java.util.UUID | UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device. 
val psUGeoLocation : kotlin.String = GEO:52.506931;13.144558 // kotlin.String | The forwarded Geo Location of the corresponding http request between PSU and TPP if available. 
try {
    val result : ScaStatusResponse = apiInstance.getSubscriptionEntryScaStatus(pushAccountinformationSubservice, subscriptionId, subscriptionEntryId, authorisationId, xRequestID, digest, signature, tpPSignatureCertificate, psUIPAddress, psUIPPort, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUUserAgent, psUHttpMethod, psUDeviceID, psUGeoLocation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PushAccountInformationServiceApi#getSubscriptionEntryScaStatus")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PushAccountInformationServiceApi#getSubscriptionEntryScaStatus")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pushAccountinformationSubservice** | **kotlin.String**| push-accountinformation-subservice: The addressed subservice endpoint, e.g. for push-account-entries. The default list of sub services supported in this standard is: * push-account-entries * push-account-statements * push-balances * push-requests-to-pay  | [enum: push-account-entries, push-account-statements, push-balances, push-requests-to-pay]
 **subscriptionId** | **kotlin.String**| subscriptionId as received in the body of a (positive) initiateSubscription response  |
 **subscriptionEntryId** | **kotlin.String**| subscriptionEntryId as received in the body of a (positive) initiateSubscription or addSubscriptionEntry response  |
 **authorisationId** | **kotlin.String**| Resource identification of the related SCA. |
 **xRequestID** | **java.util.UUID**| ID of the request, unique to the call, as determined by the initiating party. |
 **digest** | **kotlin.String**| Is contained if and only if the \&quot;Signature\&quot; element is contained in the header of the request. | [optional]
 **signature** | **kotlin.String**| A signature of the request by the TPP on application level. This might be mandated by ASPSP.  | [optional]
 **tpPSignatureCertificate** | **kotlin.ByteArray**| The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained.  | [optional]
 **psUIPAddress** | **kotlin.String**| The forwarded IP Address header field consists of the corresponding http request IP Address field between PSU and TPP.  | [optional]
 **psUIPPort** | **kotlin.String**| The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available.  | [optional]
 **psUAccept** | **kotlin.String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptCharset** | **kotlin.String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptEncoding** | **kotlin.String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptLanguage** | **kotlin.String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUUserAgent** | **kotlin.String**| The forwarded Agent header field of the HTTP request between PSU and TPP, if available.  | [optional]
 **psUHttpMethod** | **kotlin.String**| HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE  | [optional] [enum: GET, POST, PUT, PATCH, DELETE]
 **psUDeviceID** | **java.util.UUID**| UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device.  | [optional]
 **psUGeoLocation** | **kotlin.String**| The forwarded Geo Location of the corresponding http request between PSU and TPP if available.  | [optional]

### Return type

[**ScaStatusResponse**](ScaStatusResponse.md)

### Authorization


Configure BearerAuthOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a id="getSubscriptionInitiationScaStatus"></a>
# **getSubscriptionInitiationScaStatus**
> ScaStatusResponse getSubscriptionInitiationScaStatus(pushAccountinformationSubservice, subscriptionId, authorisationId, xRequestID, digest, signature, tpPSignatureCertificate, psUIPAddress, psUIPPort, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUUserAgent, psUHttpMethod, psUDeviceID, psUGeoLocation)

Read the SCA status of the subscription initiation authorisation

This method returns the SCA status of a subscription initiation&#39;s authorisation sub-resource. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PushAccountInformationServiceApi()
val pushAccountinformationSubservice : kotlin.String = pushAccountinformationSubservice_example // kotlin.String | push-accountinformation-subservice: The addressed subservice endpoint, e.g. for push-account-entries. The default list of sub services supported in this standard is: * push-account-entries * push-account-statements * push-balances * push-requests-to-pay 
val subscriptionId : kotlin.String = subscriptionId_example // kotlin.String | subscriptionId as received in the body of a (positive) initiateSubscription response 
val authorisationId : kotlin.String = authorisationId_example // kotlin.String | Resource identification of the related SCA.
val xRequestID : java.util.UUID = 99391c7e-ad88-49ec-a2ad-99ddcb1f7721 // java.util.UUID | ID of the request, unique to the call, as determined by the initiating party.
val digest : kotlin.String = SHA-256=hl1/Eps8BEQW58FJhDApwJXjGY4nr1ArGDHIT25vq6A= // kotlin.String | Is contained if and only if the \"Signature\" element is contained in the header of the request.
val signature : kotlin.String = keyId="SN=9FA1,CA=CN=D-TRUST%20CA%202-1%202015,O=D-Trust%20GmbH,C=DE",algorithm="rsa-sha256", headers="Digest X-Request-ID PSU-ID TPP-Redirect-URI Date", signature="Base64(RSA-SHA256(signing string))"
 // kotlin.String | A signature of the request by the TPP on application level. This might be mandated by ASPSP. 
val tpPSignatureCertificate : kotlin.ByteArray = BYTE_ARRAY_DATA_HERE // kotlin.ByteArray | The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained. 
val psUIPAddress : kotlin.String = 192.168.8.78 // kotlin.String | The forwarded IP Address header field consists of the corresponding http request IP Address field between PSU and TPP. 
val psUIPPort : kotlin.String = 1234 // kotlin.String | The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available. 
val psUAccept : kotlin.String = psUAccept_example // kotlin.String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
val psUAcceptCharset : kotlin.String = psUAcceptCharset_example // kotlin.String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
val psUAcceptEncoding : kotlin.String = psUAcceptEncoding_example // kotlin.String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
val psUAcceptLanguage : kotlin.String = psUAcceptLanguage_example // kotlin.String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
val psUUserAgent : kotlin.String = psUUserAgent_example // kotlin.String | The forwarded Agent header field of the HTTP request between PSU and TPP, if available. 
val psUHttpMethod : kotlin.String = psUHttpMethod_example // kotlin.String | HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE 
val psUDeviceID : java.util.UUID = 99435c7e-ad88-49ec-a2ad-99ddcb1f5555 // java.util.UUID | UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device. 
val psUGeoLocation : kotlin.String = GEO:52.506931;13.144558 // kotlin.String | The forwarded Geo Location of the corresponding http request between PSU and TPP if available. 
try {
    val result : ScaStatusResponse = apiInstance.getSubscriptionInitiationScaStatus(pushAccountinformationSubservice, subscriptionId, authorisationId, xRequestID, digest, signature, tpPSignatureCertificate, psUIPAddress, psUIPPort, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUUserAgent, psUHttpMethod, psUDeviceID, psUGeoLocation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PushAccountInformationServiceApi#getSubscriptionInitiationScaStatus")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PushAccountInformationServiceApi#getSubscriptionInitiationScaStatus")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pushAccountinformationSubservice** | **kotlin.String**| push-accountinformation-subservice: The addressed subservice endpoint, e.g. for push-account-entries. The default list of sub services supported in this standard is: * push-account-entries * push-account-statements * push-balances * push-requests-to-pay  | [enum: push-account-entries, push-account-statements, push-balances, push-requests-to-pay]
 **subscriptionId** | **kotlin.String**| subscriptionId as received in the body of a (positive) initiateSubscription response  |
 **authorisationId** | **kotlin.String**| Resource identification of the related SCA. |
 **xRequestID** | **java.util.UUID**| ID of the request, unique to the call, as determined by the initiating party. |
 **digest** | **kotlin.String**| Is contained if and only if the \&quot;Signature\&quot; element is contained in the header of the request. | [optional]
 **signature** | **kotlin.String**| A signature of the request by the TPP on application level. This might be mandated by ASPSP.  | [optional]
 **tpPSignatureCertificate** | **kotlin.ByteArray**| The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained.  | [optional]
 **psUIPAddress** | **kotlin.String**| The forwarded IP Address header field consists of the corresponding http request IP Address field between PSU and TPP.  | [optional]
 **psUIPPort** | **kotlin.String**| The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available.  | [optional]
 **psUAccept** | **kotlin.String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptCharset** | **kotlin.String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptEncoding** | **kotlin.String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptLanguage** | **kotlin.String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUUserAgent** | **kotlin.String**| The forwarded Agent header field of the HTTP request between PSU and TPP, if available.  | [optional]
 **psUHttpMethod** | **kotlin.String**| HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE  | [optional] [enum: GET, POST, PUT, PATCH, DELETE]
 **psUDeviceID** | **java.util.UUID**| UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device.  | [optional]
 **psUGeoLocation** | **kotlin.String**| The forwarded Geo Location of the corresponding http request between PSU and TPP if available.  | [optional]

### Return type

[**ScaStatusResponse**](ScaStatusResponse.md)

### Authorization


Configure BearerAuthOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a id="initiateSubscription"></a>
# **initiateSubscription**
> SubscriptionInitiationResponse initiateSubscription(pushAccountinformationSubservice, xRequestID, psUIPAddress, subscriptionInitiationJson, digest, signature, tpPSignatureCertificate, clientBrandLoggingInformation, PSU_ID, psUIDType, psUCorporateID, psUCorporateIDType, clientExplicitAuthorisationPreferred, clientNotificationURI, clientNotificationContentPreferred, contractID, psUIPPort, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUUserAgent, psUHttpMethod, psUDeviceID, psUGeoLocation, tpPRedirectPreferred, tpPRedirectURI, tpPNokRedirectURI, tpPDecoupledPreferred)

Initiate Subscription

This method is used to create a new subscription resource in the ASPSP server.  Each request will create a subscription for one type of sub service. The default list of sub  services supported in this standard is:   * push-account-entries   * push-account-statements   * push-balances   * push-requests-to-pay 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PushAccountInformationServiceApi()
val pushAccountinformationSubservice : kotlin.String = pushAccountinformationSubservice_example // kotlin.String | push-accountinformation-subservice: The addressed subservice endpoint, e.g. for push-account-entries. The default list of sub services supported in this standard is: * push-account-entries * push-account-statements * push-balances * push-requests-to-pay 
val xRequestID : java.util.UUID = 99391c7e-ad88-49ec-a2ad-99ddcb1f7721 // java.util.UUID | ID of the request, unique to the call, as determined by the initiating party.
val psUIPAddress : kotlin.String = 192.168.8.78 // kotlin.String | The forwarded IP Address header field consists of the corresponding http request IP Address field between PSU and TPP. If not available, the TPP shall use the IP Address used by the TPP when submitting this request. 
val subscriptionInitiationJson : SubscriptionInitiationJson =  // SubscriptionInitiationJson | JSON request body for a subscription initiation request message. 
val digest : kotlin.String = SHA-256=hl1/Eps8BEQW58FJhDApwJXjGY4nr1ArGDHIT25vq6A= // kotlin.String | Is contained if and only if the \"Signature\" element is contained in the header of the request.
val signature : kotlin.String = keyId="SN=9FA1,CA=CN=D-TRUST%20CA%202-1%202015,O=D-Trust%20GmbH,C=DE",algorithm="rsa-sha256", headers="Digest X-Request-ID PSU-ID TPP-Redirect-URI Date", signature="Base64(RSA-SHA256(signing string))"
 // kotlin.String | A signature of the request by the TPP on application level. This might be mandated by ASPSP. 
val tpPSignatureCertificate : kotlin.ByteArray = BYTE_ARRAY_DATA_HERE // kotlin.ByteArray | The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained. 
val clientBrandLoggingInformation : kotlin.String = clientBrandLoggingInformation_example // kotlin.String | This header might be used by TPPs to inform the ASPSP about the brand used by the TPP towards the PSU.  This information is meant for logging entries to enhance communication between ASPSP and PSU or ASPSP and TPP.  This header might be ignored by the ASPSP. 
val PSU_ID : kotlin.String = PSU-1234 // kotlin.String | Client ID of the PSU in the ASPSP client interface.   Might be mandated in the ASPSP's documentation.  It might be contained even if an OAuth2 based authentication was performed in a pre-step or an OAuth2 based SCA was performed in an preceding AIS service in the same session. In this case the ASPSP might check whether PSU-ID and token match,  according to ASPSP documentation. 
val psUIDType : kotlin.String = psUIDType_example // kotlin.String | Type of the PSU-ID, needed in scenarios where PSUs have several PSU-IDs as access possibility.  In this case, the mean and use are then defined in the ASPSP’s documentation. 
val psUCorporateID : kotlin.String = psUCorporateID_example // kotlin.String | Might be mandated in the ASPSP's documentation. Only used in a corporate context. 
val psUCorporateIDType : kotlin.String = psUCorporateIDType_example // kotlin.String | Might be mandated in the ASPSP's documentation. Only used in a corporate context. 
val clientExplicitAuthorisationPreferred : kotlin.Boolean = true // kotlin.Boolean | If it equals \"true\", the TPP prefers to start the authorisation process separately,  e.g. because of the usage of a signing basket.  This preference might be ignored by the ASPSP, if a signing basket is not supported as functionality.  If it equals \"false\" or if the parameter is not used, there is no preference of the TPP.  This especially indicates that the TPP assumes a direct authorisation of the transaction in the next step,  without using a signing basket. 
val clientNotificationURI : kotlin.String = clientNotificationURI_example // kotlin.String | URI for the Endpoint of the TPP-API to which the status of the ressource to be created should be sent. This header field may by ignored by the ASPSP.  For security reasons, it shall be ensured that the Client-Notification-URI as introduced above is secured by the TPP eIDAS QWAC used for identification of the TPP. The following applies:  URIs which are provided by TPPs in Client-Notification-URI shall comply with the domain secured by the eIDAS QWAC certificate of the TPP in the field CN or SubjectAltName of the certificate. Please note that in case of example-TPP.com as certificate entry TPP- Notification-URI like www.example-TPP.com/xs2a-client/v1/ASPSPidentifcation/mytransaction- id/notifications or notifications.example-TPP.com/xs2a-client/v1/ASPSPidentifcation/mytransaction- id/notifications would be compliant.  Wildcard definitions shall be taken into account for compliance checks by the ASPSP.  ASPSPs may respond with ASPSP-Notification-Support set to false, if the provided URIs do not comply. 
val clientNotificationContentPreferred : kotlin.String = clientNotificationContentPreferred_example // kotlin.String | The string has the form   status=X1, ..., Xn  where Xi is one of the constants SCA, PROCESS, LAST and where constants are not repeated. The usage of the constants supports the of following semantics:    SCA: A notification on every change of the scaStatus attribute for all related authorisation processes is preferred by the TPP.    PROCESS: A notification on all changes of consentStatus or transactionStatus attributes is preferred by the TPP.   LAST: Only a notification on the last consentStatus or transactionStatus as available in the XS2A interface is preferred by the TPP.  This header field may be ignored, if the ASPSP does not support resource notification services for the related TPP. 
val contractID : kotlin.String = Contract-1234 // kotlin.String | ID of the underlying service contract between API Client and ASPSP, resulting from API Client onboarding, following [oFA-OR-ADM].  Only applies where a contract is mandated by the ASPSP. 
val psUIPPort : kotlin.String = 1234 // kotlin.String | The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available. 
val psUAccept : kotlin.String = psUAccept_example // kotlin.String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
val psUAcceptCharset : kotlin.String = psUAcceptCharset_example // kotlin.String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
val psUAcceptEncoding : kotlin.String = psUAcceptEncoding_example // kotlin.String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
val psUAcceptLanguage : kotlin.String = psUAcceptLanguage_example // kotlin.String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
val psUUserAgent : kotlin.String = psUUserAgent_example // kotlin.String | The forwarded Agent header field of the HTTP request between PSU and TPP, if available. 
val psUHttpMethod : kotlin.String = psUHttpMethod_example // kotlin.String | HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE 
val psUDeviceID : java.util.UUID = 99435c7e-ad88-49ec-a2ad-99ddcb1f5555 // java.util.UUID | UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device. 
val psUGeoLocation : kotlin.String = GEO:52.506931;13.144558 // kotlin.String | The forwarded Geo Location of the corresponding http request between PSU and TPP if available. 
val tpPRedirectPreferred : kotlin.Boolean = true // kotlin.Boolean | If it equals \"true\", the TPP prefers a redirect over an embedded SCA approach. If it equals \"false\", the TPP prefers not to be redirected for SCA. The ASPSP will then choose between the Embedded or the Decoupled SCA approach, depending on the parameter TPP-Decoupled-Preferred and the choice of the SCA procedure by the TPP/PSU. If the parameter is not used, the ASPSP will choose the SCA approach to be applied depending on the SCA method chosen by the TPP/PSU. 
val tpPRedirectURI : java.net.URI = tpPRedirectURI_example // java.net.URI | URI of the TPP, where the transaction flow shall be redirected to after a Redirect.  Mandated for the Redirect SCA Approach, specifically  when TPP-Redirect-Preferred equals \"true\". It is recommended to always use this header field.  **Remark for Future:**  This field might be changed to mandatory in the next version of the specification. 
val tpPNokRedirectURI : java.net.URI = tpPNokRedirectURI_example // java.net.URI | If this URI is contained, the TPP is asking to redirect the transaction flow to this address instead of the TPP-Redirect-URI in case of a negative result of the redirect SCA method. This might be ignored by the ASPSP. 
val tpPDecoupledPreferred : kotlin.Boolean = true // kotlin.Boolean | If it equals \"true\", the TPP prefers a decoupled SCA approach.  If it equals \"false\", the TPP prefers not to use the decoupled approach for SCA. The ASPSP will then choose between the embedded or the redirect SCA approach, depending on the choice of the SCA procedure by the TPP/PSU.  If the parameter is not used, the ASPSP will choose the SCA approach to be applied depending on the parameter TPP-Redirect-Preferred and the SCA method chosen by the TPP/PSU.  The parameter might be ignored by the ASPSP. If both parameters TPP-Redirect-Preferred and TPP-Decoupled-Preferred are present and true, the request is still not rejected, but it is up to the ASPSP, which approach will actually be used.  **Remark for Future:**  TPP-Redirect-Preferred and TPP-Decoupled-Preferred will be revised in future versions, maybe merged. Currently kept separate for downward compatibility. 
try {
    val result : SubscriptionInitiationResponse = apiInstance.initiateSubscription(pushAccountinformationSubservice, xRequestID, psUIPAddress, subscriptionInitiationJson, digest, signature, tpPSignatureCertificate, clientBrandLoggingInformation, PSU_ID, psUIDType, psUCorporateID, psUCorporateIDType, clientExplicitAuthorisationPreferred, clientNotificationURI, clientNotificationContentPreferred, contractID, psUIPPort, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUUserAgent, psUHttpMethod, psUDeviceID, psUGeoLocation, tpPRedirectPreferred, tpPRedirectURI, tpPNokRedirectURI, tpPDecoupledPreferred)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PushAccountInformationServiceApi#initiateSubscription")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PushAccountInformationServiceApi#initiateSubscription")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pushAccountinformationSubservice** | **kotlin.String**| push-accountinformation-subservice: The addressed subservice endpoint, e.g. for push-account-entries. The default list of sub services supported in this standard is: * push-account-entries * push-account-statements * push-balances * push-requests-to-pay  | [enum: push-account-entries, push-account-statements, push-balances, push-requests-to-pay]
 **xRequestID** | **java.util.UUID**| ID of the request, unique to the call, as determined by the initiating party. |
 **psUIPAddress** | **kotlin.String**| The forwarded IP Address header field consists of the corresponding http request IP Address field between PSU and TPP. If not available, the TPP shall use the IP Address used by the TPP when submitting this request.  |
 **subscriptionInitiationJson** | [**SubscriptionInitiationJson**](SubscriptionInitiationJson.md)| JSON request body for a subscription initiation request message.  |
 **digest** | **kotlin.String**| Is contained if and only if the \&quot;Signature\&quot; element is contained in the header of the request. | [optional]
 **signature** | **kotlin.String**| A signature of the request by the TPP on application level. This might be mandated by ASPSP.  | [optional]
 **tpPSignatureCertificate** | **kotlin.ByteArray**| The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained.  | [optional]
 **clientBrandLoggingInformation** | **kotlin.String**| This header might be used by TPPs to inform the ASPSP about the brand used by the TPP towards the PSU.  This information is meant for logging entries to enhance communication between ASPSP and PSU or ASPSP and TPP.  This header might be ignored by the ASPSP.  | [optional]
 **PSU_ID** | **kotlin.String**| Client ID of the PSU in the ASPSP client interface.   Might be mandated in the ASPSP&#39;s documentation.  It might be contained even if an OAuth2 based authentication was performed in a pre-step or an OAuth2 based SCA was performed in an preceding AIS service in the same session. In this case the ASPSP might check whether PSU-ID and token match,  according to ASPSP documentation.  | [optional]
 **psUIDType** | **kotlin.String**| Type of the PSU-ID, needed in scenarios where PSUs have several PSU-IDs as access possibility.  In this case, the mean and use are then defined in the ASPSP’s documentation.  | [optional]
 **psUCorporateID** | **kotlin.String**| Might be mandated in the ASPSP&#39;s documentation. Only used in a corporate context.  | [optional]
 **psUCorporateIDType** | **kotlin.String**| Might be mandated in the ASPSP&#39;s documentation. Only used in a corporate context.  | [optional]
 **clientExplicitAuthorisationPreferred** | **kotlin.Boolean**| If it equals \&quot;true\&quot;, the TPP prefers to start the authorisation process separately,  e.g. because of the usage of a signing basket.  This preference might be ignored by the ASPSP, if a signing basket is not supported as functionality.  If it equals \&quot;false\&quot; or if the parameter is not used, there is no preference of the TPP.  This especially indicates that the TPP assumes a direct authorisation of the transaction in the next step,  without using a signing basket.  | [optional]
 **clientNotificationURI** | **kotlin.String**| URI for the Endpoint of the TPP-API to which the status of the ressource to be created should be sent. This header field may by ignored by the ASPSP.  For security reasons, it shall be ensured that the Client-Notification-URI as introduced above is secured by the TPP eIDAS QWAC used for identification of the TPP. The following applies:  URIs which are provided by TPPs in Client-Notification-URI shall comply with the domain secured by the eIDAS QWAC certificate of the TPP in the field CN or SubjectAltName of the certificate. Please note that in case of example-TPP.com as certificate entry TPP- Notification-URI like www.example-TPP.com/xs2a-client/v1/ASPSPidentifcation/mytransaction- id/notifications or notifications.example-TPP.com/xs2a-client/v1/ASPSPidentifcation/mytransaction- id/notifications would be compliant.  Wildcard definitions shall be taken into account for compliance checks by the ASPSP.  ASPSPs may respond with ASPSP-Notification-Support set to false, if the provided URIs do not comply.  | [optional]
 **clientNotificationContentPreferred** | **kotlin.String**| The string has the form   status&#x3D;X1, ..., Xn  where Xi is one of the constants SCA, PROCESS, LAST and where constants are not repeated. The usage of the constants supports the of following semantics:    SCA: A notification on every change of the scaStatus attribute for all related authorisation processes is preferred by the TPP.    PROCESS: A notification on all changes of consentStatus or transactionStatus attributes is preferred by the TPP.   LAST: Only a notification on the last consentStatus or transactionStatus as available in the XS2A interface is preferred by the TPP.  This header field may be ignored, if the ASPSP does not support resource notification services for the related TPP.  | [optional]
 **contractID** | **kotlin.String**| ID of the underlying service contract between API Client and ASPSP, resulting from API Client onboarding, following [oFA-OR-ADM].  Only applies where a contract is mandated by the ASPSP.  | [optional]
 **psUIPPort** | **kotlin.String**| The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available.  | [optional]
 **psUAccept** | **kotlin.String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptCharset** | **kotlin.String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptEncoding** | **kotlin.String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptLanguage** | **kotlin.String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUUserAgent** | **kotlin.String**| The forwarded Agent header field of the HTTP request between PSU and TPP, if available.  | [optional]
 **psUHttpMethod** | **kotlin.String**| HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE  | [optional] [enum: GET, POST, PUT, PATCH, DELETE]
 **psUDeviceID** | **java.util.UUID**| UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device.  | [optional]
 **psUGeoLocation** | **kotlin.String**| The forwarded Geo Location of the corresponding http request between PSU and TPP if available.  | [optional]
 **tpPRedirectPreferred** | **kotlin.Boolean**| If it equals \&quot;true\&quot;, the TPP prefers a redirect over an embedded SCA approach. If it equals \&quot;false\&quot;, the TPP prefers not to be redirected for SCA. The ASPSP will then choose between the Embedded or the Decoupled SCA approach, depending on the parameter TPP-Decoupled-Preferred and the choice of the SCA procedure by the TPP/PSU. If the parameter is not used, the ASPSP will choose the SCA approach to be applied depending on the SCA method chosen by the TPP/PSU.  | [optional]
 **tpPRedirectURI** | **java.net.URI**| URI of the TPP, where the transaction flow shall be redirected to after a Redirect.  Mandated for the Redirect SCA Approach, specifically  when TPP-Redirect-Preferred equals \&quot;true\&quot;. It is recommended to always use this header field.  **Remark for Future:**  This field might be changed to mandatory in the next version of the specification.  | [optional]
 **tpPNokRedirectURI** | **java.net.URI**| If this URI is contained, the TPP is asking to redirect the transaction flow to this address instead of the TPP-Redirect-URI in case of a negative result of the redirect SCA method. This might be ignored by the ASPSP.  | [optional]
 **tpPDecoupledPreferred** | **kotlin.Boolean**| If it equals \&quot;true\&quot;, the TPP prefers a decoupled SCA approach.  If it equals \&quot;false\&quot;, the TPP prefers not to use the decoupled approach for SCA. The ASPSP will then choose between the embedded or the redirect SCA approach, depending on the choice of the SCA procedure by the TPP/PSU.  If the parameter is not used, the ASPSP will choose the SCA approach to be applied depending on the parameter TPP-Redirect-Preferred and the SCA method chosen by the TPP/PSU.  The parameter might be ignored by the ASPSP. If both parameters TPP-Redirect-Preferred and TPP-Decoupled-Preferred are present and true, the request is still not rejected, but it is up to the ASPSP, which approach will actually be used.  **Remark for Future:**  TPP-Redirect-Preferred and TPP-Decoupled-Preferred will be revised in future versions, maybe merged. Currently kept separate for downward compatibility.  | [optional]

### Return type

[**SubscriptionInitiationResponse**](SubscriptionInitiationResponse.md)

### Authorization


Configure BearerAuthOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

<a id="pushAccountInformation"></a>
# **pushAccountInformation**
> pushAccountInformation(pushAccountinformationSubservice, xRequestID, pushAccountInformationJson)

Push Account Information

This method is used to post account information in JSON encoding to the primary URI of the API Client.  Each request will create a subscription for one type of sub service. The default list of sub  services supported in this standard is:   * push-account-entries   * push-account-statements   * push-balances   * push-requests-to-pay 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PushAccountInformationServiceApi()
val pushAccountinformationSubservice : kotlin.String = pushAccountinformationSubservice_example // kotlin.String | push-accountinformation-subservice: The addressed subservice endpoint, e.g. for push-account-entries. The default list of sub services supported in this standard is: * push-account-entries * push-account-statements * push-balances * push-requests-to-pay 
val xRequestID : java.util.UUID = 99391c7e-ad88-49ec-a2ad-99ddcb1f7721 // java.util.UUID | ID of the request, unique to the call, as determined by the initiating party.
val pushAccountInformationJson : PushAccountInformationJson =  // PushAccountInformationJson | Request body for a push account information request message. 
try {
    apiInstance.pushAccountInformation(pushAccountinformationSubservice, xRequestID, pushAccountInformationJson)
} catch (e: ClientException) {
    println("4xx response calling PushAccountInformationServiceApi#pushAccountInformation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PushAccountInformationServiceApi#pushAccountInformation")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pushAccountinformationSubservice** | **kotlin.String**| push-accountinformation-subservice: The addressed subservice endpoint, e.g. for push-account-entries. The default list of sub services supported in this standard is: * push-account-entries * push-account-statements * push-balances * push-requests-to-pay  | [enum: push-account-entries, push-account-statements, push-balances, push-requests-to-pay]
 **xRequestID** | **java.util.UUID**| ID of the request, unique to the call, as determined by the initiating party. |
 **pushAccountInformationJson** | [**PushAccountInformationJson**](PushAccountInformationJson.md)| Request body for a push account information request message.  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="readSubscriptionDetails"></a>
# **readSubscriptionDetails**
> ReadSubscriptionDetailsResponse readSubscriptionDetails(pushAccountinformationSubservice, subscriptionId, xRequestID, digest, signature, tpPSignatureCertificate, psUIPAddress, psUIPPort, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUUserAgent, psUHttpMethod, psUDeviceID, psUGeoLocation)

read the details of a previously created subscription

This method is used to read the content of an existing subscription resource from the ASPSP server. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PushAccountInformationServiceApi()
val pushAccountinformationSubservice : kotlin.String = pushAccountinformationSubservice_example // kotlin.String | push-accountinformation-subservice: The addressed subservice endpoint, e.g. for push-account-entries. The default list of sub services supported in this standard is: * push-account-entries * push-account-statements * push-balances * push-requests-to-pay 
val subscriptionId : kotlin.String = subscriptionId_example // kotlin.String | subscriptionId as received in the body of a (positive) initiateSubscription response 
val xRequestID : java.util.UUID = 99391c7e-ad88-49ec-a2ad-99ddcb1f7721 // java.util.UUID | ID of the request, unique to the call, as determined by the initiating party.
val digest : kotlin.String = SHA-256=hl1/Eps8BEQW58FJhDApwJXjGY4nr1ArGDHIT25vq6A= // kotlin.String | Is contained if and only if the \"Signature\" element is contained in the header of the request.
val signature : kotlin.String = keyId="SN=9FA1,CA=CN=D-TRUST%20CA%202-1%202015,O=D-Trust%20GmbH,C=DE",algorithm="rsa-sha256", headers="Digest X-Request-ID PSU-ID TPP-Redirect-URI Date", signature="Base64(RSA-SHA256(signing string))"
 // kotlin.String | A signature of the request by the TPP on application level. This might be mandated by ASPSP. 
val tpPSignatureCertificate : kotlin.ByteArray = BYTE_ARRAY_DATA_HERE // kotlin.ByteArray | The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained. 
val psUIPAddress : kotlin.String = 192.168.8.78 // kotlin.String | The forwarded IP Address header field consists of the corresponding http request IP Address field between PSU and TPP. 
val psUIPPort : kotlin.String = 1234 // kotlin.String | The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available. 
val psUAccept : kotlin.String = psUAccept_example // kotlin.String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
val psUAcceptCharset : kotlin.String = psUAcceptCharset_example // kotlin.String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
val psUAcceptEncoding : kotlin.String = psUAcceptEncoding_example // kotlin.String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
val psUAcceptLanguage : kotlin.String = psUAcceptLanguage_example // kotlin.String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
val psUUserAgent : kotlin.String = psUUserAgent_example // kotlin.String | The forwarded Agent header field of the HTTP request between PSU and TPP, if available. 
val psUHttpMethod : kotlin.String = psUHttpMethod_example // kotlin.String | HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE 
val psUDeviceID : java.util.UUID = 99435c7e-ad88-49ec-a2ad-99ddcb1f5555 // java.util.UUID | UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device. 
val psUGeoLocation : kotlin.String = GEO:52.506931;13.144558 // kotlin.String | The forwarded Geo Location of the corresponding http request between PSU and TPP if available. 
try {
    val result : ReadSubscriptionDetailsResponse = apiInstance.readSubscriptionDetails(pushAccountinformationSubservice, subscriptionId, xRequestID, digest, signature, tpPSignatureCertificate, psUIPAddress, psUIPPort, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUUserAgent, psUHttpMethod, psUDeviceID, psUGeoLocation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PushAccountInformationServiceApi#readSubscriptionDetails")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PushAccountInformationServiceApi#readSubscriptionDetails")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pushAccountinformationSubservice** | **kotlin.String**| push-accountinformation-subservice: The addressed subservice endpoint, e.g. for push-account-entries. The default list of sub services supported in this standard is: * push-account-entries * push-account-statements * push-balances * push-requests-to-pay  | [enum: push-account-entries, push-account-statements, push-balances, push-requests-to-pay]
 **subscriptionId** | **kotlin.String**| subscriptionId as received in the body of a (positive) initiateSubscription response  |
 **xRequestID** | **java.util.UUID**| ID of the request, unique to the call, as determined by the initiating party. |
 **digest** | **kotlin.String**| Is contained if and only if the \&quot;Signature\&quot; element is contained in the header of the request. | [optional]
 **signature** | **kotlin.String**| A signature of the request by the TPP on application level. This might be mandated by ASPSP.  | [optional]
 **tpPSignatureCertificate** | **kotlin.ByteArray**| The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained.  | [optional]
 **psUIPAddress** | **kotlin.String**| The forwarded IP Address header field consists of the corresponding http request IP Address field between PSU and TPP.  | [optional]
 **psUIPPort** | **kotlin.String**| The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available.  | [optional]
 **psUAccept** | **kotlin.String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptCharset** | **kotlin.String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptEncoding** | **kotlin.String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptLanguage** | **kotlin.String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUUserAgent** | **kotlin.String**| The forwarded Agent header field of the HTTP request between PSU and TPP, if available.  | [optional]
 **psUHttpMethod** | **kotlin.String**| HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE  | [optional] [enum: GET, POST, PUT, PATCH, DELETE]
 **psUDeviceID** | **java.util.UUID**| UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device.  | [optional]
 **psUGeoLocation** | **kotlin.String**| The forwarded Geo Location of the corresponding http request between PSU and TPP if available.  | [optional]

### Return type

[**ReadSubscriptionDetailsResponse**](ReadSubscriptionDetailsResponse.md)

### Authorization


Configure BearerAuthOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a id="readSubscriptionEntryDetails"></a>
# **readSubscriptionEntryDetails**
> ReadSubscriptionEntryDetailsResponse readSubscriptionEntryDetails(pushAccountinformationSubservice, subscriptionId, subscriptionEntryId, xRequestID, digest, signature, tpPSignatureCertificate, psUIPAddress, psUIPPort, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUUserAgent, psUHttpMethod, psUDeviceID, psUGeoLocation)

read the details of a previously created subscriptionEntry

This method is used to read the content of an existing subscriptionEntry resource from the ASPSP server. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PushAccountInformationServiceApi()
val pushAccountinformationSubservice : kotlin.String = pushAccountinformationSubservice_example // kotlin.String | push-accountinformation-subservice: The addressed subservice endpoint, e.g. for push-account-entries. The default list of sub services supported in this standard is: * push-account-entries * push-account-statements * push-balances * push-requests-to-pay 
val subscriptionId : kotlin.String = subscriptionId_example // kotlin.String | subscriptionId as received in the body of a (positive) initiateSubscription response 
val subscriptionEntryId : kotlin.String = subscriptionEntryId_example // kotlin.String | subscriptionEntryId as received in the body of a (positive) initiateSubscription or addSubscriptionEntry response 
val xRequestID : java.util.UUID = 99391c7e-ad88-49ec-a2ad-99ddcb1f7721 // java.util.UUID | ID of the request, unique to the call, as determined by the initiating party.
val digest : kotlin.String = SHA-256=hl1/Eps8BEQW58FJhDApwJXjGY4nr1ArGDHIT25vq6A= // kotlin.String | Is contained if and only if the \"Signature\" element is contained in the header of the request.
val signature : kotlin.String = keyId="SN=9FA1,CA=CN=D-TRUST%20CA%202-1%202015,O=D-Trust%20GmbH,C=DE",algorithm="rsa-sha256", headers="Digest X-Request-ID PSU-ID TPP-Redirect-URI Date", signature="Base64(RSA-SHA256(signing string))"
 // kotlin.String | A signature of the request by the TPP on application level. This might be mandated by ASPSP. 
val tpPSignatureCertificate : kotlin.ByteArray = BYTE_ARRAY_DATA_HERE // kotlin.ByteArray | The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained. 
val psUIPAddress : kotlin.String = 192.168.8.78 // kotlin.String | The forwarded IP Address header field consists of the corresponding http request IP Address field between PSU and TPP. 
val psUIPPort : kotlin.String = 1234 // kotlin.String | The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available. 
val psUAccept : kotlin.String = psUAccept_example // kotlin.String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
val psUAcceptCharset : kotlin.String = psUAcceptCharset_example // kotlin.String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
val psUAcceptEncoding : kotlin.String = psUAcceptEncoding_example // kotlin.String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
val psUAcceptLanguage : kotlin.String = psUAcceptLanguage_example // kotlin.String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
val psUUserAgent : kotlin.String = psUUserAgent_example // kotlin.String | The forwarded Agent header field of the HTTP request between PSU and TPP, if available. 
val psUHttpMethod : kotlin.String = psUHttpMethod_example // kotlin.String | HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE 
val psUDeviceID : java.util.UUID = 99435c7e-ad88-49ec-a2ad-99ddcb1f5555 // java.util.UUID | UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device. 
val psUGeoLocation : kotlin.String = GEO:52.506931;13.144558 // kotlin.String | The forwarded Geo Location of the corresponding http request between PSU and TPP if available. 
try {
    val result : ReadSubscriptionEntryDetailsResponse = apiInstance.readSubscriptionEntryDetails(pushAccountinformationSubservice, subscriptionId, subscriptionEntryId, xRequestID, digest, signature, tpPSignatureCertificate, psUIPAddress, psUIPPort, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUUserAgent, psUHttpMethod, psUDeviceID, psUGeoLocation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PushAccountInformationServiceApi#readSubscriptionEntryDetails")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PushAccountInformationServiceApi#readSubscriptionEntryDetails")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pushAccountinformationSubservice** | **kotlin.String**| push-accountinformation-subservice: The addressed subservice endpoint, e.g. for push-account-entries. The default list of sub services supported in this standard is: * push-account-entries * push-account-statements * push-balances * push-requests-to-pay  | [enum: push-account-entries, push-account-statements, push-balances, push-requests-to-pay]
 **subscriptionId** | **kotlin.String**| subscriptionId as received in the body of a (positive) initiateSubscription response  |
 **subscriptionEntryId** | **kotlin.String**| subscriptionEntryId as received in the body of a (positive) initiateSubscription or addSubscriptionEntry response  |
 **xRequestID** | **java.util.UUID**| ID of the request, unique to the call, as determined by the initiating party. |
 **digest** | **kotlin.String**| Is contained if and only if the \&quot;Signature\&quot; element is contained in the header of the request. | [optional]
 **signature** | **kotlin.String**| A signature of the request by the TPP on application level. This might be mandated by ASPSP.  | [optional]
 **tpPSignatureCertificate** | **kotlin.ByteArray**| The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained.  | [optional]
 **psUIPAddress** | **kotlin.String**| The forwarded IP Address header field consists of the corresponding http request IP Address field between PSU and TPP.  | [optional]
 **psUIPPort** | **kotlin.String**| The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available.  | [optional]
 **psUAccept** | **kotlin.String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptCharset** | **kotlin.String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptEncoding** | **kotlin.String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptLanguage** | **kotlin.String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUUserAgent** | **kotlin.String**| The forwarded Agent header field of the HTTP request between PSU and TPP, if available.  | [optional]
 **psUHttpMethod** | **kotlin.String**| HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE  | [optional] [enum: GET, POST, PUT, PATCH, DELETE]
 **psUDeviceID** | **java.util.UUID**| UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device.  | [optional]
 **psUGeoLocation** | **kotlin.String**| The forwarded Geo Location of the corresponding http request between PSU and TPP if available.  | [optional]

### Return type

[**ReadSubscriptionEntryDetailsResponse**](ReadSubscriptionEntryDetailsResponse.md)

### Authorization


Configure BearerAuthOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a id="readSubscriptionEntryStatus"></a>
# **readSubscriptionEntryStatus**
> ReadSubscriptionEntryStatusResponse readSubscriptionEntryStatus(pushAccountinformationSubservice, subscriptionId, subscriptionEntryId, xRequestID, digest, signature, tpPSignatureCertificate, psUIPAddress, psUIPPort, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUUserAgent, psUHttpMethod, psUDeviceID, psUGeoLocation)

read the status of a previously created subscriptionEntry

This method is used to read the status of an existing subscriptionEntry resource from the ASPSP server. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PushAccountInformationServiceApi()
val pushAccountinformationSubservice : kotlin.String = pushAccountinformationSubservice_example // kotlin.String | push-accountinformation-subservice: The addressed subservice endpoint, e.g. for push-account-entries. The default list of sub services supported in this standard is: * push-account-entries * push-account-statements * push-balances * push-requests-to-pay 
val subscriptionId : kotlin.String = subscriptionId_example // kotlin.String | subscriptionId as received in the body of a (positive) initiateSubscription response 
val subscriptionEntryId : kotlin.String = subscriptionEntryId_example // kotlin.String | subscriptionEntryId as received in the body of a (positive) initiateSubscription or addSubscriptionEntry response 
val xRequestID : java.util.UUID = 99391c7e-ad88-49ec-a2ad-99ddcb1f7721 // java.util.UUID | ID of the request, unique to the call, as determined by the initiating party.
val digest : kotlin.String = SHA-256=hl1/Eps8BEQW58FJhDApwJXjGY4nr1ArGDHIT25vq6A= // kotlin.String | Is contained if and only if the \"Signature\" element is contained in the header of the request.
val signature : kotlin.String = keyId="SN=9FA1,CA=CN=D-TRUST%20CA%202-1%202015,O=D-Trust%20GmbH,C=DE",algorithm="rsa-sha256", headers="Digest X-Request-ID PSU-ID TPP-Redirect-URI Date", signature="Base64(RSA-SHA256(signing string))"
 // kotlin.String | A signature of the request by the TPP on application level. This might be mandated by ASPSP. 
val tpPSignatureCertificate : kotlin.ByteArray = BYTE_ARRAY_DATA_HERE // kotlin.ByteArray | The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained. 
val psUIPAddress : kotlin.String = 192.168.8.78 // kotlin.String | The forwarded IP Address header field consists of the corresponding http request IP Address field between PSU and TPP. 
val psUIPPort : kotlin.String = 1234 // kotlin.String | The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available. 
val psUAccept : kotlin.String = psUAccept_example // kotlin.String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
val psUAcceptCharset : kotlin.String = psUAcceptCharset_example // kotlin.String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
val psUAcceptEncoding : kotlin.String = psUAcceptEncoding_example // kotlin.String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
val psUAcceptLanguage : kotlin.String = psUAcceptLanguage_example // kotlin.String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
val psUUserAgent : kotlin.String = psUUserAgent_example // kotlin.String | The forwarded Agent header field of the HTTP request between PSU and TPP, if available. 
val psUHttpMethod : kotlin.String = psUHttpMethod_example // kotlin.String | HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE 
val psUDeviceID : java.util.UUID = 99435c7e-ad88-49ec-a2ad-99ddcb1f5555 // java.util.UUID | UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device. 
val psUGeoLocation : kotlin.String = GEO:52.506931;13.144558 // kotlin.String | The forwarded Geo Location of the corresponding http request between PSU and TPP if available. 
try {
    val result : ReadSubscriptionEntryStatusResponse = apiInstance.readSubscriptionEntryStatus(pushAccountinformationSubservice, subscriptionId, subscriptionEntryId, xRequestID, digest, signature, tpPSignatureCertificate, psUIPAddress, psUIPPort, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUUserAgent, psUHttpMethod, psUDeviceID, psUGeoLocation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PushAccountInformationServiceApi#readSubscriptionEntryStatus")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PushAccountInformationServiceApi#readSubscriptionEntryStatus")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pushAccountinformationSubservice** | **kotlin.String**| push-accountinformation-subservice: The addressed subservice endpoint, e.g. for push-account-entries. The default list of sub services supported in this standard is: * push-account-entries * push-account-statements * push-balances * push-requests-to-pay  | [enum: push-account-entries, push-account-statements, push-balances, push-requests-to-pay]
 **subscriptionId** | **kotlin.String**| subscriptionId as received in the body of a (positive) initiateSubscription response  |
 **subscriptionEntryId** | **kotlin.String**| subscriptionEntryId as received in the body of a (positive) initiateSubscription or addSubscriptionEntry response  |
 **xRequestID** | **java.util.UUID**| ID of the request, unique to the call, as determined by the initiating party. |
 **digest** | **kotlin.String**| Is contained if and only if the \&quot;Signature\&quot; element is contained in the header of the request. | [optional]
 **signature** | **kotlin.String**| A signature of the request by the TPP on application level. This might be mandated by ASPSP.  | [optional]
 **tpPSignatureCertificate** | **kotlin.ByteArray**| The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained.  | [optional]
 **psUIPAddress** | **kotlin.String**| The forwarded IP Address header field consists of the corresponding http request IP Address field between PSU and TPP.  | [optional]
 **psUIPPort** | **kotlin.String**| The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available.  | [optional]
 **psUAccept** | **kotlin.String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptCharset** | **kotlin.String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptEncoding** | **kotlin.String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptLanguage** | **kotlin.String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUUserAgent** | **kotlin.String**| The forwarded Agent header field of the HTTP request between PSU and TPP, if available.  | [optional]
 **psUHttpMethod** | **kotlin.String**| HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE  | [optional] [enum: GET, POST, PUT, PATCH, DELETE]
 **psUDeviceID** | **java.util.UUID**| UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device.  | [optional]
 **psUGeoLocation** | **kotlin.String**| The forwarded Geo Location of the corresponding http request between PSU and TPP if available.  | [optional]

### Return type

[**ReadSubscriptionEntryStatusResponse**](ReadSubscriptionEntryStatusResponse.md)

### Authorization


Configure BearerAuthOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a id="readSubscriptionStatus"></a>
# **readSubscriptionStatus**
> ReadSubscriptionStatusResponse readSubscriptionStatus(pushAccountinformationSubservice, subscriptionId, xRequestID, digest, signature, tpPSignatureCertificate, psUIPAddress, psUIPPort, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUUserAgent, psUHttpMethod, psUDeviceID, psUGeoLocation)

read the status of a previously created subscription

This method is used to read the status of an existing subscription resource from the ASPSP server. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PushAccountInformationServiceApi()
val pushAccountinformationSubservice : kotlin.String = pushAccountinformationSubservice_example // kotlin.String | push-accountinformation-subservice: The addressed subservice endpoint, e.g. for push-account-entries. The default list of sub services supported in this standard is: * push-account-entries * push-account-statements * push-balances * push-requests-to-pay 
val subscriptionId : kotlin.String = subscriptionId_example // kotlin.String | subscriptionId as received in the body of a (positive) initiateSubscription response 
val xRequestID : java.util.UUID = 99391c7e-ad88-49ec-a2ad-99ddcb1f7721 // java.util.UUID | ID of the request, unique to the call, as determined by the initiating party.
val digest : kotlin.String = SHA-256=hl1/Eps8BEQW58FJhDApwJXjGY4nr1ArGDHIT25vq6A= // kotlin.String | Is contained if and only if the \"Signature\" element is contained in the header of the request.
val signature : kotlin.String = keyId="SN=9FA1,CA=CN=D-TRUST%20CA%202-1%202015,O=D-Trust%20GmbH,C=DE",algorithm="rsa-sha256", headers="Digest X-Request-ID PSU-ID TPP-Redirect-URI Date", signature="Base64(RSA-SHA256(signing string))"
 // kotlin.String | A signature of the request by the TPP on application level. This might be mandated by ASPSP. 
val tpPSignatureCertificate : kotlin.ByteArray = BYTE_ARRAY_DATA_HERE // kotlin.ByteArray | The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained. 
val psUIPAddress : kotlin.String = 192.168.8.78 // kotlin.String | The forwarded IP Address header field consists of the corresponding http request IP Address field between PSU and TPP. 
val psUIPPort : kotlin.String = 1234 // kotlin.String | The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available. 
val psUAccept : kotlin.String = psUAccept_example // kotlin.String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
val psUAcceptCharset : kotlin.String = psUAcceptCharset_example // kotlin.String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
val psUAcceptEncoding : kotlin.String = psUAcceptEncoding_example // kotlin.String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
val psUAcceptLanguage : kotlin.String = psUAcceptLanguage_example // kotlin.String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
val psUUserAgent : kotlin.String = psUUserAgent_example // kotlin.String | The forwarded Agent header field of the HTTP request between PSU and TPP, if available. 
val psUHttpMethod : kotlin.String = psUHttpMethod_example // kotlin.String | HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE 
val psUDeviceID : java.util.UUID = 99435c7e-ad88-49ec-a2ad-99ddcb1f5555 // java.util.UUID | UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device. 
val psUGeoLocation : kotlin.String = GEO:52.506931;13.144558 // kotlin.String | The forwarded Geo Location of the corresponding http request between PSU and TPP if available. 
try {
    val result : ReadSubscriptionStatusResponse = apiInstance.readSubscriptionStatus(pushAccountinformationSubservice, subscriptionId, xRequestID, digest, signature, tpPSignatureCertificate, psUIPAddress, psUIPPort, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUUserAgent, psUHttpMethod, psUDeviceID, psUGeoLocation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PushAccountInformationServiceApi#readSubscriptionStatus")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PushAccountInformationServiceApi#readSubscriptionStatus")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pushAccountinformationSubservice** | **kotlin.String**| push-accountinformation-subservice: The addressed subservice endpoint, e.g. for push-account-entries. The default list of sub services supported in this standard is: * push-account-entries * push-account-statements * push-balances * push-requests-to-pay  | [enum: push-account-entries, push-account-statements, push-balances, push-requests-to-pay]
 **subscriptionId** | **kotlin.String**| subscriptionId as received in the body of a (positive) initiateSubscription response  |
 **xRequestID** | **java.util.UUID**| ID of the request, unique to the call, as determined by the initiating party. |
 **digest** | **kotlin.String**| Is contained if and only if the \&quot;Signature\&quot; element is contained in the header of the request. | [optional]
 **signature** | **kotlin.String**| A signature of the request by the TPP on application level. This might be mandated by ASPSP.  | [optional]
 **tpPSignatureCertificate** | **kotlin.ByteArray**| The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained.  | [optional]
 **psUIPAddress** | **kotlin.String**| The forwarded IP Address header field consists of the corresponding http request IP Address field between PSU and TPP.  | [optional]
 **psUIPPort** | **kotlin.String**| The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available.  | [optional]
 **psUAccept** | **kotlin.String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptCharset** | **kotlin.String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptEncoding** | **kotlin.String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptLanguage** | **kotlin.String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUUserAgent** | **kotlin.String**| The forwarded Agent header field of the HTTP request between PSU and TPP, if available.  | [optional]
 **psUHttpMethod** | **kotlin.String**| HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE  | [optional] [enum: GET, POST, PUT, PATCH, DELETE]
 **psUDeviceID** | **java.util.UUID**| UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device.  | [optional]
 **psUGeoLocation** | **kotlin.String**| The forwarded Geo Location of the corresponding http request between PSU and TPP if available.  | [optional]

### Return type

[**ReadSubscriptionStatusResponse**](ReadSubscriptionStatusResponse.md)

### Authorization


Configure BearerAuthOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a id="startSubscriptionAuthorisation"></a>
# **startSubscriptionAuthorisation**
> StartScaprocessResponse startSubscriptionAuthorisation(pushAccountinformationSubservice, subscriptionId, xRequestID, PSU_ID, psUIDType, psUCorporateID, psUCorporateIDType, tpPRedirectPreferred, tpPRedirectURI, tpPNokRedirectURI, clientNotificationURI, clientNotificationContentPreferred, digest, signature, tpPSignatureCertificate, psUIPAddress, psUIPPort, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUUserAgent, psUHttpMethod, psUDeviceID, psUGeoLocation, startSubscriptionAuthorisationRequest)

Start the authorisation process for a subscription initiation

Create an authorisation sub-resource and start the authorisation process.  The message might in addition transmit authentication and authorisation related data.   This method is iterated n times for a n times SCA authorisation in a  corporate context, each creating an own authorisation sub-endpoint for  the corresponding PSU authorising the transaction.  The ASPSP might make the usage of this access method unnecessary in case  of only one SCA process needed, since the related authorisation resource  might be automatically created by the ASPSP after the submission of the  payment data with the first POST payments/{payment-product} call.  The start authorisation process is a process which is needed for creating a new authorisation  or cancellation sub-resource.   This applies in the following scenarios:    * The ASPSP has indicated with a &#39;startAuthorisation&#39; hyperlink in the preceding Payment      initiation response that an explicit start of the authorisation process is needed by the TPP.      The &#39;startAuthorisation&#39; hyperlink can transport more information about data which needs to be      uploaded by using the extended forms:     * &#39;startAuthorisationWithPsuIdentification&#39;     * &#39;startAuthorisationWithPsuAuthentication&#39;     * &#39;startAuthorisationWithEncryptedPsuAuthentication&#39;     * &#39;startAuthorisationWithAuthentciationMethodSelection&#39;   * The related payment initiation cannot yet be executed since a multilevel SCA is mandated.   * The ASPSP has indicated with a &#39;startAuthorisation&#39; hyperlink in the preceding      Payment cancellation response that an explicit start of the authorisation process is needed by the TPP.      The &#39;startAuthorisation&#39; hyperlink can transport more information about data which needs to be uploaded      by using the extended forms as indicated above.   * The related payment cancellation request cannot be applied yet since a multilevel SCA is mandate for      executing the cancellation.   * The signing basket needs to be authorised yet. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PushAccountInformationServiceApi()
val pushAccountinformationSubservice : kotlin.String = pushAccountinformationSubservice_example // kotlin.String | push-accountinformation-subservice: The addressed subservice endpoint, e.g. for push-account-entries. The default list of sub services supported in this standard is: * push-account-entries * push-account-statements * push-balances * push-requests-to-pay 
val subscriptionId : kotlin.String = subscriptionId_example // kotlin.String | subscriptionId as received in the body of a (positive) initiateSubscription response 
val xRequestID : java.util.UUID = 99391c7e-ad88-49ec-a2ad-99ddcb1f7721 // java.util.UUID | ID of the request, unique to the call, as determined by the initiating party.
val PSU_ID : kotlin.String = PSU-1234 // kotlin.String | Client ID of the PSU in the ASPSP client interface.   Might be mandated in the ASPSP's documentation.  It might be contained even if an OAuth2 based authentication was performed in a pre-step or an OAuth2 based SCA was performed in an preceding AIS service in the same session. In this case the ASPSP might check whether PSU-ID and token match,  according to ASPSP documentation. 
val psUIDType : kotlin.String = psUIDType_example // kotlin.String | Type of the PSU-ID, needed in scenarios where PSUs have several PSU-IDs as access possibility.  In this case, the mean and use are then defined in the ASPSP’s documentation. 
val psUCorporateID : kotlin.String = psUCorporateID_example // kotlin.String | Might be mandated in the ASPSP's documentation. Only used in a corporate context. 
val psUCorporateIDType : kotlin.String = psUCorporateIDType_example // kotlin.String | Might be mandated in the ASPSP's documentation. Only used in a corporate context. 
val tpPRedirectPreferred : kotlin.Boolean = true // kotlin.Boolean | If it equals \"true\", the TPP prefers a redirect over an embedded SCA approach. If it equals \"false\", the TPP prefers not to be redirected for SCA. The ASPSP will then choose between the Embedded or the Decoupled SCA approach, depending on the parameter TPP-Decoupled-Preferred and the choice of the SCA procedure by the TPP/PSU. If the parameter is not used, the ASPSP will choose the SCA approach to be applied depending on the SCA method chosen by the TPP/PSU. 
val tpPRedirectURI : java.net.URI = tpPRedirectURI_example // java.net.URI | URI of the TPP, where the transaction flow shall be redirected to after a Redirect.  Mandated for the Redirect SCA Approach, specifically  when TPP-Redirect-Preferred equals \"true\". It is recommended to always use this header field.  **Remark for Future:**  This field might be changed to mandatory in the next version of the specification. 
val tpPNokRedirectURI : java.net.URI = tpPNokRedirectURI_example // java.net.URI | If this URI is contained, the TPP is asking to redirect the transaction flow to this address instead of the TPP-Redirect-URI in case of a negative result of the redirect SCA method. This might be ignored by the ASPSP. 
val clientNotificationURI : kotlin.String = clientNotificationURI_example // kotlin.String | URI for the Endpoint of the TPP-API to which the status of the ressource to be created should be sent. This header field may by ignored by the ASPSP.  For security reasons, it shall be ensured that the Client-Notification-URI as introduced above is secured by the TPP eIDAS QWAC used for identification of the TPP. The following applies:  URIs which are provided by TPPs in Client-Notification-URI shall comply with the domain secured by the eIDAS QWAC certificate of the TPP in the field CN or SubjectAltName of the certificate. Please note that in case of example-TPP.com as certificate entry TPP- Notification-URI like www.example-TPP.com/xs2a-client/v1/ASPSPidentifcation/mytransaction- id/notifications or notifications.example-TPP.com/xs2a-client/v1/ASPSPidentifcation/mytransaction- id/notifications would be compliant.  Wildcard definitions shall be taken into account for compliance checks by the ASPSP.  ASPSPs may respond with ASPSP-Notification-Support set to false, if the provided URIs do not comply. 
val clientNotificationContentPreferred : kotlin.String = clientNotificationContentPreferred_example // kotlin.String | The string has the form   status=X1, ..., Xn  where Xi is one of the constants SCA, PROCESS, LAST and where constants are not repeated. The usage of the constants supports the of following semantics:    SCA: A notification on every change of the scaStatus attribute for all related authorisation processes is preferred by the TPP.    PROCESS: A notification on all changes of consentStatus or transactionStatus attributes is preferred by the TPP.   LAST: Only a notification on the last consentStatus or transactionStatus as available in the XS2A interface is preferred by the TPP.  This header field may be ignored, if the ASPSP does not support resource notification services for the related TPP. 
val digest : kotlin.String = SHA-256=hl1/Eps8BEQW58FJhDApwJXjGY4nr1ArGDHIT25vq6A= // kotlin.String | Is contained if and only if the \"Signature\" element is contained in the header of the request.
val signature : kotlin.String = keyId="SN=9FA1,CA=CN=D-TRUST%20CA%202-1%202015,O=D-Trust%20GmbH,C=DE",algorithm="rsa-sha256", headers="Digest X-Request-ID PSU-ID TPP-Redirect-URI Date", signature="Base64(RSA-SHA256(signing string))"
 // kotlin.String | A signature of the request by the TPP on application level. This might be mandated by ASPSP. 
val tpPSignatureCertificate : kotlin.ByteArray = BYTE_ARRAY_DATA_HERE // kotlin.ByteArray | The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained. 
val psUIPAddress : kotlin.String = 192.168.8.78 // kotlin.String | The forwarded IP Address header field consists of the corresponding http request IP Address field between PSU and TPP. 
val psUIPPort : kotlin.String = 1234 // kotlin.String | The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available. 
val psUAccept : kotlin.String = psUAccept_example // kotlin.String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
val psUAcceptCharset : kotlin.String = psUAcceptCharset_example // kotlin.String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
val psUAcceptEncoding : kotlin.String = psUAcceptEncoding_example // kotlin.String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
val psUAcceptLanguage : kotlin.String = psUAcceptLanguage_example // kotlin.String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
val psUUserAgent : kotlin.String = psUUserAgent_example // kotlin.String | The forwarded Agent header field of the HTTP request between PSU and TPP, if available. 
val psUHttpMethod : kotlin.String = psUHttpMethod_example // kotlin.String | HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE 
val psUDeviceID : java.util.UUID = 99435c7e-ad88-49ec-a2ad-99ddcb1f5555 // java.util.UUID | UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device. 
val psUGeoLocation : kotlin.String = GEO:52.506931;13.144558 // kotlin.String | The forwarded Geo Location of the corresponding http request between PSU and TPP if available. 
val startSubscriptionAuthorisationRequest : StartSubscriptionAuthorisationRequest =  // StartSubscriptionAuthorisationRequest | 
try {
    val result : StartScaprocessResponse = apiInstance.startSubscriptionAuthorisation(pushAccountinformationSubservice, subscriptionId, xRequestID, PSU_ID, psUIDType, psUCorporateID, psUCorporateIDType, tpPRedirectPreferred, tpPRedirectURI, tpPNokRedirectURI, clientNotificationURI, clientNotificationContentPreferred, digest, signature, tpPSignatureCertificate, psUIPAddress, psUIPPort, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUUserAgent, psUHttpMethod, psUDeviceID, psUGeoLocation, startSubscriptionAuthorisationRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PushAccountInformationServiceApi#startSubscriptionAuthorisation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PushAccountInformationServiceApi#startSubscriptionAuthorisation")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pushAccountinformationSubservice** | **kotlin.String**| push-accountinformation-subservice: The addressed subservice endpoint, e.g. for push-account-entries. The default list of sub services supported in this standard is: * push-account-entries * push-account-statements * push-balances * push-requests-to-pay  | [enum: push-account-entries, push-account-statements, push-balances, push-requests-to-pay]
 **subscriptionId** | **kotlin.String**| subscriptionId as received in the body of a (positive) initiateSubscription response  |
 **xRequestID** | **java.util.UUID**| ID of the request, unique to the call, as determined by the initiating party. |
 **PSU_ID** | **kotlin.String**| Client ID of the PSU in the ASPSP client interface.   Might be mandated in the ASPSP&#39;s documentation.  It might be contained even if an OAuth2 based authentication was performed in a pre-step or an OAuth2 based SCA was performed in an preceding AIS service in the same session. In this case the ASPSP might check whether PSU-ID and token match,  according to ASPSP documentation.  | [optional]
 **psUIDType** | **kotlin.String**| Type of the PSU-ID, needed in scenarios where PSUs have several PSU-IDs as access possibility.  In this case, the mean and use are then defined in the ASPSP’s documentation.  | [optional]
 **psUCorporateID** | **kotlin.String**| Might be mandated in the ASPSP&#39;s documentation. Only used in a corporate context.  | [optional]
 **psUCorporateIDType** | **kotlin.String**| Might be mandated in the ASPSP&#39;s documentation. Only used in a corporate context.  | [optional]
 **tpPRedirectPreferred** | **kotlin.Boolean**| If it equals \&quot;true\&quot;, the TPP prefers a redirect over an embedded SCA approach. If it equals \&quot;false\&quot;, the TPP prefers not to be redirected for SCA. The ASPSP will then choose between the Embedded or the Decoupled SCA approach, depending on the parameter TPP-Decoupled-Preferred and the choice of the SCA procedure by the TPP/PSU. If the parameter is not used, the ASPSP will choose the SCA approach to be applied depending on the SCA method chosen by the TPP/PSU.  | [optional]
 **tpPRedirectURI** | **java.net.URI**| URI of the TPP, where the transaction flow shall be redirected to after a Redirect.  Mandated for the Redirect SCA Approach, specifically  when TPP-Redirect-Preferred equals \&quot;true\&quot;. It is recommended to always use this header field.  **Remark for Future:**  This field might be changed to mandatory in the next version of the specification.  | [optional]
 **tpPNokRedirectURI** | **java.net.URI**| If this URI is contained, the TPP is asking to redirect the transaction flow to this address instead of the TPP-Redirect-URI in case of a negative result of the redirect SCA method. This might be ignored by the ASPSP.  | [optional]
 **clientNotificationURI** | **kotlin.String**| URI for the Endpoint of the TPP-API to which the status of the ressource to be created should be sent. This header field may by ignored by the ASPSP.  For security reasons, it shall be ensured that the Client-Notification-URI as introduced above is secured by the TPP eIDAS QWAC used for identification of the TPP. The following applies:  URIs which are provided by TPPs in Client-Notification-URI shall comply with the domain secured by the eIDAS QWAC certificate of the TPP in the field CN or SubjectAltName of the certificate. Please note that in case of example-TPP.com as certificate entry TPP- Notification-URI like www.example-TPP.com/xs2a-client/v1/ASPSPidentifcation/mytransaction- id/notifications or notifications.example-TPP.com/xs2a-client/v1/ASPSPidentifcation/mytransaction- id/notifications would be compliant.  Wildcard definitions shall be taken into account for compliance checks by the ASPSP.  ASPSPs may respond with ASPSP-Notification-Support set to false, if the provided URIs do not comply.  | [optional]
 **clientNotificationContentPreferred** | **kotlin.String**| The string has the form   status&#x3D;X1, ..., Xn  where Xi is one of the constants SCA, PROCESS, LAST and where constants are not repeated. The usage of the constants supports the of following semantics:    SCA: A notification on every change of the scaStatus attribute for all related authorisation processes is preferred by the TPP.    PROCESS: A notification on all changes of consentStatus or transactionStatus attributes is preferred by the TPP.   LAST: Only a notification on the last consentStatus or transactionStatus as available in the XS2A interface is preferred by the TPP.  This header field may be ignored, if the ASPSP does not support resource notification services for the related TPP.  | [optional]
 **digest** | **kotlin.String**| Is contained if and only if the \&quot;Signature\&quot; element is contained in the header of the request. | [optional]
 **signature** | **kotlin.String**| A signature of the request by the TPP on application level. This might be mandated by ASPSP.  | [optional]
 **tpPSignatureCertificate** | **kotlin.ByteArray**| The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained.  | [optional]
 **psUIPAddress** | **kotlin.String**| The forwarded IP Address header field consists of the corresponding http request IP Address field between PSU and TPP.  | [optional]
 **psUIPPort** | **kotlin.String**| The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available.  | [optional]
 **psUAccept** | **kotlin.String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptCharset** | **kotlin.String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptEncoding** | **kotlin.String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptLanguage** | **kotlin.String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUUserAgent** | **kotlin.String**| The forwarded Agent header field of the HTTP request between PSU and TPP, if available.  | [optional]
 **psUHttpMethod** | **kotlin.String**| HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE  | [optional] [enum: GET, POST, PUT, PATCH, DELETE]
 **psUDeviceID** | **java.util.UUID**| UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device.  | [optional]
 **psUGeoLocation** | **kotlin.String**| The forwarded Geo Location of the corresponding http request between PSU and TPP if available.  | [optional]
 **startSubscriptionAuthorisationRequest** | [**StartSubscriptionAuthorisationRequest**](StartSubscriptionAuthorisationRequest.md)|  | [optional]

### Return type

[**StartScaprocessResponse**](StartScaprocessResponse.md)

### Authorization


Configure BearerAuthOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

<a id="startSubscriptionEntryAuthorisation"></a>
# **startSubscriptionEntryAuthorisation**
> StartScaprocessResponse startSubscriptionEntryAuthorisation(pushAccountinformationSubservice, subscriptionId, subscriptionEntryId, xRequestID, PSU_ID, psUIDType, psUCorporateID, psUCorporateIDType, tpPRedirectPreferred, tpPDecoupledPreferred, tpPRedirectURI, tpPNokRedirectURI, clientNotificationURI, clientNotificationContentPreferred, digest, signature, tpPSignatureCertificate, psUIPAddress, psUIPPort, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUUserAgent, psUHttpMethod, psUDeviceID, psUGeoLocation, startSubscriptionAuthorisationRequest)

Start the authorisation process for the addition of a subscription entry

Create an authorisation sub-resource and start the authorisation process.  The message might in addition transmit authentication and authorisation related data.   This method is iterated n times for a n times SCA authorisation in a  corporate context, each creating an own authorisation sub-endpoint for  the corresponding PSU authorising the transaction.  The ASPSP might make the usage of this access method unnecessary in case  of only one SCA process needed, since the related authorisation resource  might be automatically created by the ASPSP after the submission of the  payment data with the first POST payments/{payment-product} call.  The start authorisation process is a process which is needed for creating a new authorisation  or cancellation sub-resource.   This applies in the following scenarios:    * The ASPSP has indicated with a &#39;startAuthorisation&#39; hyperlink in the preceding Payment      initiation response that an explicit start of the authorisation process is needed by the TPP.      The &#39;startAuthorisation&#39; hyperlink can transport more information about data which needs to be      uploaded by using the extended forms:     * &#39;startAuthorisationWithPsuIdentification&#39;     * &#39;startAuthorisationWithPsuAuthentication&#39;     * &#39;startAuthorisationWithEncryptedPsuAuthentication&#39;     * &#39;startAuthorisationWithAuthentciationMethodSelection&#39;   * The related payment initiation cannot yet be executed since a multilevel SCA is mandated.   * The ASPSP has indicated with a &#39;startAuthorisation&#39; hyperlink in the preceding      Payment cancellation response that an explicit start of the authorisation process is needed by the TPP.      The &#39;startAuthorisation&#39; hyperlink can transport more information about data which needs to be uploaded      by using the extended forms as indicated above.   * The related payment cancellation request cannot be applied yet since a multilevel SCA is mandate for      executing the cancellation.   * The signing basket needs to be authorised yet. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PushAccountInformationServiceApi()
val pushAccountinformationSubservice : kotlin.String = pushAccountinformationSubservice_example // kotlin.String | push-accountinformation-subservice: The addressed subservice endpoint, e.g. for push-account-entries. The default list of sub services supported in this standard is: * push-account-entries * push-account-statements * push-balances * push-requests-to-pay 
val subscriptionId : kotlin.String = subscriptionId_example // kotlin.String | subscriptionId as received in the body of a (positive) initiateSubscription response 
val subscriptionEntryId : kotlin.String = subscriptionEntryId_example // kotlin.String | subscriptionEntryId as received in the body of a (positive) initiateSubscription or addSubscriptionEntry response 
val xRequestID : java.util.UUID = 99391c7e-ad88-49ec-a2ad-99ddcb1f7721 // java.util.UUID | ID of the request, unique to the call, as determined by the initiating party.
val PSU_ID : kotlin.String = PSU-1234 // kotlin.String | Client ID of the PSU in the ASPSP client interface.   Might be mandated in the ASPSP's documentation.  It might be contained even if an OAuth2 based authentication was performed in a pre-step or an OAuth2 based SCA was performed in an preceding AIS service in the same session. In this case the ASPSP might check whether PSU-ID and token match,  according to ASPSP documentation. 
val psUIDType : kotlin.String = psUIDType_example // kotlin.String | Type of the PSU-ID, needed in scenarios where PSUs have several PSU-IDs as access possibility.  In this case, the mean and use are then defined in the ASPSP’s documentation. 
val psUCorporateID : kotlin.String = psUCorporateID_example // kotlin.String | Might be mandated in the ASPSP's documentation. Only used in a corporate context. 
val psUCorporateIDType : kotlin.String = psUCorporateIDType_example // kotlin.String | Might be mandated in the ASPSP's documentation. Only used in a corporate context. 
val tpPRedirectPreferred : kotlin.Boolean = true // kotlin.Boolean | If it equals \"true\", the TPP prefers a redirect over an embedded SCA approach. If it equals \"false\", the TPP prefers not to be redirected for SCA. The ASPSP will then choose between the Embedded or the Decoupled SCA approach, depending on the parameter TPP-Decoupled-Preferred and the choice of the SCA procedure by the TPP/PSU. If the parameter is not used, the ASPSP will choose the SCA approach to be applied depending on the SCA method chosen by the TPP/PSU. 
val tpPDecoupledPreferred : kotlin.Boolean = true // kotlin.Boolean | If it equals \"true\", the TPP prefers a decoupled SCA approach.  If it equals \"false\", the TPP prefers not to use the decoupled approach for SCA. The ASPSP will then choose between the embedded or the redirect SCA approach, depending on the choice of the SCA procedure by the TPP/PSU.  If the parameter is not used, the ASPSP will choose the SCA approach to be applied depending on the parameter TPP-Redirect-Preferred and the SCA method chosen by the TPP/PSU.  The parameter might be ignored by the ASPSP. If both parameters TPP-Redirect-Preferred and TPP-Decoupled-Preferred are present and true, the request is still not rejected, but it is up to the ASPSP, which approach will actually be used.  **Remark for Future:**  TPP-Redirect-Preferred and TPP-Decoupled-Preferred will be revised in future versions, maybe merged. Currently kept separate for downward compatibility. 
val tpPRedirectURI : java.net.URI = tpPRedirectURI_example // java.net.URI | URI of the TPP, where the transaction flow shall be redirected to after a Redirect.  Mandated for the Redirect SCA Approach, specifically  when TPP-Redirect-Preferred equals \"true\". It is recommended to always use this header field.  **Remark for Future:**  This field might be changed to mandatory in the next version of the specification. 
val tpPNokRedirectURI : java.net.URI = tpPNokRedirectURI_example // java.net.URI | If this URI is contained, the TPP is asking to redirect the transaction flow to this address instead of the TPP-Redirect-URI in case of a negative result of the redirect SCA method. This might be ignored by the ASPSP. 
val clientNotificationURI : kotlin.String = clientNotificationURI_example // kotlin.String | URI for the Endpoint of the TPP-API to which the status of the ressource to be created should be sent. This header field may by ignored by the ASPSP.  For security reasons, it shall be ensured that the Client-Notification-URI as introduced above is secured by the TPP eIDAS QWAC used for identification of the TPP. The following applies:  URIs which are provided by TPPs in Client-Notification-URI shall comply with the domain secured by the eIDAS QWAC certificate of the TPP in the field CN or SubjectAltName of the certificate. Please note that in case of example-TPP.com as certificate entry TPP- Notification-URI like www.example-TPP.com/xs2a-client/v1/ASPSPidentifcation/mytransaction- id/notifications or notifications.example-TPP.com/xs2a-client/v1/ASPSPidentifcation/mytransaction- id/notifications would be compliant.  Wildcard definitions shall be taken into account for compliance checks by the ASPSP.  ASPSPs may respond with ASPSP-Notification-Support set to false, if the provided URIs do not comply. 
val clientNotificationContentPreferred : kotlin.String = clientNotificationContentPreferred_example // kotlin.String | The string has the form   status=X1, ..., Xn  where Xi is one of the constants SCA, PROCESS, LAST and where constants are not repeated. The usage of the constants supports the of following semantics:    SCA: A notification on every change of the scaStatus attribute for all related authorisation processes is preferred by the TPP.    PROCESS: A notification on all changes of consentStatus or transactionStatus attributes is preferred by the TPP.   LAST: Only a notification on the last consentStatus or transactionStatus as available in the XS2A interface is preferred by the TPP.  This header field may be ignored, if the ASPSP does not support resource notification services for the related TPP. 
val digest : kotlin.String = SHA-256=hl1/Eps8BEQW58FJhDApwJXjGY4nr1ArGDHIT25vq6A= // kotlin.String | Is contained if and only if the \"Signature\" element is contained in the header of the request.
val signature : kotlin.String = keyId="SN=9FA1,CA=CN=D-TRUST%20CA%202-1%202015,O=D-Trust%20GmbH,C=DE",algorithm="rsa-sha256", headers="Digest X-Request-ID PSU-ID TPP-Redirect-URI Date", signature="Base64(RSA-SHA256(signing string))"
 // kotlin.String | A signature of the request by the TPP on application level. This might be mandated by ASPSP. 
val tpPSignatureCertificate : kotlin.ByteArray = BYTE_ARRAY_DATA_HERE // kotlin.ByteArray | The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained. 
val psUIPAddress : kotlin.String = 192.168.8.78 // kotlin.String | The forwarded IP Address header field consists of the corresponding http request IP Address field between PSU and TPP. 
val psUIPPort : kotlin.String = 1234 // kotlin.String | The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available. 
val psUAccept : kotlin.String = psUAccept_example // kotlin.String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
val psUAcceptCharset : kotlin.String = psUAcceptCharset_example // kotlin.String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
val psUAcceptEncoding : kotlin.String = psUAcceptEncoding_example // kotlin.String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
val psUAcceptLanguage : kotlin.String = psUAcceptLanguage_example // kotlin.String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
val psUUserAgent : kotlin.String = psUUserAgent_example // kotlin.String | The forwarded Agent header field of the HTTP request between PSU and TPP, if available. 
val psUHttpMethod : kotlin.String = psUHttpMethod_example // kotlin.String | HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE 
val psUDeviceID : java.util.UUID = 99435c7e-ad88-49ec-a2ad-99ddcb1f5555 // java.util.UUID | UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device. 
val psUGeoLocation : kotlin.String = GEO:52.506931;13.144558 // kotlin.String | The forwarded Geo Location of the corresponding http request between PSU and TPP if available. 
val startSubscriptionAuthorisationRequest : StartSubscriptionAuthorisationRequest =  // StartSubscriptionAuthorisationRequest | 
try {
    val result : StartScaprocessResponse = apiInstance.startSubscriptionEntryAuthorisation(pushAccountinformationSubservice, subscriptionId, subscriptionEntryId, xRequestID, PSU_ID, psUIDType, psUCorporateID, psUCorporateIDType, tpPRedirectPreferred, tpPDecoupledPreferred, tpPRedirectURI, tpPNokRedirectURI, clientNotificationURI, clientNotificationContentPreferred, digest, signature, tpPSignatureCertificate, psUIPAddress, psUIPPort, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUUserAgent, psUHttpMethod, psUDeviceID, psUGeoLocation, startSubscriptionAuthorisationRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PushAccountInformationServiceApi#startSubscriptionEntryAuthorisation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PushAccountInformationServiceApi#startSubscriptionEntryAuthorisation")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pushAccountinformationSubservice** | **kotlin.String**| push-accountinformation-subservice: The addressed subservice endpoint, e.g. for push-account-entries. The default list of sub services supported in this standard is: * push-account-entries * push-account-statements * push-balances * push-requests-to-pay  | [enum: push-account-entries, push-account-statements, push-balances, push-requests-to-pay]
 **subscriptionId** | **kotlin.String**| subscriptionId as received in the body of a (positive) initiateSubscription response  |
 **subscriptionEntryId** | **kotlin.String**| subscriptionEntryId as received in the body of a (positive) initiateSubscription or addSubscriptionEntry response  |
 **xRequestID** | **java.util.UUID**| ID of the request, unique to the call, as determined by the initiating party. |
 **PSU_ID** | **kotlin.String**| Client ID of the PSU in the ASPSP client interface.   Might be mandated in the ASPSP&#39;s documentation.  It might be contained even if an OAuth2 based authentication was performed in a pre-step or an OAuth2 based SCA was performed in an preceding AIS service in the same session. In this case the ASPSP might check whether PSU-ID and token match,  according to ASPSP documentation.  | [optional]
 **psUIDType** | **kotlin.String**| Type of the PSU-ID, needed in scenarios where PSUs have several PSU-IDs as access possibility.  In this case, the mean and use are then defined in the ASPSP’s documentation.  | [optional]
 **psUCorporateID** | **kotlin.String**| Might be mandated in the ASPSP&#39;s documentation. Only used in a corporate context.  | [optional]
 **psUCorporateIDType** | **kotlin.String**| Might be mandated in the ASPSP&#39;s documentation. Only used in a corporate context.  | [optional]
 **tpPRedirectPreferred** | **kotlin.Boolean**| If it equals \&quot;true\&quot;, the TPP prefers a redirect over an embedded SCA approach. If it equals \&quot;false\&quot;, the TPP prefers not to be redirected for SCA. The ASPSP will then choose between the Embedded or the Decoupled SCA approach, depending on the parameter TPP-Decoupled-Preferred and the choice of the SCA procedure by the TPP/PSU. If the parameter is not used, the ASPSP will choose the SCA approach to be applied depending on the SCA method chosen by the TPP/PSU.  | [optional]
 **tpPDecoupledPreferred** | **kotlin.Boolean**| If it equals \&quot;true\&quot;, the TPP prefers a decoupled SCA approach.  If it equals \&quot;false\&quot;, the TPP prefers not to use the decoupled approach for SCA. The ASPSP will then choose between the embedded or the redirect SCA approach, depending on the choice of the SCA procedure by the TPP/PSU.  If the parameter is not used, the ASPSP will choose the SCA approach to be applied depending on the parameter TPP-Redirect-Preferred and the SCA method chosen by the TPP/PSU.  The parameter might be ignored by the ASPSP. If both parameters TPP-Redirect-Preferred and TPP-Decoupled-Preferred are present and true, the request is still not rejected, but it is up to the ASPSP, which approach will actually be used.  **Remark for Future:**  TPP-Redirect-Preferred and TPP-Decoupled-Preferred will be revised in future versions, maybe merged. Currently kept separate for downward compatibility.  | [optional]
 **tpPRedirectURI** | **java.net.URI**| URI of the TPP, where the transaction flow shall be redirected to after a Redirect.  Mandated for the Redirect SCA Approach, specifically  when TPP-Redirect-Preferred equals \&quot;true\&quot;. It is recommended to always use this header field.  **Remark for Future:**  This field might be changed to mandatory in the next version of the specification.  | [optional]
 **tpPNokRedirectURI** | **java.net.URI**| If this URI is contained, the TPP is asking to redirect the transaction flow to this address instead of the TPP-Redirect-URI in case of a negative result of the redirect SCA method. This might be ignored by the ASPSP.  | [optional]
 **clientNotificationURI** | **kotlin.String**| URI for the Endpoint of the TPP-API to which the status of the ressource to be created should be sent. This header field may by ignored by the ASPSP.  For security reasons, it shall be ensured that the Client-Notification-URI as introduced above is secured by the TPP eIDAS QWAC used for identification of the TPP. The following applies:  URIs which are provided by TPPs in Client-Notification-URI shall comply with the domain secured by the eIDAS QWAC certificate of the TPP in the field CN or SubjectAltName of the certificate. Please note that in case of example-TPP.com as certificate entry TPP- Notification-URI like www.example-TPP.com/xs2a-client/v1/ASPSPidentifcation/mytransaction- id/notifications or notifications.example-TPP.com/xs2a-client/v1/ASPSPidentifcation/mytransaction- id/notifications would be compliant.  Wildcard definitions shall be taken into account for compliance checks by the ASPSP.  ASPSPs may respond with ASPSP-Notification-Support set to false, if the provided URIs do not comply.  | [optional]
 **clientNotificationContentPreferred** | **kotlin.String**| The string has the form   status&#x3D;X1, ..., Xn  where Xi is one of the constants SCA, PROCESS, LAST and where constants are not repeated. The usage of the constants supports the of following semantics:    SCA: A notification on every change of the scaStatus attribute for all related authorisation processes is preferred by the TPP.    PROCESS: A notification on all changes of consentStatus or transactionStatus attributes is preferred by the TPP.   LAST: Only a notification on the last consentStatus or transactionStatus as available in the XS2A interface is preferred by the TPP.  This header field may be ignored, if the ASPSP does not support resource notification services for the related TPP.  | [optional]
 **digest** | **kotlin.String**| Is contained if and only if the \&quot;Signature\&quot; element is contained in the header of the request. | [optional]
 **signature** | **kotlin.String**| A signature of the request by the TPP on application level. This might be mandated by ASPSP.  | [optional]
 **tpPSignatureCertificate** | **kotlin.ByteArray**| The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained.  | [optional]
 **psUIPAddress** | **kotlin.String**| The forwarded IP Address header field consists of the corresponding http request IP Address field between PSU and TPP.  | [optional]
 **psUIPPort** | **kotlin.String**| The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available.  | [optional]
 **psUAccept** | **kotlin.String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptCharset** | **kotlin.String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptEncoding** | **kotlin.String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptLanguage** | **kotlin.String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUUserAgent** | **kotlin.String**| The forwarded Agent header field of the HTTP request between PSU and TPP, if available.  | [optional]
 **psUHttpMethod** | **kotlin.String**| HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE  | [optional] [enum: GET, POST, PUT, PATCH, DELETE]
 **psUDeviceID** | **java.util.UUID**| UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device.  | [optional]
 **psUGeoLocation** | **kotlin.String**| The forwarded Geo Location of the corresponding http request between PSU and TPP if available.  | [optional]
 **startSubscriptionAuthorisationRequest** | [**StartSubscriptionAuthorisationRequest**](StartSubscriptionAuthorisationRequest.md)|  | [optional]

### Return type

[**StartScaprocessResponse**](StartScaprocessResponse.md)

### Authorization


Configure BearerAuthOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

<a id="updatePaymentPsuData"></a>
# **updatePaymentPsuData**
> UpdatePaymentPsuData200Response updatePaymentPsuData(pushAccountinformationSubservice, subscriptionId, authorisationId, xRequestID, PSU_ID, psUIDType, psUCorporateID, psUCorporateIDType, tpPRedirectPreferred, tpPRedirectURI, tpPNokRedirectURI, clientNotificationURI, clientNotificationContentPreferred, digest, signature, tpPSignatureCertificate, psUIPAddress, psUIPPort, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUUserAgent, psUHttpMethod, psUDeviceID, psUGeoLocation, updatePaymentPsuDataRequest)

Update PSU data for subscription initiation

This methods updates PSU data on the authorisation resource if needed.  It may authorise a payment within the Embedded SCA Approach where needed.  Independently from the SCA Approach it supports e.g. the selection of  the authentication method and a non-SCA PSU authentication.  There are several possible update PSU data requests in the context of payment initiation services needed,  which depends on the SCA approach:  * Redirect SCA Approach:   A specific update PSU data request is applicable for      * the selection of authentication methods, before choosing the actual SCA approach. * Decoupled SCA Approach:   A specific update PSU data request is only applicable for   * adding the PSU identification, if not provided yet in the payment initiation request or the account information consent request, or if no OAuth2 access token is used, or   * the selection of authentication methods. * Embedded SCA Approach:    The Update PSU Data request might be used    * to add credentials as a first factor authentication data of the PSU and   * to select the authentication method and   * transaction authorisation.  The SCA Approach might depend on the chosen SCA method.  For that reason, the following possible Update PSU data request can apply to all SCA approaches:  * Select an SCA method in case of several SCA methods are available for the customer.  There are the following request types on this access path:   * Update PSU identification   * Update PSU authentication   * Select PSU authorization method      WARNING: This method needs a reduced header,      therefore many optional elements are not present.      Maybe in a later version the access path will change.   * Transaction authorisation     WARNING: This method needs a reduced header,      therefore many optional elements are not present.      Maybe in a later version the access path will change. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PushAccountInformationServiceApi()
val pushAccountinformationSubservice : kotlin.String = pushAccountinformationSubservice_example // kotlin.String | push-accountinformation-subservice: The addressed subservice endpoint, e.g. for push-account-entries. The default list of sub services supported in this standard is: * push-account-entries * push-account-statements * push-balances * push-requests-to-pay 
val subscriptionId : kotlin.String = subscriptionId_example // kotlin.String | subscriptionId as received in the body of a (positive) initiateSubscription response 
val authorisationId : kotlin.String = authorisationId_example // kotlin.String | Resource identification of the related SCA.
val xRequestID : java.util.UUID = 99391c7e-ad88-49ec-a2ad-99ddcb1f7721 // java.util.UUID | ID of the request, unique to the call, as determined by the initiating party.
val PSU_ID : kotlin.String = PSU-1234 // kotlin.String | Client ID of the PSU in the ASPSP client interface.   Might be mandated in the ASPSP's documentation.  It might be contained even if an OAuth2 based authentication was performed in a pre-step or an OAuth2 based SCA was performed in an preceding AIS service in the same session. In this case the ASPSP might check whether PSU-ID and token match,  according to ASPSP documentation. 
val psUIDType : kotlin.String = psUIDType_example // kotlin.String | Type of the PSU-ID, needed in scenarios where PSUs have several PSU-IDs as access possibility.  In this case, the mean and use are then defined in the ASPSP’s documentation. 
val psUCorporateID : kotlin.String = psUCorporateID_example // kotlin.String | Might be mandated in the ASPSP's documentation. Only used in a corporate context. 
val psUCorporateIDType : kotlin.String = psUCorporateIDType_example // kotlin.String | Might be mandated in the ASPSP's documentation. Only used in a corporate context. 
val tpPRedirectPreferred : kotlin.Boolean = true // kotlin.Boolean | If it equals \"true\", the TPP prefers a redirect over an embedded SCA approach. If it equals \"false\", the TPP prefers not to be redirected for SCA. The ASPSP will then choose between the Embedded or the Decoupled SCA approach, depending on the parameter TPP-Decoupled-Preferred and the choice of the SCA procedure by the TPP/PSU. If the parameter is not used, the ASPSP will choose the SCA approach to be applied depending on the SCA method chosen by the TPP/PSU. 
val tpPRedirectURI : java.net.URI = tpPRedirectURI_example // java.net.URI | URI of the TPP, where the transaction flow shall be redirected to after a Redirect.  Mandated for the Redirect SCA Approach, specifically  when TPP-Redirect-Preferred equals \"true\". It is recommended to always use this header field.  **Remark for Future:**  This field might be changed to mandatory in the next version of the specification. 
val tpPNokRedirectURI : java.net.URI = tpPNokRedirectURI_example // java.net.URI | If this URI is contained, the TPP is asking to redirect the transaction flow to this address instead of the TPP-Redirect-URI in case of a negative result of the redirect SCA method. This might be ignored by the ASPSP. 
val clientNotificationURI : kotlin.String = clientNotificationURI_example // kotlin.String | URI for the Endpoint of the TPP-API to which the status of the ressource to be created should be sent. This header field may by ignored by the ASPSP.  For security reasons, it shall be ensured that the Client-Notification-URI as introduced above is secured by the TPP eIDAS QWAC used for identification of the TPP. The following applies:  URIs which are provided by TPPs in Client-Notification-URI shall comply with the domain secured by the eIDAS QWAC certificate of the TPP in the field CN or SubjectAltName of the certificate. Please note that in case of example-TPP.com as certificate entry TPP- Notification-URI like www.example-TPP.com/xs2a-client/v1/ASPSPidentifcation/mytransaction- id/notifications or notifications.example-TPP.com/xs2a-client/v1/ASPSPidentifcation/mytransaction- id/notifications would be compliant.  Wildcard definitions shall be taken into account for compliance checks by the ASPSP.  ASPSPs may respond with ASPSP-Notification-Support set to false, if the provided URIs do not comply. 
val clientNotificationContentPreferred : kotlin.String = clientNotificationContentPreferred_example // kotlin.String | The string has the form   status=X1, ..., Xn  where Xi is one of the constants SCA, PROCESS, LAST and where constants are not repeated. The usage of the constants supports the of following semantics:    SCA: A notification on every change of the scaStatus attribute for all related authorisation processes is preferred by the TPP.    PROCESS: A notification on all changes of consentStatus or transactionStatus attributes is preferred by the TPP.   LAST: Only a notification on the last consentStatus or transactionStatus as available in the XS2A interface is preferred by the TPP.  This header field may be ignored, if the ASPSP does not support resource notification services for the related TPP. 
val digest : kotlin.String = SHA-256=hl1/Eps8BEQW58FJhDApwJXjGY4nr1ArGDHIT25vq6A= // kotlin.String | Is contained if and only if the \"Signature\" element is contained in the header of the request.
val signature : kotlin.String = keyId="SN=9FA1,CA=CN=D-TRUST%20CA%202-1%202015,O=D-Trust%20GmbH,C=DE",algorithm="rsa-sha256", headers="Digest X-Request-ID PSU-ID TPP-Redirect-URI Date", signature="Base64(RSA-SHA256(signing string))"
 // kotlin.String | A signature of the request by the TPP on application level. This might be mandated by ASPSP. 
val tpPSignatureCertificate : kotlin.ByteArray = BYTE_ARRAY_DATA_HERE // kotlin.ByteArray | The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained. 
val psUIPAddress : kotlin.String = 192.168.8.78 // kotlin.String | The forwarded IP Address header field consists of the corresponding http request IP Address field between PSU and TPP. 
val psUIPPort : kotlin.String = 1234 // kotlin.String | The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available. 
val psUAccept : kotlin.String = psUAccept_example // kotlin.String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
val psUAcceptCharset : kotlin.String = psUAcceptCharset_example // kotlin.String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
val psUAcceptEncoding : kotlin.String = psUAcceptEncoding_example // kotlin.String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
val psUAcceptLanguage : kotlin.String = psUAcceptLanguage_example // kotlin.String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
val psUUserAgent : kotlin.String = psUUserAgent_example // kotlin.String | The forwarded Agent header field of the HTTP request between PSU and TPP, if available. 
val psUHttpMethod : kotlin.String = psUHttpMethod_example // kotlin.String | HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE 
val psUDeviceID : java.util.UUID = 99435c7e-ad88-49ec-a2ad-99ddcb1f5555 // java.util.UUID | UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device. 
val psUGeoLocation : kotlin.String = GEO:52.506931;13.144558 // kotlin.String | The forwarded Geo Location of the corresponding http request between PSU and TPP if available. 
val updatePaymentPsuDataRequest : UpdatePaymentPsuDataRequest = {} // UpdatePaymentPsuDataRequest | 
try {
    val result : UpdatePaymentPsuData200Response = apiInstance.updatePaymentPsuData(pushAccountinformationSubservice, subscriptionId, authorisationId, xRequestID, PSU_ID, psUIDType, psUCorporateID, psUCorporateIDType, tpPRedirectPreferred, tpPRedirectURI, tpPNokRedirectURI, clientNotificationURI, clientNotificationContentPreferred, digest, signature, tpPSignatureCertificate, psUIPAddress, psUIPPort, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUUserAgent, psUHttpMethod, psUDeviceID, psUGeoLocation, updatePaymentPsuDataRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PushAccountInformationServiceApi#updatePaymentPsuData")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PushAccountInformationServiceApi#updatePaymentPsuData")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pushAccountinformationSubservice** | **kotlin.String**| push-accountinformation-subservice: The addressed subservice endpoint, e.g. for push-account-entries. The default list of sub services supported in this standard is: * push-account-entries * push-account-statements * push-balances * push-requests-to-pay  | [enum: push-account-entries, push-account-statements, push-balances, push-requests-to-pay]
 **subscriptionId** | **kotlin.String**| subscriptionId as received in the body of a (positive) initiateSubscription response  |
 **authorisationId** | **kotlin.String**| Resource identification of the related SCA. |
 **xRequestID** | **java.util.UUID**| ID of the request, unique to the call, as determined by the initiating party. |
 **PSU_ID** | **kotlin.String**| Client ID of the PSU in the ASPSP client interface.   Might be mandated in the ASPSP&#39;s documentation.  It might be contained even if an OAuth2 based authentication was performed in a pre-step or an OAuth2 based SCA was performed in an preceding AIS service in the same session. In this case the ASPSP might check whether PSU-ID and token match,  according to ASPSP documentation.  | [optional]
 **psUIDType** | **kotlin.String**| Type of the PSU-ID, needed in scenarios where PSUs have several PSU-IDs as access possibility.  In this case, the mean and use are then defined in the ASPSP’s documentation.  | [optional]
 **psUCorporateID** | **kotlin.String**| Might be mandated in the ASPSP&#39;s documentation. Only used in a corporate context.  | [optional]
 **psUCorporateIDType** | **kotlin.String**| Might be mandated in the ASPSP&#39;s documentation. Only used in a corporate context.  | [optional]
 **tpPRedirectPreferred** | **kotlin.Boolean**| If it equals \&quot;true\&quot;, the TPP prefers a redirect over an embedded SCA approach. If it equals \&quot;false\&quot;, the TPP prefers not to be redirected for SCA. The ASPSP will then choose between the Embedded or the Decoupled SCA approach, depending on the parameter TPP-Decoupled-Preferred and the choice of the SCA procedure by the TPP/PSU. If the parameter is not used, the ASPSP will choose the SCA approach to be applied depending on the SCA method chosen by the TPP/PSU.  | [optional]
 **tpPRedirectURI** | **java.net.URI**| URI of the TPP, where the transaction flow shall be redirected to after a Redirect.  Mandated for the Redirect SCA Approach, specifically  when TPP-Redirect-Preferred equals \&quot;true\&quot;. It is recommended to always use this header field.  **Remark for Future:**  This field might be changed to mandatory in the next version of the specification.  | [optional]
 **tpPNokRedirectURI** | **java.net.URI**| If this URI is contained, the TPP is asking to redirect the transaction flow to this address instead of the TPP-Redirect-URI in case of a negative result of the redirect SCA method. This might be ignored by the ASPSP.  | [optional]
 **clientNotificationURI** | **kotlin.String**| URI for the Endpoint of the TPP-API to which the status of the ressource to be created should be sent. This header field may by ignored by the ASPSP.  For security reasons, it shall be ensured that the Client-Notification-URI as introduced above is secured by the TPP eIDAS QWAC used for identification of the TPP. The following applies:  URIs which are provided by TPPs in Client-Notification-URI shall comply with the domain secured by the eIDAS QWAC certificate of the TPP in the field CN or SubjectAltName of the certificate. Please note that in case of example-TPP.com as certificate entry TPP- Notification-URI like www.example-TPP.com/xs2a-client/v1/ASPSPidentifcation/mytransaction- id/notifications or notifications.example-TPP.com/xs2a-client/v1/ASPSPidentifcation/mytransaction- id/notifications would be compliant.  Wildcard definitions shall be taken into account for compliance checks by the ASPSP.  ASPSPs may respond with ASPSP-Notification-Support set to false, if the provided URIs do not comply.  | [optional]
 **clientNotificationContentPreferred** | **kotlin.String**| The string has the form   status&#x3D;X1, ..., Xn  where Xi is one of the constants SCA, PROCESS, LAST and where constants are not repeated. The usage of the constants supports the of following semantics:    SCA: A notification on every change of the scaStatus attribute for all related authorisation processes is preferred by the TPP.    PROCESS: A notification on all changes of consentStatus or transactionStatus attributes is preferred by the TPP.   LAST: Only a notification on the last consentStatus or transactionStatus as available in the XS2A interface is preferred by the TPP.  This header field may be ignored, if the ASPSP does not support resource notification services for the related TPP.  | [optional]
 **digest** | **kotlin.String**| Is contained if and only if the \&quot;Signature\&quot; element is contained in the header of the request. | [optional]
 **signature** | **kotlin.String**| A signature of the request by the TPP on application level. This might be mandated by ASPSP.  | [optional]
 **tpPSignatureCertificate** | **kotlin.ByteArray**| The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained.  | [optional]
 **psUIPAddress** | **kotlin.String**| The forwarded IP Address header field consists of the corresponding http request IP Address field between PSU and TPP.  | [optional]
 **psUIPPort** | **kotlin.String**| The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available.  | [optional]
 **psUAccept** | **kotlin.String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptCharset** | **kotlin.String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptEncoding** | **kotlin.String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptLanguage** | **kotlin.String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUUserAgent** | **kotlin.String**| The forwarded Agent header field of the HTTP request between PSU and TPP, if available.  | [optional]
 **psUHttpMethod** | **kotlin.String**| HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE  | [optional] [enum: GET, POST, PUT, PATCH, DELETE]
 **psUDeviceID** | **java.util.UUID**| UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device.  | [optional]
 **psUGeoLocation** | **kotlin.String**| The forwarded Geo Location of the corresponding http request between PSU and TPP if available.  | [optional]
 **updatePaymentPsuDataRequest** | [**UpdatePaymentPsuDataRequest**](UpdatePaymentPsuDataRequest.md)|  | [optional]

### Return type

[**UpdatePaymentPsuData200Response**](UpdatePaymentPsuData200Response.md)

### Authorization


Configure BearerAuthOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

<a id="updateSubscriptionEntryPsuData"></a>
# **updateSubscriptionEntryPsuData**
> UpdatePaymentPsuData200Response updateSubscriptionEntryPsuData(pushAccountinformationSubservice, subscriptionId, subscriptionEntryId, authorisationId, xRequestID, PSU_ID, psUIDType, psUCorporateID, psUCorporateIDType, clientNotificationURI, clientNotificationContentPreferred, digest, signature, tpPSignatureCertificate, psUIPAddress, psUIPPort, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUUserAgent, psUHttpMethod, psUDeviceID, psUGeoLocation, updatePaymentPsuDataRequest)

Update PSU data for addition of a subscription entry initiation

This methods updates PSU data on the authorisation resource if needed.  It may authorise a payment within the Embedded SCA Approach where needed.  Independently from the SCA Approach it supports e.g. the selection of  the authentication method and a non-SCA PSU authentication.  There are several possible update PSU data requests in the context of payment initiation services needed,  which depends on the SCA approach:  * Redirect SCA Approach:   A specific update PSU data request is applicable for      * the selection of authentication methods, before choosing the actual SCA approach. * Decoupled SCA Approach:   A specific update PSU data request is only applicable for   * adding the PSU identification, if not provided yet in the payment initiation request or the account information consent request, or if no OAuth2 access token is used, or   * the selection of authentication methods. * Embedded SCA Approach:    The Update PSU Data request might be used    * to add credentials as a first factor authentication data of the PSU and   * to select the authentication method and   * transaction authorisation.  The SCA Approach might depend on the chosen SCA method.  For that reason, the following possible Update PSU data request can apply to all SCA approaches:  * Select an SCA method in case of several SCA methods are available for the customer.  There are the following request types on this access path:   * Update PSU identification   * Update PSU authentication   * Select PSU authorization method      WARNING: This method needs a reduced header,      therefore many optional elements are not present.      Maybe in a later version the access path will change.   * Transaction authorisation     WARNING: This method needs a reduced header,      therefore many optional elements are not present.      Maybe in a later version the access path will change. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PushAccountInformationServiceApi()
val pushAccountinformationSubservice : kotlin.String = pushAccountinformationSubservice_example // kotlin.String | push-accountinformation-subservice: The addressed subservice endpoint, e.g. for push-account-entries. The default list of sub services supported in this standard is: * push-account-entries * push-account-statements * push-balances * push-requests-to-pay 
val subscriptionId : kotlin.String = subscriptionId_example // kotlin.String | subscriptionId as received in the body of a (positive) initiateSubscription response 
val subscriptionEntryId : kotlin.String = subscriptionEntryId_example // kotlin.String | subscriptionEntryId as received in the body of a (positive) initiateSubscription or addSubscriptionEntry response 
val authorisationId : kotlin.String = authorisationId_example // kotlin.String | Resource identification of the related SCA.
val xRequestID : java.util.UUID = 99391c7e-ad88-49ec-a2ad-99ddcb1f7721 // java.util.UUID | ID of the request, unique to the call, as determined by the initiating party.
val PSU_ID : kotlin.String = PSU-1234 // kotlin.String | Client ID of the PSU in the ASPSP client interface.   Might be mandated in the ASPSP's documentation.  It might be contained even if an OAuth2 based authentication was performed in a pre-step or an OAuth2 based SCA was performed in an preceding AIS service in the same session. In this case the ASPSP might check whether PSU-ID and token match,  according to ASPSP documentation. 
val psUIDType : kotlin.String = psUIDType_example // kotlin.String | Type of the PSU-ID, needed in scenarios where PSUs have several PSU-IDs as access possibility.  In this case, the mean and use are then defined in the ASPSP’s documentation. 
val psUCorporateID : kotlin.String = psUCorporateID_example // kotlin.String | Might be mandated in the ASPSP's documentation. Only used in a corporate context. 
val psUCorporateIDType : kotlin.String = psUCorporateIDType_example // kotlin.String | Might be mandated in the ASPSP's documentation. Only used in a corporate context. 
val clientNotificationURI : kotlin.String = clientNotificationURI_example // kotlin.String | URI for the Endpoint of the TPP-API to which the status of the ressource to be created should be sent. This header field may by ignored by the ASPSP.  For security reasons, it shall be ensured that the Client-Notification-URI as introduced above is secured by the TPP eIDAS QWAC used for identification of the TPP. The following applies:  URIs which are provided by TPPs in Client-Notification-URI shall comply with the domain secured by the eIDAS QWAC certificate of the TPP in the field CN or SubjectAltName of the certificate. Please note that in case of example-TPP.com as certificate entry TPP- Notification-URI like www.example-TPP.com/xs2a-client/v1/ASPSPidentifcation/mytransaction- id/notifications or notifications.example-TPP.com/xs2a-client/v1/ASPSPidentifcation/mytransaction- id/notifications would be compliant.  Wildcard definitions shall be taken into account for compliance checks by the ASPSP.  ASPSPs may respond with ASPSP-Notification-Support set to false, if the provided URIs do not comply. 
val clientNotificationContentPreferred : kotlin.String = clientNotificationContentPreferred_example // kotlin.String | The string has the form   status=X1, ..., Xn  where Xi is one of the constants SCA, PROCESS, LAST and where constants are not repeated. The usage of the constants supports the of following semantics:    SCA: A notification on every change of the scaStatus attribute for all related authorisation processes is preferred by the TPP.    PROCESS: A notification on all changes of consentStatus or transactionStatus attributes is preferred by the TPP.   LAST: Only a notification on the last consentStatus or transactionStatus as available in the XS2A interface is preferred by the TPP.  This header field may be ignored, if the ASPSP does not support resource notification services for the related TPP. 
val digest : kotlin.String = SHA-256=hl1/Eps8BEQW58FJhDApwJXjGY4nr1ArGDHIT25vq6A= // kotlin.String | Is contained if and only if the \"Signature\" element is contained in the header of the request.
val signature : kotlin.String = keyId="SN=9FA1,CA=CN=D-TRUST%20CA%202-1%202015,O=D-Trust%20GmbH,C=DE",algorithm="rsa-sha256", headers="Digest X-Request-ID PSU-ID TPP-Redirect-URI Date", signature="Base64(RSA-SHA256(signing string))"
 // kotlin.String | A signature of the request by the TPP on application level. This might be mandated by ASPSP. 
val tpPSignatureCertificate : kotlin.ByteArray = BYTE_ARRAY_DATA_HERE // kotlin.ByteArray | The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained. 
val psUIPAddress : kotlin.String = 192.168.8.78 // kotlin.String | The forwarded IP Address header field consists of the corresponding http request IP Address field between PSU and TPP. 
val psUIPPort : kotlin.String = 1234 // kotlin.String | The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available. 
val psUAccept : kotlin.String = psUAccept_example // kotlin.String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
val psUAcceptCharset : kotlin.String = psUAcceptCharset_example // kotlin.String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
val psUAcceptEncoding : kotlin.String = psUAcceptEncoding_example // kotlin.String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
val psUAcceptLanguage : kotlin.String = psUAcceptLanguage_example // kotlin.String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
val psUUserAgent : kotlin.String = psUUserAgent_example // kotlin.String | The forwarded Agent header field of the HTTP request between PSU and TPP, if available. 
val psUHttpMethod : kotlin.String = psUHttpMethod_example // kotlin.String | HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE 
val psUDeviceID : java.util.UUID = 99435c7e-ad88-49ec-a2ad-99ddcb1f5555 // java.util.UUID | UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device. 
val psUGeoLocation : kotlin.String = GEO:52.506931;13.144558 // kotlin.String | The forwarded Geo Location of the corresponding http request between PSU and TPP if available. 
val updatePaymentPsuDataRequest : UpdatePaymentPsuDataRequest = {} // UpdatePaymentPsuDataRequest | 
try {
    val result : UpdatePaymentPsuData200Response = apiInstance.updateSubscriptionEntryPsuData(pushAccountinformationSubservice, subscriptionId, subscriptionEntryId, authorisationId, xRequestID, PSU_ID, psUIDType, psUCorporateID, psUCorporateIDType, clientNotificationURI, clientNotificationContentPreferred, digest, signature, tpPSignatureCertificate, psUIPAddress, psUIPPort, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUUserAgent, psUHttpMethod, psUDeviceID, psUGeoLocation, updatePaymentPsuDataRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PushAccountInformationServiceApi#updateSubscriptionEntryPsuData")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PushAccountInformationServiceApi#updateSubscriptionEntryPsuData")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pushAccountinformationSubservice** | **kotlin.String**| push-accountinformation-subservice: The addressed subservice endpoint, e.g. for push-account-entries. The default list of sub services supported in this standard is: * push-account-entries * push-account-statements * push-balances * push-requests-to-pay  | [enum: push-account-entries, push-account-statements, push-balances, push-requests-to-pay]
 **subscriptionId** | **kotlin.String**| subscriptionId as received in the body of a (positive) initiateSubscription response  |
 **subscriptionEntryId** | **kotlin.String**| subscriptionEntryId as received in the body of a (positive) initiateSubscription or addSubscriptionEntry response  |
 **authorisationId** | **kotlin.String**| Resource identification of the related SCA. |
 **xRequestID** | **java.util.UUID**| ID of the request, unique to the call, as determined by the initiating party. |
 **PSU_ID** | **kotlin.String**| Client ID of the PSU in the ASPSP client interface.   Might be mandated in the ASPSP&#39;s documentation.  It might be contained even if an OAuth2 based authentication was performed in a pre-step or an OAuth2 based SCA was performed in an preceding AIS service in the same session. In this case the ASPSP might check whether PSU-ID and token match,  according to ASPSP documentation.  | [optional]
 **psUIDType** | **kotlin.String**| Type of the PSU-ID, needed in scenarios where PSUs have several PSU-IDs as access possibility.  In this case, the mean and use are then defined in the ASPSP’s documentation.  | [optional]
 **psUCorporateID** | **kotlin.String**| Might be mandated in the ASPSP&#39;s documentation. Only used in a corporate context.  | [optional]
 **psUCorporateIDType** | **kotlin.String**| Might be mandated in the ASPSP&#39;s documentation. Only used in a corporate context.  | [optional]
 **clientNotificationURI** | **kotlin.String**| URI for the Endpoint of the TPP-API to which the status of the ressource to be created should be sent. This header field may by ignored by the ASPSP.  For security reasons, it shall be ensured that the Client-Notification-URI as introduced above is secured by the TPP eIDAS QWAC used for identification of the TPP. The following applies:  URIs which are provided by TPPs in Client-Notification-URI shall comply with the domain secured by the eIDAS QWAC certificate of the TPP in the field CN or SubjectAltName of the certificate. Please note that in case of example-TPP.com as certificate entry TPP- Notification-URI like www.example-TPP.com/xs2a-client/v1/ASPSPidentifcation/mytransaction- id/notifications or notifications.example-TPP.com/xs2a-client/v1/ASPSPidentifcation/mytransaction- id/notifications would be compliant.  Wildcard definitions shall be taken into account for compliance checks by the ASPSP.  ASPSPs may respond with ASPSP-Notification-Support set to false, if the provided URIs do not comply.  | [optional]
 **clientNotificationContentPreferred** | **kotlin.String**| The string has the form   status&#x3D;X1, ..., Xn  where Xi is one of the constants SCA, PROCESS, LAST and where constants are not repeated. The usage of the constants supports the of following semantics:    SCA: A notification on every change of the scaStatus attribute for all related authorisation processes is preferred by the TPP.    PROCESS: A notification on all changes of consentStatus or transactionStatus attributes is preferred by the TPP.   LAST: Only a notification on the last consentStatus or transactionStatus as available in the XS2A interface is preferred by the TPP.  This header field may be ignored, if the ASPSP does not support resource notification services for the related TPP.  | [optional]
 **digest** | **kotlin.String**| Is contained if and only if the \&quot;Signature\&quot; element is contained in the header of the request. | [optional]
 **signature** | **kotlin.String**| A signature of the request by the TPP on application level. This might be mandated by ASPSP.  | [optional]
 **tpPSignatureCertificate** | **kotlin.ByteArray**| The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained.  | [optional]
 **psUIPAddress** | **kotlin.String**| The forwarded IP Address header field consists of the corresponding http request IP Address field between PSU and TPP.  | [optional]
 **psUIPPort** | **kotlin.String**| The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available.  | [optional]
 **psUAccept** | **kotlin.String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptCharset** | **kotlin.String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptEncoding** | **kotlin.String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptLanguage** | **kotlin.String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUUserAgent** | **kotlin.String**| The forwarded Agent header field of the HTTP request between PSU and TPP, if available.  | [optional]
 **psUHttpMethod** | **kotlin.String**| HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE  | [optional] [enum: GET, POST, PUT, PATCH, DELETE]
 **psUDeviceID** | **java.util.UUID**| UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device.  | [optional]
 **psUGeoLocation** | **kotlin.String**| The forwarded Geo Location of the corresponding http request between PSU and TPP if available.  | [optional]
 **updatePaymentPsuDataRequest** | [**UpdatePaymentPsuDataRequest**](UpdatePaymentPsuDataRequest.md)|  | [optional]

### Return type

[**UpdatePaymentPsuData200Response**](UpdatePaymentPsuData200Response.md)

### Authorization


Configure BearerAuthOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

