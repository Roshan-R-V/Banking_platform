# Transfers Service — Design

Purpose: orchestrate money transfers between accounts and coordinate ledger updates.

Responsibilities

- Validate transfer requests and ensure sufficient funds
- Initiate ledger entries and notify account balances updates
- Persist transfer records to MySQL
- Register with Eureka for discovery

Key components

- Controllers for transfer APIs
- Services to enforce business rules and transactional boundaries
- Repositories for persistence

Integration points

- Accounts service to check/update balances
- Ledgers service to record immutable entries
- MySQL for persistence

Design notes

- Ensure idempotency for transfer endpoints
- Prefer transactional boundaries or saga patterns for distributed transactions
