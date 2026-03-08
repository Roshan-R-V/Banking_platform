# API Gateway — Requirements

Runtime

- Java 17

Build

- Maven (use `./mvnw`)

Configuration

- `spring.application.name=api-gateway`
- Route configuration (application properties or config server)
- `eureka.client.serviceUrl.defaultZone` — Eureka server URL
- Ports: configure `server.port`

Testing

- Unit tests with Spring Boot Test; integration tests that depend on downstream services should be mocked or use test doubles

Operational

- Consider adding API keys / OAuth at the gateway layer for client authentication
- Add request/response logging and metrics
