# Contributing to Carwash Booking Queue System

## Welcome

Thank you for your interest in contributing to the **Web-Based Car Wash Booking and Queue Management System**. This project demonstrates how a car wash business can digitize service discovery, booking, and queue management so customers can view available services, join or schedule queues, and track service progress more efficiently.

Contributions are welcome from students, maintainers, and external open-source contributors. Whether you are improving documentation, adding tests, refining the API, or implementing new features, your contribution helps strengthen the project as a practical learning and collaboration platform.

## Development Setup

### Prerequisites

Before working on the project, install the following tools:

- Java 21
- Spring boot
- Maven
- Git
- Docker

### Clone Repository

```bash
git clone https://github.com/ongeziwe17/carwash-booking-queue-system.git
cd carwash-booking-queue-system
```

### Build

```bash
./mvnw clean package
```

### Run Tests

```bash
./mvnw test
```

### Run Application

```bash
./mvnw spring-boot:run
```

## Coding Standards

Please follow these standards when contributing:

- Follow the existing package structure and naming conventions.
- Write meaningful commit messages that describe the intent of the change.
- Add or update tests for new functionality and bug fixes.
- Ensure the CI pipeline passes before requesting review.
- Use standard Java naming conventions for classes, methods, variables, and packages.
- Keep methods focused, readable, and maintainable.
- Prefer small, reviewable pull requests over large unrelated changes.

## Pull Request Process

1. Fork the repository.
2. Create a feature branch (feaure/name-of-branch) from the latest development branch (develop).
3. Implement the change with clear, focused commits.
4. Add or update tests and documentation where applicable.
5. Submit a Pull Request with a clear summary and testing notes.
6. Wait for the maintainer to review and address requested changes.

## Good First Issues

New contributors can start by looking for issues labeled:

- `good-first-issue`
- `feature-request`

Good first contributions may include improving validation messages, refining README examples, enhancing Swagger descriptions, or adding small API improvements. If you are unsure where to start, comment on an open issue and ask for guidance.
