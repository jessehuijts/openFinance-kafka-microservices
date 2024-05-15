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

    val dbUrl = "jdbc:postgresql://localhost:5432/demo_db"
    val dbUser = "demo_dev_rw"
    val dbPass = "dev_database_passwd"

    Database.connect(dbUrl, driver = "org.postgresql.Driver", user = dbUser, password = dbPass)

    transaction {
        addLogger(StdOutSqlLogger)

        SchemaUtils.drop(BillingTable)
        SchemaUtils.create(BillingTable)
    }

    runApplication<App>(*args)
    print("starting processing billing application..")
}

