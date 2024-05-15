
# StartScaprocessResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scaStatus** | [**ScaStatus**](ScaStatus.md) |  | 
**authorisationId** | **kotlin.String** | Resource identification of the related SCA. | 
**links** | [**LinksStartScaProcess**](LinksStartScaProcess.md) |  | 
**scaMethods** | [**kotlin.collections.List&lt;AuthenticationObject&gt;**](AuthenticationObject.md) | This data element might be contained, if SCA is required and if the PSU has a choice between different authentication methods.  Depending on the risk management of the ASPSP this choice might be offered before or after the PSU has been identified with the first relevant factor, or if an access token is transported.  If this data element is contained, then there is also a hyperlink of type &#39;startAuthorisationWithAuthenticationMethodSelection&#39; contained in the response body.  These methods shall be presented towards the PSU for selection by the TPP.  |  [optional]
**chosenScaMethod** | [**AuthenticationObject**](AuthenticationObject.md) |  |  [optional]
**challengeData** | [**ChallengeData**](ChallengeData.md) |  |  [optional]
**psuMessage** | **kotlin.String** | Text to be displayed to the PSU. |  [optional]


