# Accounts Service — Next Steps

Priority tasks

- Add integration tests with Testcontainers for MySQL to run CI without external DB
- Add database migrations (Flyway or Liquibase)
- Harden input validation and error handling in controllers
- Add health indicators and readiness/liveness probes

Improvements

- Add request/response DTO mapping (MapStruct or explicit mappers)
- Add metrics and tracing (Micrometer + distributed tracing)
- Add security (JWT/OAuth) at API gateway or service layer

Operational

- Create Dockerfile for container builds
- Add CI job to build and run unit tests
- Document run instructions in top-level README
