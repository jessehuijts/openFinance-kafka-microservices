    package com.pushNotification.account

    import org.springframework.http.ResponseEntity.ok
    import org.springframework.http.HttpStatus
    import org.springframework.web.bind.annotation.*
    import org.openapitools.client.models.AddSubscriptionEntryJsonSubscriptionEntry
    import org.springframework.http.ResponseEntity
    import com.pushNotification.account.database.*

    @RestController
    @RequestMapping("/subscriptions/push-balances")
    class AccountApplicationController(
        val subscriptionService: SubscriptionService ){

        @GetMapping
        fun getAllSubscriptions(): ResponseEntity<Any?> {
            val list = SubscriptionTable.getAll()
        return ResponseEntity(list, HttpStatus.OK)
        }
        @PostMapping
        fun newSubscription(@RequestBody subscriptionEntry: AddSubscriptionEntryJsonSubscriptionEntry  ) =
            ok().body(subscriptionService.createSubscription(subscriptionEntry))
    }