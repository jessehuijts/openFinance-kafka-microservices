
# AddSubscriptionEntryJsonSubscriptionEntry

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountId** | [**AccountReference**](AccountReference.md) |  | 
**apiClientPrimaryPushURI** | **kotlin.String** |  | 
**pushAccountEntryParameters** | [**PushAccountEntryParameters**](PushAccountEntryParameters.md) |  | 
**pushAccountStatementParameters** | [**PushAccountStatementParameters**](PushAccountStatementParameters.md) |  | 
**pushBalanceParameters** | [**PushBalanceParameters**](PushBalanceParameters.md) |  | 
**pushRtpParameters** | [**PushRtpParameters**](PushRtpParameters.md) |  | 
**validUntil** | [**kotlin.Any**](kotlin.Any.md) |  |  [optional]
**subscriptionEntryName** | **kotlin.String** |  |  [optional]
**subscriptionEntryId** | **kotlin.String** | Forbidden in an Initiate Subscription Request and in an Add a Subscription Entry Request by the TPP (as this is assigned by the ASPSP). Mandatory in each entry of a response from an ASPSP. |  [optional]
**apiClientSecondaryPushURI** | **kotlin.String** |  |  [optional]
**callbackWithLinkPrefered** | **kotlin.Boolean** | API Client prefers to receive hyperlinks pointing to the related account information element if the related subservice criteria are met. |  [optional]
**callbackWithStaticTextPrefered** | **kotlin.Boolean** | API Client prefers to get informed by static text if the related subservice criteria are met. |  [optional]
**staticCallbackText** | **kotlin.String** |  |  [optional]



