// Class representing a book in the library
public class Book {

    private static final String BOOKS_FILE = "books.txt";
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
    public String getTitle() { 
        return title; 
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getAuthor() { 
        return author; 
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    
    public String getISBN() { 
        return ISBN; 
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    
    public boolean isAvailable() { 
        return available; 
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Book getNext() {
        return next;
    }

    public void setNext(Book next) {
        this.next = next;
    }

    @Override 
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + ISBN + ", Available: " + available;
    }
}
