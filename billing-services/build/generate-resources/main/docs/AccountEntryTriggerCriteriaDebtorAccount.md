
# AccountEntryTriggerCriteriaDebtorAccount

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**iban** | **kotlin.String** | IBAN of an account. |  [optional]
**bban** | **kotlin.String** | Basic Bank Account Number (BBAN) Identifier.  This data element can be used in the body of the consent request.   Message for retrieving account access consent from this account. This   data elements is used for payment accounts which have no IBAN.   ISO20022: Basic Bank Account Number (BBAN).       Identifier used nationally by financial institutions, i.e., in individual countries,    generally as part of a National Account Numbering Scheme(s),    which uniquely identifies the account of a customer.  |  [optional]
**pan** | **kotlin.String** | Primary Account Number according to ISO/IEC 7812.  |  [optional]
**maskedPan** | **kotlin.String** | Masked Primary Account Number.  |  [optional]
**msisdn** | **kotlin.String** | Mobile phone number. |  [optional]
**other** | [**OtherType**](OtherType.md) |  |  [optional]
**currency** | **kotlin.String** | ISO 4217 Alpha 3 currency code.  |  [optional]
**cashAccountType** | **kotlin.String** | ExternalCashAccountType1Code from ISO 20022.  |  [optional]



