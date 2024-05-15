
# ChallengeData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**image** | **kotlin.ByteArray** | PNG data (max. 512 kilobyte) to be displayed to the PSU, Base64 encoding, cp. [RFC4648]. This attribute is used only, when PHOTO_OTP or CHIP_OTP is the selected SCA method.  |  [optional]
**&#x60;data&#x60;** | **kotlin.collections.List&lt;kotlin.String&gt;** | A collection of strings as challenge data. |  [optional]
**imageLink** | **kotlin.String** | A link where the ASPSP will provides the challenge image for the TPP. |  [optional]
**otpMaxLength** | **kotlin.Int** | The maximal length for the OTP to be typed in by the PSU. |  [optional]
**otpFormat** | [**inline**](#OtpFormat) | The format type of the OTP to be typed in. The admitted values are \&quot;characters\&quot; or \&quot;integer\&quot;. |  [optional]
**additionalInformation** | **kotlin.String** | Additional explanation for the PSU to explain e.g. fallback mechanism for the chosen SCA method. The TPP is obliged to show this to the PSU.  |  [optional]


<a id="OtpFormat"></a>
## Enum: otpFormat
Name | Value
---- | -----
otpFormat | characters, integer



