# Use Case Diagram

## 1. Use Case Diagram

The following UML-style use case diagram models the MVP interactions for the **Web-Based Car Wash Booking and Queue Management System**, aligned with the functional requirements from Assignment 4 (FR-01 to FR-07).

```mermaid
usecaseDiagram
  title Web-Based Car Wash Booking and Queue Management System (MVP)

  actor Customer as C
  actor "Business Owner" as BO
  actor "Service Staff" as SS
  actor "System Administrator" as SA
  actor "IT Support" as IT
  actor "Platform Owner" as PO

  rectangle "Car Wash Booking and Queue Platform" {
    (Register Account) as UC1
    (Authenticate User) as UC2
    (Browse Service Catalog) as UC3
    (Create Booking) as UC4
    (Join Virtual Queue) as UC5
    (View Queue Position) as UC6
    (Receive Booking Notifications) as UC7
    (Manage Services) as UC8
    (Manage Bookings and Queue) as UC9
    (Update Service Status) as UC10
    (View Admin Dashboard) as UC11
    (Generate Basic Reports) as UC12
    (Monitor System Health) as UC13
    (Manage Users and Roles) as UC14
    (Maintain Platform Configuration) as UC15
  }

  C --> UC1
  C --> UC2
  C --> UC3
  C --> UC4
  C --> UC5
  C --> UC6
  C --> UC7

  BO --> UC2
  BO --> UC8
  BO --> UC9
  BO --> UC11
  BO --> UC12

  SS --> UC2
  SS --> UC9
  SS --> UC10

  SA --> UC11
  SA --> UC13
  SA --> UC14

  IT --> UC13
  IT --> UC15

  PO --> UC12
  PO --> UC13

  UC4 ..> UC2 : <<include>>
  UC4 ..> UC3 : <<include>>
  UC5 ..> UC2 : <<include>>
  UC5 ..> UC6 : <<include>>
  UC9 ..> UC10 : <<include>>
  UC11 ..> UC12 : <<include>>

  UC7 ..> UC4 : <<extend>>
  UC7 ..> UC5 : <<extend>>
  UC12 ..> UC11 : <<extend>>
```

## 2. Explanation

### 2.1 Key actors and roles

- **Customer** uses the platform to register, sign in, browse available services, create bookings, join the queue, and monitor queue status.
- **Business Owner** controls service offerings and operations through booking/queue management and reporting views.
- **Service Staff** executes day-to-day queue work by updating service progress and booking status.
- **System Administrator** ensures controlled access and platform governance through user/role administration and dashboard visibility.
- **IT Support** maintains technical continuity by monitoring system health and handling platform configuration.
- **Platform Owner** uses reporting and health indicators to evaluate adoption and overall product performance.

### 2.2 Relationships between actors and use cases

The diagram maps all major stakeholders identified in Assignment 4 to concrete interactions in the MVP:

- **Customer-facing flow** centers on FR-01, FR-02, FR-03, FR-04, and FR-05.
- **Operations flow** for Business Owner and Service Staff centers on FR-02, FR-04, and FR-06.
- **Governance and oversight flow** for System Administrator, IT Support, and Platform Owner supports FR-06 and FR-07 while reinforcing NFR reliability and maintainability concerns.

### 2.3 `<<include>>` and `<<extend>>` modeling choices

- `Create Booking` **includes** `Authenticate User` and `Browse Service Catalog`, because these are mandatory sub-behaviors for a valid booking flow.
- `Join Virtual Queue` **includes** `Authenticate User` and `View Queue Position`, representing required queue context for users.
- `Manage Bookings and Queue` **includes** `Update Service Status`, because status progression is part of queue execution in operations.
- `View Admin Dashboard` **includes** `Generate Basic Reports`, since dashboard visibility depends on report aggregates.
- `Receive Booking Notifications` **extends** both `Create Booking` and `Join Virtual Queue`, because notification behavior is conditional and event-driven.
- `Generate Basic Reports` **extends** `View Admin Dashboard` to represent deeper analytics access that is initiated from dashboard activity.

### 2.4 Alignment with Assignment 3 and Assignment 4

This use case model remains consistent with the architecture and scope defined in Assignment 3 by keeping to MVP functions (booking, queue, service management, and basic reporting) without introducing out-of-scope capabilities such as payments or loyalty programs.

It also directly reflects Assignment 4 stakeholder concerns by:

- reducing customer uncertainty through booking, queue visibility, and notifications,
- improving business operational control through service and queue workflows,
- supporting service staff task clarity through status updates,
- and enabling administrative and technical oversight for reliability, maintainability, and platform monitoring.
