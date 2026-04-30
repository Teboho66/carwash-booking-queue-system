# carwash-booking-queue-system

A Web-Based Car Wash Booking and Queue Management System

## Overview

The Web-Based Car Wash Booking and Queue Management System is a software platform designed to improve how car wash services manage customer queues and service availability. Many small car wash businesses rely on manual walk-in systems where customers must physically wait in line without knowing queue length or estimated waiting times. This often results in inefficient service management and poor customer experience.

This system introduces a digital platform that allows customers to view available car wash services, check queue length, and join a service queue remotely. At the same time, car wash businesses can manage service queues, update job statuses, and monitor daily workload through a centralized interface.

## Purpose of the Project

The purpose of this project is to design and demonstrate a digital system that improves queue visibility and operational efficiency for car wash businesses. The system will provide a structured way for customers and service providers to interact through a web-based platform.

The project is being developed as part of the **Software Engineering System Specification and Architectural Modeling assignment**, where the system will be fully documented and modelled using the **C4 architectural model**.

## System Goals

The system aims to:

- Provide customers with visibility into available car wash services
- Allow customers to join or schedule service queues digitally
- Enable car wash businesses to manage bookings and service flow
- Improve operational efficiency and customer experience
- Demonstrate a scalable system architecture that can support future expansion

## Core System Features

The initial system prototype will support:

- Customer registration and login
- Vehicle registration
- Car wash business registration
- Service listing and pricing management
- Digital queue and booking management
- Service status updates
- Customer ratings and feedback

## Project Documentation

Detailed system documentation and architecture diagrams are available in the following files:

- [System Specification](documentation/SPECIFICATION.md)
- [System Architecture](documentation/ARCHITECTURE.md)
- [Stakeholder Analysis](documentation/STAKEHOLDER-ANALYSIS.md)
- [System Requirements](documentation/SYSTEM-REQUIREMENTS.md)
- [Reflection](documentation/REFLECTION.md)
- [Use Case Diagram](documentation/USE-CASE-DIAGRAM.md)
- [Use Case Specifications](documentation/USE-CASE-SPECIFICATION.md)
- [Test Case Development](documentation/TEST-CASES.md)
- [Agile User Stories](documentation/USER-STORIES.md)
- [Product Backlog](documentation/PRODUCT-BACKLOG.md)
- [Sprint Planning](documentation/SPRINT-PLAN.md)
- [Template Analysis](documentation/TEMPLATE-ANALYSIS.md)
- [Kanban Explanation](documentation/KANBAN-EXPLANATION.md)
- [Object State Modeling](documentation/STATE-DIAGRAMS.md)
- [Activity Workflow Modeling](documentation/ACTIVITY-DIAGRAMS.md)
- [Traceability Mapping](documentation/TRACEABILITY.md)
- [Domain Model](documentation/DOMAIN-MODEL.md)
- [Class Diagram](documentation/CLASS-DIAGRAM.md)

## Technology Stack (Planned)

The system will be developed using the following technologies:

**Core Application**

- Backend / API: Java Spring Boot
- Database: PostgreSQL
- Frontend: Vue.js or React (Web-based interface)

**DevOps and Deployment (Optional Extension)**

- Containerization: Docker
- Infrastructure Provisioning: Terraform
- Cloud Hosting: AWS
- CI/CD: GitHub Actions

**Architecture Modeling**

- C4 Model using Mermaid diagrams

## Project Status

## From Class Diagrams to Code

For Class Diagrams to Code with All Creational Patterns, Java 21 and Spring Boot with Maven were selected because they align with the planned backend and API implementation approach for this system. The implementation work translates the Domain Modeling and Class Diagram Development Mermaid class diagram into concrete Java classes in the project domain model. In addition, all required creational design patterns were implemented to demonstrate multiple object-creation strategies in a domain-relevant way. Unit tests were added to validate these pattern implementations and support maintainable evolution of the codebase.

### Source Code Structure

```text
src/main/java/com/carwash/
├── domain/
├── enums/
└── creational_patterns/
    ├── simple_factory/
    ├── factory_method/
    ├── abstract_factory/
    ├── builder/
    ├── prototype/
    └── singleton/
```

### Creational Pattern Rationale

| Pattern | Implementation | Purpose |
|--------|----------------|---------|
| Simple Factory | VehicleFactory | Centralizes creation of vehicle-type objects |
| Factory Method | Notification sender factories | Delegates notification sender creation to concrete factories |
| Abstract Factory | Dashboard component factories | Creates related role-based dashboard component families |
| Builder | BookingBuilder | Builds booking objects step-by-step with validation |
| Prototype | ServicePrototypeRegistry | Clones reusable service templates |
| Singleton | ApplicationConfig | Provides one shared application configuration instance |

Although not every creational pattern would be required in a small MVP, all six patterns were implemented because Class Diagrams to Code with All Creational Patterns requires them. Each pattern was adapted to the car wash booking and queue management domain where possible.

### Testing and Coverage

Run unit tests:

```bash
mvn clean test
```

Generate unit test coverage report:

```bash
mvn clean test jacoco:report
```

Coverage report output:

```text
target/site/jacoco/index.html
```

### GitHub Project Update Note

Class Diagrams to Code with All Creational Patterns implementation and testing tasks were tracked using GitHub Issues. Related issues were moved through the GitHub Project Kanban workflow as work progressed. Completed implementation and testing items should be moved to **Done** where applicable, and any defects or improvements identified during testing should be captured as new issues for follow-up.
