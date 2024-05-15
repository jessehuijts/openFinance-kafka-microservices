
# EntryDetailsElement

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionAmount** | [**Amount**](Amount.md) |  | 
**endToEndId** | **kotlin.String** | Unique end to end identity. |  [optional]
**mandateId** | **kotlin.String** | Identification of Mandates, e.g. a SEPA Mandate ID. |  [optional]
**checkId** | **kotlin.String** | Identification of a Cheque. |  [optional]
**creditorId** | **kotlin.String** | Identification of Creditors, e.g. a SEPA Creditor ID. |  [optional]
**currencyExchange** | [**kotlin.collections.List&lt;ReportExchangeRate&gt;**](ReportExchangeRate.md) | Array of exchange rates. |  [optional]
**creditorName** | **kotlin.String** | Creditor name. |  [optional]
**creditorAccount** | [**AccountReference**](AccountReference.md) |  |  [optional]
**creditorAgent** | **kotlin.String** | BICFI  |  [optional]
**ultimateCreditor** | **kotlin.String** | Ultimate creditor. |  [optional]
**debtorName** | **kotlin.String** | Debtor name. |  [optional]
**debtorAccount** | [**AccountReference**](AccountReference.md) |  |  [optional]
**debtorAgent** | **kotlin.String** | BICFI  |  [optional]
**ultimateDebtor** | **kotlin.String** | Ultimate debtor. |  [optional]
**remittanceInformationUnstructured** | **kotlin.String** | Unstructured remittance information.  |  [optional]
**remittanceInformationUnstructuredArray** | **kotlin.collections.List&lt;kotlin.String&gt;** | Array of unstructured remittance information.  |  [optional]
**remittanceInformationStructured** | [**RemittanceInformationStructured**](RemittanceInformationStructured.md) |  |  [optional]
**remittanceInformationStructuredArray** | [**kotlin.collections.List&lt;RemittanceInformationStructured&gt;**](RemittanceInformationStructured.md) | Array of structured remittance information.  |  [optional]
**purposeCode** | [**PurposeCode**](PurposeCode.md) |  |  [optional]



