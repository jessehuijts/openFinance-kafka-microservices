package com.pushNotification.account

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import com.pushNotification.account.database.*
import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.transactions.transaction
import org.jetbrains.exposed.sql.*

@SpringBootApplication
class AccountApplication

fun main(args: Array<String>) {

	val dbUrl = "jdbc:postgresql://localhost:5432/demo_db"
	val dbUser = "demo_dev_rw"
	val dbPass = "dev_database_passwd"

	Database.connect(dbUrl, driver = "org.postgresql.Driver", user = dbUser, password = dbPass)

	transaction {
		addLogger(StdOutSqlLogger)

		SchemaUtils.drop(SubscriptionTable)
		SchemaUtils.create(SubscriptionTable)
	}

	runApplication<AccountApplication>(*args)
	print("start account application...")
}

