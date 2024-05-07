package org.example.migration;

import org.flywaydb.core.Flyway;

public class FlywayMigration {
    private void flywayMigration(String connectionUrl, String username, String password) {
        Flyway flyway = Flyway
                .configure()
                .dataSource(connectionUrl, username, password)
                .load();
        flyway.migrate();
    }
}
