
# BalanceTriggerCriteria

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**balanceAmount** | [**BalanceTriggerCriteriaBalanceAmount**](BalanceTriggerCriteriaBalanceAmount.md) |  |  [optional]
**balanceOperator** | [**inline**](#BalanceOperator) | Must be one of the folowing codes: * less, * lessOrEqual, * equal, * greaterOrEqual, * greater |  [optional]
**balanceType** | [**kotlin.Any**](kotlin.Any.md) |  |  [optional]
**creditLimitIncluded** | **kotlin.Boolean** | This criterion is fulfilled if the related current balance is provided with the credit limit included (if this attribute is true) or not (if this attribute is false). If the attribute is true and if the related balance type defined above is not applicable to the condition whether a credit limit is included then the subscription is rejected with a dedicated error code. |  [optional]
**times** | [**kotlin.Any**](kotlin.Any.md) |  |  [optional]


<a id="BalanceOperator"></a>
## Enum: balanceOperator
Name | Value
---- | -----
balanceOperator | less, lessOrEqual, equal, greaterOrEqual, greater



