
# SubscriptionInitiationJson

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**subscriptionEntries** | [**SubscriptionInitiationJsonSubscriptionEntries**](SubscriptionInitiationJsonSubscriptionEntries.md) |  | 
**encryptionSupported** | **kotlin.Boolean** | If the flag is set to false, no encryption is provided by the ASPSP. If the flag is set to true, the ASPSP can choose to support encryption. |  [optional]
**encryptionCertificate** | **kotlin.String** | The certificate to be used for encryption by the ASPSP in base64 encoding. If not provided, no encryption will be provided. |  [optional]



