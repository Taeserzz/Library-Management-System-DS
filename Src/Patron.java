// Class representing a library patron
import java.util.LinkedList;
import java.util.List;

class Patron {
    private String name;
    private String cardNumber;
    private List<String> booksCheckedOut; // Stores books checked out by the patron
    public Patron next;

    // Constructor to initialize a patron
    public Patron(String name, String cardNumber) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.booksCheckedOut = new LinkedList<>();
        this.next = null;
    }

    // Getters and setters 
    public String getName() { return name; }
    public String getCardNumber() { return cardNumber; }
    public List<String> getBooksCheckedOut() { return booksCheckout; } 

    // Add a book to the checked-out list 
    public void checkOutBook(String bookTitle) {
        booksCheckedOut.add(bookTitle);
    }

    // Return a book and remove it from the checked-out list 
    public void returnBook(String bookTitle) {
        booksCheckedOut.remove(bookTitle);
    }
}
