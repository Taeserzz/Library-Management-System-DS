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
Library-Management-System/ │── src/
│ ├── main.java # Main program file │ ├── Book.java # Book management (Linked List, BST) │ ├── Patron.java # Patron management (Linked List) │ ├── Library.cpp / Library.java # Main Library class │ ├── Password.java # Authentication & Password Hashing │ ├── FileHandler.java # File system management │ ├── CheckOut.java # Queue (checkouts) & Stack (undo) │ ├── UI.java # Command-Line/GUI Interface │── data/
│ ├── books.txt # Stores book details │ ├── patrons.txt # Stores patron details │ ├── passwords.txt # Stores hashed passwords │── docs/
│ ├── ER_Diagram.png # System design diagram │ ├── User_Manual.pdf # Instructions for use │ ├── Project_Report.pdf # Group report with contributions │── tests/
│ ├── test_library.java # Test cases │ ├── test_cases.txt # List of test scenarios │── .gitignore # Ignore unnecessary files │── README.md # Project description & setup guide 
