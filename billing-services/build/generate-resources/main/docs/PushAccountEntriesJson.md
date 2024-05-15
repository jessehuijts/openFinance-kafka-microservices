
# PushAccountEntriesJson

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account** | [**AccountReference**](AccountReference.md) |  | 
**debitAccounting** | **kotlin.Boolean** | If true, the amounts of debits on the reports are quoted positive with the related consequence for balances. If false, the amount of debits on the reports are quoted negative. |  [optional]
**dateTimeLastPush** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**staticCallbackText** | **kotlin.String** |  |  [optional]
**links** | [**kotlin.collections.Map&lt;kotlin.String, HrefType&gt;**](HrefType.md) | A _link object containing any link types.  |  [optional]
**transactions** | [**LeanAccountReport**](LeanAccountReport.md) |  |  [optional]



