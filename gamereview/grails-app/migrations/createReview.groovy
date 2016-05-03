databaseChangeLog = {

    changeSet(author: "istia (generated)", id: "1462253447766-1") {
        createTable(tableName: "company") {
            column(autoIncrement: "true", name: "id", type: "BIGINT") {
                constraints(primaryKey: "true", primaryKeyName: "companyPK")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "date_established", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "description", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "employee_number", type: "INT") {
                constraints(nullable: "false")
            }

            column(name: "name", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "istia (generated)", id: "1462253447766-2") {
        createTable(tableName: "employee") {
            column(autoIncrement: "true", name: "id", type: "BIGINT") {
                constraints(primaryKey: "true", primaryKeyName: "employeePK")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "check_in", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "check_out", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "image", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "name", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "istia (generated)", id: "1462253447766-3") {
        createTable(tableName: "game") {
            column(autoIncrement: "true", name: "id", type: "BIGINT") {
                constraints(primaryKey: "true", primaryKeyName: "gamePK")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "description", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "name", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "price", type: "DOUBLE") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "istia (generated)", id: "1462253447766-4") {
        createTable(tableName: "review") {
            column(autoIncrement: "true", name: "id", type: "BIGINT") {
                constraints(primaryKey: "true", primaryKeyName: "reviewPK")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "game_id", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "review_date", type: "timestamp") {
                constraints(nullable: "false")
            }

            column(name: "review_text", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "istia (generated)", id: "1462253447766-5") {
        addForeignKeyConstraint(baseColumnNames: "game_id", baseTableName: "review", constraintName: "FK_ka3n6pdh6x0tqq9s0pi6tetmc", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "game")
    }
}
