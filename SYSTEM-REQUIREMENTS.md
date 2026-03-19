# System Requirements Document (SRD)

## Web-Based Car Wash Booking and Queue Management System

**Version:** 1.0
**Date:** March 2026
**Status:** Draft

---

## 1. Introduction

### 1.1 Project Overview

This document defines the system requirements for a Web-Based Car Wash Booking and Queue Management System. The system aims to digitize traditional car wash operations by allowing customers to book services online, join a virtual queue, and track their service status, while enabling business owners to manage bookings and operations efficiently.

---

### 1.2 Purpose

The purpose of this document is to outline the functional and non-functional requirements of the system. It serves as a reference for system design, development, and evaluation throughout the Capstone project.

---

### 1.3 Scope

The system will include:

- A web-based interface for customers to book services and join queues
- An administrative interface for managing bookings and services
- A backend system for handling business logic and data storage

The project will focus on core features such as booking, queue management, and basic administration.

---

## 2. Stakeholder Analysis Summary

| Stakeholder | Role | Key Concerns | Success Metrics |
|-------------|------|--------------|-----------------|
| Customer | Books services and joins queues | Convenience, waiting time, usability | Reduced waiting time, easy booking |
| Business Owner | Manages services and operations | Efficiency, control over bookings | Increased bookings, better workflow |
| Service Staff | Performs car wash services | Clear task flow, manageable workload | Smooth operations, fewer errors |
| System Administrator | Maintains system | Reliability, security | System uptime, data protection |
| IT Support | Maintains technical setup | Stability, issue resolution | Minimal downtime |
| Platform Owner | Oversees system usage | Adoption and usefulness | Increased user engagement |

---

## 3. Functional Requirements

### FR1: User Registration and Authentication

**Description:**  
The system shall allow users to register and log in securely.

**Acceptance Criteria:**

- Users can register using email and password
- Users can log in and log out
- The system validates user input
- Duplicate accounts are prevented

---

### FR2: Service Catalog

**Description:**
The system shall allow users to view available car wash services.

**Acceptance Criteria:**

- Services include name, description, and price
- Admin can create, update, and delete services
- Customers can view services before booking

---

### FR3: Booking System

**Description:**  
The system shall allow users to book a time slot for a car wash.

**Acceptance Criteria:**

- Users can select date and time
- The system prevents double bookings
- Users can cancel bookings
- Booking confirmation is displayed

---

### FR4: Queue Management

**Description:**
The system shall allow users to join and view a virtual queue.

**Acceptance Criteria:**

- Users can join a queue
- Users can view their position in the queue
- The system displays estimated waiting time
- Admin can update queue status

---

### FR5: Notifications

**Description:**  
The system shall notify users about their bookings.

**Acceptance Criteria:**

- Email confirmation is sent after booking
- Reminder emails are sent before the booking time

---

### FR6: Administrative Dashboard

**Description:**  
The system shall provide an interface for administrators to manage operations.

**Acceptance Criteria:**

- Admin can view all bookings
- Admin can update booking status
- Admin can manage queue flow
- Admin can manage services

---

### FR7: Basic Reporting

**Description:**  
The system shall provide simple reports to support business decisions.

**Acceptance Criteria:**

- Display total bookings per day
- Show completed and cancelled bookings
- Provide basic summary view

---

## 4. Non-Functional Requirements

### 4.1 Usability

- The system shall provide a responsive web interface
- The system shall be easy to navigate for first-time users
- The interface shall work on both desktop and mobile devices

---

### 4.2 Performance

- The system shall respond to user requests within 1 second under normal conditions
- The system shall support at least 100 concurrent users

---

### 4.3 Security

- User passwords shall be encrypted using secure hashing (e.g., BCrypt)
- The system shall use HTTPS for secure communication
- The system shall implement authentication using JWT

---

### 4.4 Reliability

- The system shall be available at least 99% of the time
- The system shall prevent data loss through proper data storage practices

---

### 4.5 Maintainability

- The system shall follow clean code principles
- The system shall include documentation for developers
- The system shall be modular to allow future improvements

---

### 4.6 Deployability

- The system shall be deployable on a standard cloud platform or local environment
- Docker may be used for containerization

---

## 5. Traceability Matrix

| Requirement ID | Stakeholder(s) | Category | Priority |
|----------------|----------------|----------|----------|
| FR1 | Customer, Admin | Functional | High |
| FR2 | Customer, Business Owner | Functional | High |
| FR3 | Customer, Business Owner | Functional | High |
| FR4 | Customer, Staff | Functional | High |
| FR5 | Customer | Functional | Medium |
| FR6 | Admin | Functional | High |
| FR7 | Business Owner | Functional | Medium |
| NFR-Security | All | Non-Functional | High |
| NFR-Performance | All | Non-Functional | Medium |

---

## 6. Constraints and Assumptions

### Constraints

- The system will be web-based only (no mobile app in MVP)
- Payment integration is not included in the initial version
- The system will support modern web browsers only

---

### Assumptions

- Users have internet access
- Car wash businesses have basic digital access
- The system will be used in a single location for initial implementation
