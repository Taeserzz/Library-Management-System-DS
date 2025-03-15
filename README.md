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
│── src/                     # Source code files
│   ├── main.java             # Main program file
│   ├── Book.java             # Book class
│   ├── Patron.java           # Patron class
│   ├── Library.java          # Library system logic
│   ├── Password.java         # Password hashing system
│   ├── FileHandler.java      # Handles file reading/writing
│   ├── Search.java           # Implements BST search
│   ├── CheckOut.java         # Checkout/return system
│   ├── UI.java               # User Interface
│── data/                     # Data storage files
│   ├── books.txt             # Stores book details
│   ├── patrons.txt           # Stores patron details
│   ├── passwords.txt         # Stores hashed passwords
│── docs/                     # Documentation
│   ├── ER_Diagram.png        # ER diagram
│   ├── User_Manual.pdf       # Instructions & screenshots
│   ├── Project_Report.pdf    # Group project report
│── tests/                    # Test cases
│── .gitignore                # Files to ignore
│── README.md                 # This file
│── LICENSE                   # License (optional)

