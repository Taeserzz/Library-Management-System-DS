// Class representing a library patron
class Patron {
    String name, cardNumber;
    String booksCheckedOut; // Stores books checked out by the patron
    Patron next;

    // Constructor to initialize a patron
    public Patron(String name, String cardNumber) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.booksCheckedOut = "None"; // Default value if no books are checked out
        this.next = null;
    }
}