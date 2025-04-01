// Class representing a book in the library
public class Book {
    private String title; 
    private String author;
    private String ISBN;
    private boolean available;
    public Book next;

    // Constructor to initialize a book
    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.available = true; // Book is available by default
        this.next = null;
    }

    // Getters and setters 
    public String getTitle() { return title; }
    public String getAuthur() { return author; }
    public String getISBN() { return ISBN; }
    public boolean isAvailable() { return available; } 


    public void setAvailable(boolean status) {this.available = status; }
}
