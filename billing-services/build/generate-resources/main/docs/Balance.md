
# Balance

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**balanceAmount** | [**Amount**](Amount.md) |  | 
**balanceType** | [**BalanceType**](BalanceType.md) |  | 
**creditLimitIncluded** | **kotlin.Boolean** | A flag indicating if the credit limit of the corresponding account  is included in the calculation of the balance, where applicable.  |  [optional]
**lastChangeDateTime** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | This data element might be used to indicate e.g. with the expected or booked balance that no action is known  on the account, which is not yet booked.  |  [optional]
**referenceDate** | [**java.time.LocalDate**](java.time.LocalDate.md) | Indicates the date of the balance. |  [optional]
**lastCommittedTransaction** | **kotlin.String** | \&quot;entryReference\&quot; of the last committed transaction to support the TPP in identifying whether all  PSU transactions are already known.  |  [optional]



