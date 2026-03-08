# Eureka Server — Design

Purpose: service registry for service discovery across the microservices platform.

Responsibilities

- Register service instances and provide discovery endpoints
- Provide a dashboard for runtime instance visibility

Key components

- Spring Cloud Netflix Eureka Server
- `@EnableEurekaServer` application class

Integration points

- All microservices register with Eureka (api-gateway, accounts, transfers, ledgers)

Design notes

- Keep Eureka resilient with clustering for production (multiple instances behind a load balancer)
- Secure access to the dashboard in non-development environments
