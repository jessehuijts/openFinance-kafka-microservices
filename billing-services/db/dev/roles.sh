#!/bin/bash

# Create the role
psql -c "CREATE ROLE $DB_USER WITH LOGIN PASSWORD '$DB_PASSWORD'"

# Grant all privileges on the database to the role
psql -c "GRANT ALL PRIVILEGES ON DATABASE $DB_NAME TO $DB_USER"

echo "The role '$DB_USER' has been created and granted all privileges on the '$DB_NAME' database."