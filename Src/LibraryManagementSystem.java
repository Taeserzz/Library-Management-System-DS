import java.util.Scanner;

public class LibraryManagementSystem {
    private Book headBook; // Head node of the book linked list
    private Patron headPatron; // Head node of the patron linked list

    // Method to add a book to the linked list
    public void addBook(String title, String author, String ISBN) {
        Book newBook = new Book(title, author, ISBN);
        if (headBook == null) {
            headBook = newBook;
        } else {
            Book temp = headBook;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(newBook);
        }
    }

    // Method to register a new patron in the linked list
    public void registerPatron(String name, String cardNumber) {
        Patron newPatron = new Patron(name, cardNumber);
        if (headPatron == null) {
            headPatron = newPatron;
        } else {
            Patron temp = headPatron;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(newPatron);
        }
    }

    // Method to search for a book by title
    public Book searchBook(String title) {
        Book temp = headBook;
        while (temp != null) {
            if (temp.getTitle().equalsIgnoreCase(title)) {
                return temp;
            }
            temp = temp.getNext();
        }
        return null;
    }

    // Method to remove a book by title
    public void removeBook(String title) {
        if (headBook == null)
            return;
        if (headBook.getTitle().equalsIgnoreCase(title)) {
            headBook = headBook.next;
            return;
        }
        Book temp = headBook;
        while (temp.next != null && !temp.next.getTitle().equalsIgnoreCase(title)) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    // Method to manually add a patron
    public void addPatronManually() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter patron name: ");
        String name = scanner.nextLine();
        System.out.print("Enter patron card number: ");
        String cardNumber = scanner.nextLine();
        registerPatron(name, cardNumber);
    }

    // Method to display all books in the library
    public void displayBooks() {
        Book temp = headBook;
        while (temp != null) {
            System.out.println("Title: " + temp.getTitle() + ", Author: " + temp.getAuthor() + ", ISBN: " + temp.getISBN()
                    + ", Available: " + temp.isAvailable());
            temp = temp.getNext();
        }
    }

    // Method to display all registered patrons
    public void displayPatrons() {
        Patron temp = headPatron;
        while (temp != null) {
            System.out.println("Name: " + temp.getName() + ", Card Number: " + temp.getCardNumber() 
                     + ", Books Checked Out: " + temp.getBooksCheckedOut());
            temp = temp.getNext();
        }
    }

    // Main method to test the system
    public static void main(String[] args) {
        LibraryManagementSystem library = new LibraryManagementSystem();
        Scanner scanner = new Scanner(System.in);

        // Adding sample books
        library.addBook("The Hobbit", "J.R.R. Tolkien", "978-0547928227");
        library.addBook("1984", "George Orwell", "978-0451524935");

        // Registering sample patrons
        library.registerPatron("Alice Johnson", "P12345");
        library.registerPatron("Bob Smith", "P67890");

        library.displayBooks();
        library.displayPatrons();

        // Interactive menu
        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("(1) Add Book");
            System.out.println("(2) Remove Book");
            System.out.println("(3) Search Book");
            System.out.println("(4) Add Patron");
            System.out.println("(5) Display Books");
            System.out.println("(6) Display Patrons");
            System.out.println("(7) Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter ISBN: ");
                    String ISBN = scanner.nextLine();
                    library.addBook(title, author, ISBN);
                    break;
                case 2:
                    System.out.print("Enter book title to remove: ");
                    String removeTitle = scanner.nextLine();
                    library.removeBook(removeTitle);
                    break;
                case 3:
                    System.out.print("Enter book title to search: ");
                    String searchTitle = scanner.nextLine();
                    Book foundBook = library.searchBook(searchTitle);
                    if (foundBook != null) {
                        System.out.println("Book found: " + foundBook.title + " by " + foundBook.author);
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                case 4:
                    library.addPatronManually();
                    break;
                case 5:
                    library.displayBooks();
                    break;
                case 6:
                    library.displayPatrons();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
