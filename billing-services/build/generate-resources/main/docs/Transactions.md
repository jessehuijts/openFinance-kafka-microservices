
# Transactions

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionAmount** | [**Amount**](Amount.md) |  | 
**transactionId** | **kotlin.String** | This identification is given by the attribute transactionId of the corresponding entry of a transaction list.  |  [optional]
**entryReference** | **kotlin.String** | Is the identification of the transaction as used e.g. for reference for deltafunction on application level. The same identification as for example used within camt.05x messages.  |  [optional]
**endToEndId** | **kotlin.String** | Unique end to end identity. |  [optional]
**batchIndicator** | **kotlin.Boolean** | If this indicator equals true, then the related entry is a batch entry.  |  [optional]
**batchNumberOfTransactions** | **kotlin.Int** | Shall be used if and only if the batchIndicator is contained and equals true.  |  [optional]
**mandateId** | **kotlin.String** | Identification of Mandates, e.g. a SEPA Mandate ID. |  [optional]
**checkId** | **kotlin.String** | Identification of a Cheque. |  [optional]
**creditorId** | **kotlin.String** | Identification of Creditors, e.g. a SEPA Creditor ID. |  [optional]
**bookingDate** | [**java.time.LocalDate**](java.time.LocalDate.md) | The date when an entry is posted to an account on the ASPSPs books.  |  [optional]
**valueDate** | [**java.time.LocalDate**](java.time.LocalDate.md) | The Date at which assets become available to the account owner in case of a credit, or cease to be available to the account owner in case of a debit entry. **Usage:** If entry status is pending and value date is present, then the value date refers to an expected/requested value date. |  [optional]
**currencyExchange** | [**kotlin.collections.List&lt;ReportExchangeRate&gt;**](ReportExchangeRate.md) | Array of exchange rates. |  [optional]
**creditorName** | **kotlin.String** | Creditor name. |  [optional]
**creditorAdditionalInformation** | [**AdditionalPartyInformation**](AdditionalPartyInformation.md) |  |  [optional]
**creditorAccount** | [**AccountReference**](AccountReference.md) |  |  [optional]
**creditorAgent** | **kotlin.String** | BICFI  |  [optional]
**ultimateCreditor** | **kotlin.String** | Ultimate creditor. |  [optional]
**ultimateCreditorAdditionalInformation** | [**AdditionalPartyInformation**](AdditionalPartyInformation.md) |  |  [optional]
**debtorName** | **kotlin.String** | Debtor name. |  [optional]
**debtorAccount** | [**AccountReference**](AccountReference.md) |  |  [optional]
**debtorAgent** | **kotlin.String** | BICFI  |  [optional]
**ultimateDebtor** | **kotlin.String** | Ultimate debtor. |  [optional]
**remittanceInformationUnstructured** | **kotlin.String** | Unstructured remittance information.  |  [optional]
**remittanceInformationUnstructuredArray** | **kotlin.collections.List&lt;kotlin.String&gt;** | Array of unstructured remittance information.  |  [optional]
**remittanceInformationStructured** | **kotlin.String** | Structured remittance information Max  |  [optional]
**remittanceInformationStructuredArray** | [**kotlin.collections.List&lt;RemittanceInformationStructured&gt;**](RemittanceInformationStructured.md) | Array of structured remittance information.  |  [optional]
**entryDetails** | [**kotlin.collections.List&lt;EntryDetailsElement&gt;**](EntryDetailsElement.md) | Might be used by the ASPSP to transport details about transactions within a batch.  |  [optional]
**additionalInformation** | **kotlin.String** | Might be used by the ASPSP to transport additional transaction related information to the PSU  |  [optional]
**additionalInformationStructured** | [**AdditionalInformationStructured**](AdditionalInformationStructured.md) |  |  [optional]
**purposeCode** | [**PurposeCode**](PurposeCode.md) |  |  [optional]
**bankTransactionCode** | **kotlin.String** | Bank transaction code as used by the ASPSP and using the sub elements of this structured code defined by ISO 20022.   This code type is concatenating the three ISO20022 Codes    * Domain Code,    * Family Code, and    * SubFamily Code  by hyphens, resulting in &#39;DomainCode&#39;-&#39;FamilyCode&#39;-&#39;SubFamilyCode&#39;. For standing order reports the following codes are applicable:   * \&quot;PMNT-ICDT-STDO\&quot; for credit transfers,   * \&quot;PMNT-IRCT-STDO\&quot;  for instant credit transfers   * \&quot;PMNT-ICDT-XBST\&quot; for cross-border credit transfers   * \&quot;PMNT-IRCT-XBST\&quot; for cross-border real time credit transfers and   * \&quot;PMNT-MCOP-OTHR\&quot; for specific standing orders which have a dynamical amount to move left funds e.g. on month end to a saving account  |  [optional]
**proprietaryBankTransactionCode** | **kotlin.String** | Proprietary bank transaction code as used within a community or within an ASPSP e.g.  for MT94x based transaction reports.  |  [optional]
**balanceAfterTransaction** | [**Balance**](Balance.md) |  |  [optional]
**links** | [**LinksTransactionDetails**](LinksTransactionDetails.md) |  |  [optional]



