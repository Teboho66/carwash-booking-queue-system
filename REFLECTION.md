# Reflection: Challenges in Requirements Engineering

Completing the stakeholder analysis and system requirements for the Web-Based Car Wash Booking and Queue Management System highlighted the complexity of balancing diverse stakeholder needs within a single system. One of the primary challenges encountered was aligning the priorities of the **Business Owner** and **Service Staff**. While the Business Owner focused on maximizing operational efficiency and increasing the number of daily bookings (FR-03, FR-07), the Service Staff required a manageable and clearly defined workflow to avoid confusion in queue handling (FR-04, FR-06). These needs are inherently interconnected but can conflict if not carefully designed. The solution was to ensure that the queue management system provides both operational visibility for the business and simplicity for staff execution.

Another significant challenge was balancing **usability** and **security requirements**. Customers require a fast and seamless booking experience (FR-01, FR-03), but the system must also enforce secure authentication and data protection (NFR-SE-01). Introducing authentication mechanisms such as login validation and encrypted password storage improves security but can add friction to the user experience. This required careful consideration to ensure that security controls do not negatively impact usability, while still meeting minimum protection standards.

A further challenge was ensuring **traceability between stakeholder needs and system requirements**. Initially, it was difficult to clearly map how each stakeholder concern translated into specific functional or non-functional requirements. For example, the Customer’s need for reduced waiting time was not only addressed by the booking system (FR-03) but also by queue visibility (FR-04) and system performance requirements (NFR-PF-01). This demonstrated that a single stakeholder concern can span multiple system components, reinforcing the importance of maintaining a clear mapping structure.

Additionally, defining the **scope of the system** required careful control. There was a tendency to introduce advanced features such as payment integration, loyalty systems, and analytics. However, these were intentionally excluded from the MVP to maintain feasibility within the constraints of a semester project. This reinforced the importance of distinguishing between core requirements and future enhancements.

Overall, this exercise demonstrated that requirements engineering is not only about defining system functionality, but also about managing trade-offs between competing stakeholder expectations. It highlighted the importance of clarity, traceability, and scope control in designing a system that is both practical to implement and aligned with stakeholder needs.

# Reflection: Use Case Development

The process of gathering requirements and designing use cases for the Car Wash Booking and Queue Management System was both insightful and challenging. One of the key learning experiences was understanding how abstract stakeholder needs can be translated into structured system functionality. Initially, identifying and clearly defining user requirements proved difficult, particularly in distinguishing between what users explicitly request and what the system implicitly requires to function effectively. This required a shift from a surface-level understanding to a more analytical and system-oriented perspective.

A significant challenge encountered was structuring the use cases in a way that maintained logical consistency across all interactions. Defining the boundaries between basic flows and alternative flows was particularly demanding, as it required careful consideration of both normal and exceptional system behavior. Additionally, ensuring that each use case aligned with the overall system design without redundancy or ambiguity required iterative refinement.

Another difficulty was maintaining clarity while handling multiple actors and interactions within the system. It became evident that improper structuring could lead to overly complex or confusing representations, which would negatively impact both understanding and implementation.

Despite these challenges, the exercise significantly improved my ability to think in terms of real-world system operations and user interactions. It reinforced the importance of precision, clarity, and consistency in software design. Overall, the experience strengthened my understanding of requirements engineering and highlighted the critical role of use case modeling in bridging the gap between stakeholders and system implementation.

# Reflection: Agile User Stories, Backlog, and Sprint Planning

## 1. Application of Agile Principles

The development process for this project follows Agile principles, particularly iterative development, incremental delivery, and continuous feedback. Instead of attempting to build the entire system at once, the approach focuses on delivering a functional vertical slice of the system during the sprint, beginning with core features such as authentication, service browsing, booking, and queue management.

This aligns with the Agile Manifesto’s emphasis on delivering working software frequently and prioritising customer value. By structuring the system around user stories and a prioritized backlog, development efforts remained focused on the most critical business functionalities required for a Minimum Viable Product (MVP).

---

## 2. Use of GitHub Projects and Issues

GitHub Issues and the Project Kanban board are used to simulate a real-world Agile workflow. Each user story is represented as an issue, allowing for clear traceability between requirements, development tasks, and sprint planning.

The Kanban board (Backlog, To Do, In progress, In review, Done) provides visibility into task progress and supported workflow management throughout the sprint. This helped in:

- tracking development progress
- identifying bottlenecks
- maintaining accountability for task completion

This approach reflects industry practices where tools such as Jira or Azure DevOps are used for Agile project management.

---

## 3. Sprint Planning Effectiveness

The sprint planning process ensures that only a manageable set of high-priority (Must-have) user stories are selected. By focusing on a small number of tightly related features, the sprint is structured to deliver a complete and usable customer journey rather than fragmented functionality.

Breaking down user stories into smaller, well-defined tasks improves estimation accuracy and ensured that work could be distributed effectively across the team. This reflects good Agile practice, where tasks are granular, actionable, and aligned with sprint goals.

---

## 4. Challenges Encountered

One of the key challenges in applying Agile within this context is the absence of a real development team and continuous stakeholder feedback. Agile methodologies typically rely heavily on collaboration, daily stand-ups, and iterative feedback, which are difficult to fully simulate in an individual setting.

Additionally, estimating effort without historical team velocity introduced some uncertainty in task sizing. This required making reasonable assumptions about development time and complexity.

---

## 5. Lessons Learned

This assignment reinforces several important software engineering principles:

- The importance of breaking down complex systems into manageable, iterative deliverables
- The value of prioritization (MoSCoW) in ensuring focus on high-impact features
- The effectiveness of vertical slicing in delivering usable functionality early
- The role of structured planning (backlogs, sprint plans) in reducing development risk

It also highlights that good system design is not only about architecture, but also about planning how the system is built over time.

---

## 6. Conclusion

Overall, the Agile approach used in this project proves to be effective for managing complexity and ensuring structured progress toward an MVP. While certain aspects of Agile (such as real-time collaboration and continuous stakeholder feedback) are limited in this context, the use of user stories, backlog prioritization, sprint planning, and task tracking provided a strong foundation for disciplined and incremental software development.

This approach closely mirrors real-world Agile practices and provides a solid basis for future team-based software engineering projects.
