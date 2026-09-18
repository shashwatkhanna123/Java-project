# Smart Library Management System

## Overview
A console-based Java application that manages books and members and supports issuing/returning books. It demonstrates OOP, collections, modular design, validation and exception handling.

## Features
- Add books and members
- View books/members
- Issue books with validation
- Return books with validation
- Menu-driven interaction

## Technologies
Java (JDK 8+), OOP, ArrayList, Scanner, exception handling.

## Run
```bash
cd src
javac *.java
java LibraryApp
```

## Functional Modules
1. Book Management
2. Member Management
3. Issue/Return & Transaction Management

## Architecture
```text
User -> LibraryApp/Menu -> InputUtil -> Library -> Book/Member
```

## Workflow
```text
Start -> Display Menu -> Select Operation -> Validate Input -> Process -> Display Result -> Menu -> Exit
```

## Testing
Test valid add/issue/return operations, invalid IDs, duplicate issue attempts, returning an available book, and invalid menu/input values.
