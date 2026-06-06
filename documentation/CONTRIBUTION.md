# Contributing to Carwash Booking Queue System

Thank you for your interest in contributing to the **Carwash Booking Queue System**. This repository is a Java/Spring Boot learning project that models a web-based car wash service catalog, booking flow, and queue-management API.

## Project Overview

### What the system does

The application helps a car wash business manage:

- Users and customer profiles
- Vehicles linked to customers
- Car wash services, pricing, and estimated duration
- Bookings for future service times
- Queue entries and queue status transitions

The current implementation exposes REST APIs for these workflows and stores data through repository abstractions backed by in-memory repositories. This makes the project easy to run locally and approachable for first-time contributors.

### Technology stack

- Java 21
- Spring Boot
- Maven / Maven Wrapper
- Spring Web MVC
- springdoc OpenAPI / Swagger UI
- JUnit and Spring Boot test support
- GitHub Actions for CI/CD
- Dockerfile for container builds

### Current project status

The project is a working educational prototype. The core domain model, repository interfaces, service layer, REST controllers, Swagger/OpenAPI setup, CI workflow, and test suite are present. The best contribution opportunities are currently small improvements around documentation, validation, API consistency, exception responses, service edge cases, and test coverage.

## Development Setup

### Prerequisites

Install the following before you start:

- Java 21
- Maven, or use the included Maven Wrapper (`./mvnw`)
- Spring Boot knowledge for backend API work
- Git

### Clone the repository

```bash
git clone https://github.com/ongeziwe17/carwash-booking-queue-system.git
cd carwash-booking-queue-system
```

### Build the project

```bash
./mvnw clean install
```

### Run the application

```bash
./mvnw spring-boot:run
```

After the app starts, Swagger UI is available at:

```text
http://localhost:8080/swagger-ui/index.html
```

The OpenAPI JSON is available at:

```text
http://localhost:8080/v3/api-docs
```

## Running Tests

Run the automated test suite with:

```bash
./mvnw test
```

Before opening a pull request, make sure the tests pass locally. If you add behavior, update or add tests for that behavior.

## Contribution Workflow

1. **Select an issue.** Choose an issue that matches your experience level. New contributors should start with `good-first-issue` or documentation/testing tasks.
2. **Comment on the issue.** Leave a short comment saying you would like to work on it so maintainers and other contributors know it is in progress.
3. **Create a feature branch.** Use a focused branch name, for example `feature/improve-booking-validation` or `docs/update-api-examples`.
4. **Implement changes.** Keep the pull request small and focused on one issue.
5. **Add or update tests.** Include unit or integration tests for bug fixes, validation changes, and API behavior changes.
6. **Ensure CI passes.** Run `./mvnw test` locally and check the GitHub Actions result after opening the PR.
7. **Submit a Pull Request.** Include a clear summary, testing notes, and the issue number it resolves.

## Recommended Starter Areas

### Documentation improvements

Documentation contributions are a great first step. Useful tasks include improving endpoint examples, documenting request/response payloads, updating setup instructions, and clarifying architecture diagrams.

### Unit testing

The service layer has useful validations and state transitions that can be tested in small, focused JUnit tests. Good starter tests include null request handling, duplicate records, queue transitions, and repository filtering behavior.

### Validation improvements

Several API request DTOs are plain records without Bean Validation annotations. Contributors can add `jakarta.validation` constraints, use `@Valid` in controllers, and improve validation error messages.

### API enhancements

REST APIs are implemented, but there are opportunities to make endpoint summaries, response annotations, filtering options, and request examples more consistent.

### Exception handling

The global exception handler exists, but validation errors can be made more contributor- and client-friendly by returning field-specific messages rather than a generic exception string.

## Pull Request Guidelines

- Keep pull requests small and reviewable.
- Follow the existing Java package structure and naming conventions.
- Avoid unrelated formatting changes.
- Add tests for new behavior or bug fixes.
- Update documentation when API behavior changes.
- Use clear commit messages, preferably following a conventional style such as `docs:`, `test:`, `fix:`, or `feat:`.

## Suggested Labels for Maintainers

Useful labels for onboarding external contributors include:

- `good-first-issue`
- `help-wanted`
- `enhancement`
- `documentation`
- `testing`
- `validation`
- `api`
- `bug`
- `ci`
- `refactor`

## Need Help?

If you are unsure where to start, comment on an issue and ask for guidance. Maintainer (**ongeziwe17**) should be able to point you to a small file or test class where the change can begin.
