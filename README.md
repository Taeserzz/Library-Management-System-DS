#  📚Library Management System

### University of Technology, Jamiaca - Data Structures Project (20%) 

This project is a **Library Management System** that efficiently manages books, patrons, and check-in/check-out operations using **linked lists, stacks, queuess, and binary search trees (BSTs)**.

---

## 📌 **Project Overview**
This system provides the following functionalities: 
- **Book Management:** Add, remove, and search books (BST for effficient searching).
- **Patron Management:** Register patrons, track checkouts (linked list).
- **Check-In/Check-Out System:** Handle borrowing/returning (queue for checkouts, stack for undo).
- **Search Functionality:** Find books by **title, author, or ISBN** (BST implementation).
- **User Interface:** CLI/GUI for user interactions.
- **File System:** Persistent storage for **books, patrons, and passwords**.
- **Password Management:** Default admin login, password hashing, secure authentication.

---

## 🛠 **Tech Stack** 
- **Programming Language:** Java 
- **Data Structures Used:** Linked List, Stack, Queue, Binary Search Tree (BST)
- **File Storage:** Text files for book and patron management
- **Authentication:** Password hashing for security

---

## 📂 **Project Structure** 

Library-Management-System/
* **`src/`**: Contains all the Java source code files.
    * `main.java`: The main entry point of the application.
    * `Book.java`: Defines the `Book` class, representing book entities.
    * `Patron.java`: Defines the `Patron` class, representing library patrons.
    * `Library.java`: Implements the core library management logic.
    * `Password.java`: Handles password hashing and verification.
    * `FileHandler.java`: Manages reading and writing data to files.
    * `Search.java`: Implements a Binary Search Tree (BST) for efficient searching.
    * `CheckOut.java`: Manages the checkout and return process.
    * `UI.java`: Implements the user interface for the application.
* **`data/`**: Stores data files used by the application.
    * `books.txt`: Contains information about books.
    * `patrons.txt`: Contains information about patrons.
    * `passwords.txt`: Stores hashed passwords.
* **`docs/`**: Contains project documentation.
    * `ER_Diagram.png`: Entity-Relationship diagram illustrating the database schema.
    * `User_Manual.pdf`: User manual providing instructions on how to use the system.
    * `Project_Report.pdf`: A detailed report outlining contributions, data structures used, challenges faced, and how you addressed it.
* **`tests/`**: Contains test cases for the application.
   *`test_cases.txt`: List of test cases
   *`test_library.java`: Automated test cases fror functions.
* **`README.md`**: This file, providing an overview of the project.

---

## 📝 **Project Contributions**

| **No.** | **Name** | **ID** | **Role** | **Contribution** |
|--------|----------|--------|----------|------------------|
| **1** | L-Tavia Pearce | 2305853 | - Project leader & File System Manager | Oversee project progress & team coordination
                                   | - Implementation **file storage system** (books, patrons, passwords)
                                   | - Handle **password management (hashing, security)
|--------|-------------|----------|-----------------|-------------------|
                                   | - Assist with **testing & debugging**
| **2** |          |               | Book & Patron Management Developer | 
