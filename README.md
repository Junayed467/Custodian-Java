# Custodian Java

[![Build](https://github.com/Junayed467/Custodian-Java/actions/workflows/java-ci.yml/badge.svg)](https://github.com/Junayed467/Custodian-Java/actions)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)

A clean Spring Boot 3 / Java 17 backend starter for tracking asset usage in organizations.

## Quick Start
```bash
mvn spring-boot:run
```

## Tech
- Spring Boot 3.3, Java 17
- Web, Security, Data JPA, Validation
- H2 for dev/tests; PostgreSQL ready
- CI: GitHub Actions (runs tests on each push)

## Project Structure
- `controller/` — REST endpoints
- `security/` — security config (permit /api/health)
- `resources/` — app configs
- `test/` — minimal context test using `application-test.properties`
