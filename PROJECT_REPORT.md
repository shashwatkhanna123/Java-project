# Smart Library Management System — Project Report

## 1. Introduction
The Smart Library Management System is a console-based Java application designed to simplify basic library operations using object-oriented programming and Java collections.

## 2. Problem Statement
Manual tracking of books and members can lead to inaccurate availability records. The proposed system centralizes these operations in a simple menu-driven application.

## 3. Objectives
- Apply Java OOP concepts in a real-world problem.
- Implement modular classes.
- Manage collections of books and members.
- Validate transactions and handle invalid input.

## 4. Functional Requirements
1. Add and view books.
2. Add and view members.
3. Issue and return books.
4. Validate IDs and transaction status.

## 5. Non-Functional Requirements
- Usability: simple menu interface.
- Reliability: invalid inputs are handled without crashing.
- Maintainability: functionality is separated into classes.
- Performance: ArrayList-based lookup is adequate for a small academic system.

## 6. System Architecture
User -> LibraryApp/Menu -> InputUtil -> Library -> Book/Member.

## 7. Design Diagrams
### Use Case Diagram
```text
Student/User --> (Add Book)
Student/User --> (Add Member)
Student/User --> (View Books)
Student/User --> (View Members)
Student/User --> (Issue Book)
Student/User --> (Return Book)
```

### Workflow
```text
Start -> Menu -> Input -> Validation -> Operation -> Result -> Menu -> Exit
```

### Class Diagram
```text
LibraryApp --> Menu
LibraryApp --> InputUtil
LibraryApp --> Library
Library --> Book
Library --> Member
```

### Sequence: Issue Book
```text
User -> LibraryApp: choose Issue
LibraryApp -> InputUtil: read IDs
LibraryApp -> Library: issueBook(bookId, memberId)
Library -> Book: check/set issued
Library --> LibraryApp: success/failure
LibraryApp --> User: result
```

## 8. Design Decisions & Rationale
Separate classes improve modularity. ArrayList provides simple dynamic storage. Private fields with getters/setters demonstrate encapsulation. Validation prevents invalid transactions.

## 9. Implementation Details
The project contains seven Java files: Book, Member, Library, InputUtil, Menu, LibraryApp, plus documentation. The core logic uses classes, objects, ArrayList, loops, switch-case and exception handling.

## 10. Results
The application can add/view books and members and perform issue/return operations. Console messages show successful operations and validation errors.

## 11. Testing Approach
- Valid book/member creation: Pass
- Valid issue: Pass
- Issue already-issued book: Rejected
- Invalid book/member ID: Rejected
- Valid return: Pass
- Return available book: Rejected
- Non-numeric menu input: Handled

## 12. Challenges Faced
Designing independent classes and validating user input while keeping the console workflow simple were the main challenges.

## 13. Learnings
Learned practical use of OOP, encapsulation, collections, exception handling, modular programming and basic software design.

## 14. Future Enhancements
Database persistence, login/authentication, fine calculation, search/filtering, GUI and REST API integration.

## 15. References
Java documentation and course material.
