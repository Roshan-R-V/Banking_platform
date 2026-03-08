# Ledgers Service — Design

Purpose: record ledger entries for transactions and maintain immutable ledger history.

Responsibilities

- Create and persist ledger entries for transfers
- Provide query endpoints for ledger history and reconciliation
- Register with Eureka for discovery

Key components

- Controllers for ledger APIs
- Services for business rules and persistence orchestration
- JPA repositories for persistence to MySQL

Integration points

- MySQL for persistence
- Other services (transfers, accounts) to receive transaction events or calls

Design notes

- Use append-only ledger entries where possible for auditability
- Consider event sourcing for future enhancements
