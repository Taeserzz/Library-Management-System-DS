


import java.util.*; 

// Book class to represent a book in the library
class Book {
    private String title, author, ISBN; 
    private boolean available;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.available = true; // All books are available by default
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getISBN() { return ISBN; }
    public boolean isAvailable() { return available; }

    public void setAvailable(boolean status) { this.available = status; }

    public String toString() {
        return title + " by " + author + " (" + ISBN + ") - " + (available ? "Available" : "Checked Out");
    }
}

// Patron class to represent a library member
class Patron {
    private String name, cardNumber; // Patron details
    private List<String> booksCheckedOut = new ArrayList<>(); // List of checked out book titles

    public Patron(String name, String cardNumber) {
        this.name = name;
        this.cardNumber = cardNumber;
    }

    public String getName() { return name; }
    public String getCardNumber() { return cardNumber; }
    public List<String> getBooksCheckedOut() { return booksCheckedOut; }

    public void checkOutBook(String title) { booksCheckedOut.add(title); }
    public void returnBook(String title) { booksCheckedOut.remove(title); }

    public String toString() {
        return name + " (Card: " + cardNumber + ")\nChecked Out: " + booksCheckedOut;
    }
}

// Main
public class LibraryCLI {
    private static List<Book> books = new ArrayList<>();
    private static Map<String, Patron> patrons = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- Library Management System ---");
            System.out.println("1. Add Book");
            System.out.println("2. Check Out Book");
            System.out.println("3. Return Book");
            System.out.println("4. Search Book");
            System.out.println("5. View Patron Info");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1": addBook(); break;
                case "2": checkOutBook(); break;
                case "3": returnBook(); break;
                case "4": searchBook(); break;
                case "5": viewPatron(); break;
                case "6": System.exit(0);
                default: System.out.println("Invalid option.");
            }
        }
    }

    private static void addBook() {
        String title = promptNonEmpty("Enter title: ");
        String author = promptNonEmpty("Enter author: ");
        String isbn = promptNonEmpty("Enter ISBN: ");

        books.add(new Book(title, author, isbn));
        System.out.println("Book added.");
    }

    private static void checkOutBook() {
        String name = promptNonEmpty("Enter patron name: ");
        String card = promptNonEmpty("Enter card number: ");
        String title = promptNonEmpty("Enter book title to check out: ");

        Patron patron = patrons.computeIfAbsent(card, k -> new Patron(name, card));

        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title) && b.isAvailable()) {
                b.setAvailable(false);
                patron.checkOutBook(b.getTitle());
                System.out.println("Book checked out.");
                return;
            }
        }
        System.out.println("Book not found or unavailable.");
    }

    private static void returnBook() {
        String card = promptNonEmpty("Enter card number: ");
        String title = promptNonEmpty("Enter book title to return: ");
        Patron patron = patrons.get(card);

        if (patron != null && patron.getBooksCheckedOut().contains(title)) {
            patron.returnBook(title);
            for (Book b : books) {
                if (b.getTitle().equalsIgnoreCase(title)) {
                    b.setAvailable(true);
                    break;
                }
            }
            System.out.println("Book returned.");
        } else {
            System.out.println("Patron or book not found.");
        }
    }

    private static void searchBook() {
        String keyword = promptNonEmpty("Enter search keyword: ").toLowerCase();
        boolean found = false;
        for (Book b : books) {
            if (b.getTitle().toLowerCase().contains(keyword) ||
                b.getAuthor().toLowerCase().contains(keyword) ||
                b.getISBN().toLowerCase().contains(keyword)) {
                System.out.println(b);
                found = true;
            }
        }
        if (!found) System.out.println("No books matched your search.");
    }

    private static void viewPatron() {
        String card = promptNonEmpty("Enter card number: ");
        Patron patron = patrons.get(card);
        if (patron != null) {
            System.out.println(patron);
        } else {
            System.out.println("No patron found with that card number.");
        }
    }

    private static String promptNonEmpty(String message) {
        String input;
        do {
            System.out.print(message);
            input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("Input cannot be empty. Please try again.");
            }
        } while (input.isEmpty());
        return input;
    }
}