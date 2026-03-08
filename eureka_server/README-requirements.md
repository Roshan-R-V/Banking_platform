# Eureka Server — Requirements

Runtime

- Java 17

Build

- Maven (use `./mvnw`)

Configuration

- `spring.application.name=eureka-server`
- `server.port` for each instance
- For production: cluster configuration and peer URLs

Operational

- Secure the dashboard and endpoints; restrict access to trusted networks or via authentication
- Monitor registry size and instance heartbeat health
