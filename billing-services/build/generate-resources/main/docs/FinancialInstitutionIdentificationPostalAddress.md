
# FinancialInstitutionIdentificationPostalAddress

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**addressLines** | **kotlin.collections.List&lt;kotlin.String&gt;** | At most seven entries are permitted. May only be used, if none of the structured address elements \&quot;streetName\&quot;, \&quot;buildingNumber\&quot;, \&quot;postcode\&quot; or \&quot;townName\&quot; is used. Remark: For SEPA transactions this is further restricted to a maximum of 2 entries. |  [optional]
**streetName** | **kotlin.String** |  |  [optional]
**buildingNumber** | **kotlin.String** |  |  [optional]
**postCode** | **kotlin.String** |  |  [optional]
**townName** | **kotlin.String** |  |  [optional]
**country** | [**PostalAddressAllOfCountry**](PostalAddressAllOfCountry.md) |  |  [optional]



