# API Gateway — Design

Purpose: central entry point for external clients, routing requests to downstream services and enforcing cross-cutting concerns.

Responsibilities

- Route requests to services (accounts, transfers, ledgers)
- Provide centralized authentication/authorization (future)
- Apply rate limiting, request filtering, and path-based routing
- Register with Eureka for discovery of downstream services

Key components

- Spring Cloud Gateway (WebMVC variant in this project)
- Route definitions (properties or Java configuration)
- Filters for authentication, logging, and header enrichment

Integration points

- Eureka server for discovering downstream services
- Downstream microservices (accounts, transfers, ledgers)

Design notes

- Prefer centralized security at gateway; keep downstream services lightweight
- Use reactive filters only if gateway is migrated to reactive stack; current dependency is gateway-server-webmvc
