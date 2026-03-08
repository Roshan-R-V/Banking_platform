# Ledgers Service — Next Steps

Priority

- Add DB migrations (Flyway/Liquibase) and include migration checks in CI
- Add integration tests (Testcontainers) for ledger persistence
- Add monitoring and alerts for write failures and abnormal latency

Improvements

- Consider event-driven ingestion for ledger entries (Kafka or messaging)
- Add reconciler jobs to ensure ledger/account consistency

Operational

- Containerize and add to deployment pipeline
- Document recovery procedures for ledger data
