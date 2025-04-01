// Class representing a book in the library
class Book {
    String title, author, ISBN;
    boolean available;
    Book next;

    // Constructor to initialize a book
    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.available = true; // Book is available by default
        this.next = null;
    }
}