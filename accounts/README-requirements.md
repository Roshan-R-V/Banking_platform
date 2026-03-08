# Accounts Service — Requirements

Runtime

- Java 17 (project `java.version` = 17)
- MySQL available at runtime (configurable via Spring properties)

Build

- Maven (use the provided wrapper `./mvnw` / `mvnw.cmd`)
- `mvnw clean package` to build the service

Configuration

- `spring.datasource.url` — JDBC URL to MySQL
- `spring.datasource.username` / `spring.datasource.password`
- `spring.application.name=accounts`
- `eureka.client.serviceUrl.defaultZone` — Eureka server URL
- `server.port` — service port (override per environment)

Environment variables suggested

- `SPRING_DATASOURCE_URL`
- `SPRING_DATASOURCE_USERNAME`
- `SPRING_DATASOURCE_PASSWORD`
- `EUREKA_SERVER_URI`

Testing

- Unit tests use Spring Boot Test; run with `./mvnw test` (integration tests may require external DB)

Secrets & data

- Use environment-based secrets or a secret store for DB credentials; do not commit credentials in properties files.
