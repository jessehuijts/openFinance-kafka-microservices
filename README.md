# openFinance-kafka-microservice


## Summary
Implementation of a Berlin Group openFinance API for push account notifications. A third party payment provider will 
subscribe at a financial institution on behalf of the user, so that the user can receive push events. There are 2 
microservices involved: `subscription-service` and the `billing-service`. For every subscription the bank will store
it in the database and emit an event towards the broker. A listener to the topic will pick up the event and will 
generate an invoice, which in turn is also stored and emitted to an invoice topic

## Get Started

To see it in action:

```shell
git clone https://github.com/jessehuijts/openFinance-kafka-microservice.git
```

Make a `.env` file in the root of the 2 modules, and define values for:
- DB_USER
- DB_PASSWORD
- DB_NAME
- DB_URL
- POSTGRES_USER
- POSTGRES_DB
- POSTGRES_PASSWORD

Then we will run 3 times

```shell
docker compose-up
```

One time from the root of the project to start Kafka, and 2 times from the root of the 
modules to start the `Postgres` databases.

Now we need to start the spring boot applications. From the root of every module run the
executable:

```shell
/bin/bash ./run
```

## Play around
Now you are ready to play around with it. Use Postman or another tool you like to make a request to this
endpoint: `POST/http://localhost:8881/subscriptions/push-balances`.

Send the following example payload:

```json
{
    "accountId": {
        "iban": "FR7612345987650123456789014",
        "bban": "BARC12345612345678",
        "pan": "5409050000000000",
        "maskedPan": "123456xxxxxx1234",
        "msisdn": "+49 170 1234567",
        "other": {
            "identification": "string",
            "schemeNameCode": "string",
            "schemeNameProprietary": "string",
            "issuer": "string"
        },
        "currency": "EUR",
        "cashAccountType": "string"
    },
    "apiClientPrimaryPushURI": "string",
    "pushAccountEntryParameters": null,
    "pushAccountStatementParameters": null,
    "pushBalanceParameters": {
        "balanceCriteria": {
            "balanceAmount": {
                "currency": "EUR",
                "amount": "0.0"
            },
            "balanceOperator": "less",
            "balanceType": "interimAvailable",
            "creditLimitIncluded": null,
            "times": null
        }
    },
    "pushRtpParameters": null,
    "validUntil": "2024-05-04",
    "subscriptionEntryName": "string",
    "subscriptionEntryId": "string",
    "apiClientSecondaryPushURI": "string",
    "callbackWithLinkPrefered": true,
    "callbackWithStaticTextPrefered": true,
    "staticCallbackText": "string"
}
```

You should get back the `subscriptionId`

Next up verify if it was correctly stored in the database by making a request to `GET/http://localhost:8881/subscriptions/push-balances`

Now comes the good stuff. Go to `http://localhost:8081/ui` to see the Kafka topics and verify if you see your message.

Finally make a request to the `GET/http://localhost:8882/invoices` endpoint. You should see the billing information. 



