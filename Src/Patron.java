// Class representing a library patron
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public class Patron implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final String PATRONS_FILE = "patrons.txt";
    
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
    public String getName() { 
        return name; 
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getCardNumber() { 
        return cardNumber; 
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getLibraryCardNumber() {
        return cardNumber;
    }
    
    public List<String> getBooksCheckedOut() { 
        return booksCheckedOut; 
    } 

    // Add a book to the checked-out list 
    public void checkOutBook(String title) {
        booksCheckedOut.add(title);
    }

    // Return a book and remove it from the checked-out list 
    public void returnBook(String title) {
        booksCheckedOut.remove(title);
    }

    public Patron getNext() {
        return next;
    } 

    public void setNext(Patron next) {
        this.next = next;
    }
    @Override 
    public String toString() {
        return "Name: " + name + ", card Number: " + cardNumber + ", Books Checked Out: " + booksCheckedOut;
    }
}
