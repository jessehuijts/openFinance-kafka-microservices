package com.pushNotification.account

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import com.pushNotification.account.database.*
import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.transactions.transaction
import org.jetbrains.exposed.sql.*

@SpringBootApplication
class App

fun main(args: Array<String>) {

	val dbUser = System.getenv("DB_USER")
	val dbPass = System.getenv("DB_PASSWORD")
	val dbUrl = System.getenv("DB_URL")

	Database.connect(dbUrl, driver = "org.postgresql.Driver", user = dbUser, password = dbPass)

	transaction {
		addLogger(StdOutSqlLogger)

		SchemaUtils.drop(SubscriptionTable)
		SchemaUtils.create(SubscriptionTable)
	}

	runApplication<App>(*args)
	print("starting processing subscription application..")
}

