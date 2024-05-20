package com.billing

import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.SchemaUtils
import org.jetbrains.exposed.sql.StdOutSqlLogger
import org.jetbrains.exposed.sql.addLogger
import org.jetbrains.exposed.sql.transactions.transaction
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import com.billing.database.BillingTable

@SpringBootApplication
class App

fun main(args: Array<String>) {

    val dbUrl = System.getenv("DB_URL")
    val dbUser = System.getenv("DB_USER")
    val dbPass = System.getenv("DB_PASSWORD")

    Database.connect(dbUrl, driver = "org.postgresql.Driver", user = dbUser, password = dbPass)

    transaction {
        addLogger(StdOutSqlLogger)

        SchemaUtils.drop(BillingTable)
        SchemaUtils.create(BillingTable)
    }

    runApplication<App>(*args)
    print("starting processing billing application..")
}

