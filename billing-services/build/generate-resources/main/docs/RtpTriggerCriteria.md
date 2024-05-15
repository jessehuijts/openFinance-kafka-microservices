
# RtpTriggerCriteria

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event** | [**inline**](#Event) | \&quot;afterReception\&quot; is the only supported value. |  [optional]
**timeToExpire** | **kotlin.Int** | Only forward incoming RTP with an expiry timestamp within that period, where the period is defined by the number of minutes as provided in this attribute. This criterion is meant to forward only short term RTPs. |  [optional]
**expiryReminder** | **kotlin.Boolean** | This criterion is fulfilled if a long term RTP is still not confirmed 2 days before the RTP expires. |  [optional]


<a id="Event"></a>
## Enum: event
Name | Value
---- | -----
event | afterReception



