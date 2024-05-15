
# PushAccountEntryParameters

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**acceptedFormat** | [**kotlin.Any**](kotlin.Any.md) |  | 
**accountEntryCriteria** | [**AccountEntryTriggerCriteria**](AccountEntryTriggerCriteria.md) |  |  [optional]
**preferredAttributes** | **kotlin.collections.List&lt;kotlin.String&gt;** | These attributes are the preferred ones for every account entry to be pushed. The ASPSP might ignore this preference. Only attributes of the first level of Type Transactions as defined in [XS2A-IG] might be used. |  [optional]
**documentsPreferred** | **kotlin.Boolean** | RFU: This data element indicates that the API Client prefers to also receive documents attached to an account entry. This data attribute might be ignored by the ASPSP. |  [optional]



