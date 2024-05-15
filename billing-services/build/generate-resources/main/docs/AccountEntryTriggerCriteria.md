
# AccountEntryTriggerCriteria

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bankTransactionCodePatterns** | **kotlin.collections.List&lt;kotlin.String&gt;** | The criterion is fulfilled if the bankTransactionCode of the related account entry matches one of the bank transaction codes or code patterns (see the following paragraph) defined by this list. Any particle of the Bank Transaction Code triple might be replaced by the \&quot;????\&quot; character, indicating that all sub family codes apply. However, at least one particle of the triple must be stated explicitly (e.g. \&quot;????-CCRD-????\&quot;). |  [optional]
**proprietaryBankCodes** | **kotlin.collections.List&lt;kotlin.String&gt;** | The criterion is fulfilled if the proprietaryBankTransactionCode of the related account entry equals one of the proprietary bank transaction codes defined by this list. |  [optional]
**accountEntryStatus** | [**kotlin.Any**](kotlin.Any.md) |  |  [optional]
**maximumAmount** | [**AccountEntryTriggerCriteriaMaximumAmount**](AccountEntryTriggerCriteriaMaximumAmount.md) |  |  [optional]
**minimumAmount** | [**AccountEntryTriggerCriteriaMinimumAmount**](AccountEntryTriggerCriteriaMinimumAmount.md) |  |  [optional]
**debtorAccount** | [**AccountEntryTriggerCriteriaDebtorAccount**](AccountEntryTriggerCriteriaDebtorAccount.md) |  |  [optional]
**creditorAccount** | [**AccountEntryTriggerCriteriaCreditorAccount**](AccountEntryTriggerCriteriaCreditorAccount.md) |  |  [optional]
**creditDebitIndicator** | [**kotlin.Any**](kotlin.Any.md) |  |  [optional]
**purpose** | [**kotlin.Any**](kotlin.Any.md) |  |  [optional]
**remittanceinformationUnstructured** | [**kotlin.Any**](kotlin.Any.md) |  |  [optional]



