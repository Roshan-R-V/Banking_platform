# Accounts Service — Design

Purpose: manage customer accounts and balances for the banking platform.

Responsibilities

- CRUD on accounts (create, read, update, delete)
- Expose REST endpoints for account lookup and balance queries
- Persist account state to MySQL via Spring Data JPA
- Register with Eureka for service discovery

Key components

- Controllers: REST endpoints handling HTTP requests
- Services: business logic and transaction orchestration
- Repositories: JPA repositories to access MySQL
- Models: domain objects for Account and Balance

Integration points

- Eureka server: service registration/discovery
- MySQL: persistence (runtime dependency: `mysql-connector-j`)
- Other services: communicates with `transfers` and `ledgers` as needed

Ports & endpoints (examples)

- `/api/accounts` — account management
- `/api/accounts/{id}/balance` — balance enquiry

Design notes

- Uses Spring Boot 3.x and Java 17
- Domain consistency handled in service layer; avoid direct controller persistence logic
- DTOs used for API inputs/outputs to keep domain model encapsulated
