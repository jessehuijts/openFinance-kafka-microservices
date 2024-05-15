
# Error400PushAISASPSP

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**java.net.URI**](java.net.URI.md) | A URI reference [RFC3986] that identifies the problem type.  Remark For Future: These URI will be provided by NextGenPSD2 in future.  | 
**code** | [**MessageCode400PushAISASPSP**](MessageCode400PushAISASPSP.md) |  | 
**title** | **kotlin.String** | Short human readable description of error type.  Could be in local language.  To be provided by ASPSPs.  |  [optional]
**detail** | **kotlin.String** | Detailed human readable text specific to this instance of the error.  XPath might be used to point to the issue generating the error in addition. Remark for Future: In future, a dedicated field might be introduced for the XPath.  |  [optional]
**additionalErrors** | [**kotlin.collections.List&lt;Error400PushAISASPSPAdditionalErrorsInner&gt;**](Error400PushAISASPSPAdditionalErrorsInner.md) | Array of Error Information Blocks.  Might be used if more than one error is to be communicated  |  [optional]
**links** | [**LinksAll**](LinksAll.md) |  |  [optional]



