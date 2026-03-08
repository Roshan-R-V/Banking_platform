# Ledgers Service — Requirements

Runtime

- Java 17

Build

- Maven (use `./mvnw`)

Configuration

- `spring.datasource.*` for MySQL
- `spring.application.name=ledgers`
- `eureka.client.serviceUrl.defaultZone` — Eureka server URL

Testing

- Unit tests via Spring Boot Test; use Testcontainers for integration tests against MySQL

Operational

- Ensure backups and retention policies for ledger data
- Use separate DB/schema for ledger to simplify backups and retention
