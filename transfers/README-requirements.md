# Transfers Service — Requirements

Runtime

- Java 17

Build

- Maven (use `./mvnw`)

Configuration

- `spring.datasource.*` for MySQL
- `spring.application.name=transfers`
- `eureka.client.serviceUrl.defaultZone` — Eureka server URL

Testing

- Unit tests with Spring Boot Test; integration tests require DB or Testcontainers

Operational

- Ensure idempotency keys for requests
- Add monitoring for failed transfers and compensate/retry logic
