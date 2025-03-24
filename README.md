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
    * `Individual_Reports.pdf`: A detailed report outlining contributions, data structures used, challenges faced, and how you addressed it.
* **`tests/`**: Contains test cases for the application.
   * `test_cases.txt`: List of test cases.
    * `test_library.java`: Automated test cases fror functions.
* **`.gitignore`: Ignore unnecessary files.
* **`README.md`**: This file, providing an overview of the project.

---

## 📝 **Project Contributions**

| **No.** | **Name** | **ID** | **Role** | **Contribution** |
|--------|----------|--------|----------|------------------|
| **1** | La-Tavia Pearce | 2305853 | Project Management, File System & Testing Manager | 🔹 Oversee project progress & team coordination <br> 🔹 Implement **file storage system** (books, patrons, passwords) <br> 🔹 Ensure **password hashing** & Security <br> 🔹 Assist with **testing & debugging** <br> 🔹 Write **User Manual** with screenshots & **individual report**|
| **2** | Elijah Muhammad | 2005032 | Book & Patron Management Developer | 🔹 Develop **Book & Patron classes** using **linked lists** <br> 🔹 Implement **patron registration** & **book addition** <br> 🔹 Ensure **proper data structure implementation** (linked lists) <br> 🔹 Contribute to **individual report** |
| **3** | [Member Name] | [ID] | Checkout & Search System Developer | 🔹 Implement **book checkout/check-in system** using queue & stack <br> 🔹 Develop **BST** for **efficient book search** (by title, author, ISBN) <br> 🔹 Ensure **proper tracking of borrowed books** <br> 🔹 Contribute to **indvidual report** |
| **4** | Jevaun Sanderson | 2306776 | User Interface & Error Handling Developer | 🔹 Design a **user-friendly CLI or GUI** <br> 🔹 Implement **error handling** (invalid inputs, incorrect login, unavailable books) <br> 🔹 Ensure **smooth user interaction** (clear prompts, feedback messages) <br> 🔹 Contribute to **individual report** |
| **5** | [Member Name] | [ID] | ER Diagram & Documentation Specialist | 🔹 Design the **ER Diagram** for book & patron management <br> 🔹 Perform **testing & debugging** <br> 🔹 Assist in writing **individual reports** for all members |
---

## 📌 **Summary of File Distribution**

| **Member** | **Files They Handle** |
|------------|-----------------------|
| La-Tavia Pearce | `main.java`,`FileHandler.java`, `Password.java`, `test_library.java`, `books.txt`, `patrons.txt`, `passwords.txt`, `User_Manual.pdf`, `README.md`, `individual Report.pdf`|
| Elijah Muhammad | `Library.java`,`Book.java`, `Patron.java`, `individual Report.pdf`|
| [3rd Member Name] | `CheckoutOut`,`Search.java`, `individual Report.pdf`|
| Jevaun Sanderson | `UI.java`, `individual Report.pdf`|
| [5th Member Name] | `ER_Diagram.png`, `individual Report.pdf`|
---
