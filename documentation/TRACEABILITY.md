# Assignment 8 Traceability Mapping

## 1. Overview

Traceability ensures Assignment 8 behavior models are not isolated artifacts. The state and activity diagrams in Assignment 8 directly extend requirements and Agile planning outputs from prior assignments, so each modeled object/workflow can be traced back to:

- functional requirements (FR-xx)
- user stories (US-xxx)
- sprint backlog tasks (T-xxx)

This mapping validates continuity from requirements -> stories -> sprint implementation tasks -> behavioral design models.

## 2. State Diagram Traceability

| State Diagram | Related Functional Requirement(s) | Related User Story ID(s) | Related Sprint Task(s) | Notes |
|---------------|-----------------------------------|---------------------------|-------------------------|-------|
| User Account | FR-01 | US-001, US-002, US-011, US-013 | T-001, T-002, T-003, T-004, T-008, T-012 | Account lifecycle (registration, verification, lock/deactivation) maps to onboarding, authentication security, and role-controlled access groundwork. |
| Booking | FR-03, FR-04 | US-004, US-009, US-012 | T-006, T-010, T-012 (+ future ops tasks for lifecycle controls) | Booking states from draft to completion/no-show align with booking creation and downstream operational handling. |
| Queue Entry | FR-04 | US-005, US-006, US-009 | T-007, T-011, T-012 (+ future queue-monitoring tasks) | Queue token lifecycle and progression states directly realize virtual queue joining and live queue advancement behavior. |
| Service | FR-02, FR-06 | US-003, US-008 | T-005, T-009 (+ future admin service-maintenance tasks) | Service state changes (draft/active/unavailable/archived) represent customer catalog visibility plus admin service governance. |
| Notification | FR-05 | US-007, US-012 | T-006, T-007, T-012 (+ future notification dispatch tasks) | Notification delivery states support booking/queue/customer-status communication and retry/failure handling. |
| Report | FR-07, FR-06 | US-010 | T-012 (+ future reporting and dashboard analytics tasks) | Report request/generation/view-export states preserve reporting behavior with validation and failure paths. |
| Authentication Session | FR-01 | US-002, US-011, US-013 | T-001, T-003, T-004, T-008, T-012 | Session states (anonymous/authenticating/active/expired/terminated) model secure access control and session management. |
| GitHub Issue / Work Item | FR-01 to FR-07 (implementation governance linkage) | US-001 to US-013 (delivery tracking linkage) | T-001 to T-012 | Work-item lifecycle mirrors Assignment 6 backlog-to-sprint execution flow, ensuring engineering traceability for all feature areas. |

## 3. Activity Diagram Traceability

| Activity Diagram | Related Functional Requirement(s) | Related User Story ID(s) | Related Sprint Task(s) | Notes |
|------------------|-----------------------------------|---------------------------|-------------------------|-------|
| Register Account | FR-01 | US-001 | T-001, T-002, T-003, T-008, T-012 | Captures registration + verification workflow and validation/error loops from story acceptance criteria. |
| Authenticate User | FR-01 | US-002, US-013, US-011 | T-001, T-003, T-004, T-008, T-012 | Models credential validation, lockout path, optional MFA, and session creation behaviors. |
| Browse Service Catalog | FR-02 | US-003 | T-005, T-009, T-012 | Represents catalog load/filter/detail flow for active services and customer decision points before booking. |
| Create Booking | FR-03 | US-004, US-012 | T-006, T-010, T-012 | Reflects slot validation, provisional booking path, confirmation, and customer feedback behavior. |
| Join Virtual Queue | FR-04 | US-005 | T-007, T-011, T-012 | Maps queue eligibility/capacity checks to queue ticket assignment and ETA communication. |
| View Queue Position | FR-04 | US-006 | T-007, T-011, T-012 (+ future live-refresh UX tasks) | Describes iterative queue refresh loop and ready-for-service transition logic. |
| Manage Services | FR-02, FR-06 | US-008 | T-005, T-009 (+ future admin CRUD hardening tasks) | Models owner/admin service update lifecycle with validation, authorization, and audit logging. |
| Manage Bookings and Queue | FR-04, FR-06, FR-07 | US-009, US-010 | T-006, T-007, T-012 (+ future operations dashboard tasks) | Captures staff/admin actions, transition validation, queue recalculation, notifications, and reporting event logs. |
