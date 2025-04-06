import java.io.*;
import java.util.*;

public class FileHandler {
    private static final String BOOKS_FILE = "books.txt";
    private static final String PATRONS_FILE = "patrons.txt";
    private static final String PASSWORDS_FILE = "passwords.txt";
    
    // Save books to file 
    public static void saveBooks(List<Book> books) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(BOOKS_FILE))) {
            for (Book book : books) {
                writer.write(book.getTitle() + "," + book.getAuthor() + "," + book.getISBN() + "," + book.isAvailable());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving books: " + e.getMessage());
        }
    }
    
    // Load books from file 
    public static List<Book> loadBooks() {
        List<Book> books = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(BOOKS_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    Book book = new Book(parts[0], parts[1], parts[2]);
                    book.setAvailable(Boolean.parseBoolean(parts[3]));
                    books.add(book);
                }
            }
        } catch (IOException e) {
            System.out.println("Error loading books: " + e.getMessage());
        }
        return books;
    }
    
    // Save patrons to file 
     public static void savePatrons(Map<String, Patron> patrons) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(PATRONS_FILE))) {
            for (Patron patron : patrons.values()) {
                String checkedOutBooks = String.join(";", patron.getBooksCheckedOut()); // Save checked-out books as a comma-separated string
                writer.write(patron.getName() + "," + patron.getLibraryCardNumber() + "," + checkedOutBooks);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving patrons: " + e.getMessage());
        }
    }
    
    // Load patrons from file 
    public static Map<String, Patron> loadPatrons() {
        Map<String, Patron> patrons = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(PATRONS_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 2) { // Ensure at least name and card number exist
                    Patron patron = new Patron(parts[0], parts[1]);
                    if (parts.length > 2) { // If checked-out books are present
                        String[] checkedOutBooks = parts[2].split(";");
                        for (String bookTitle : checkedOutBooks) {
                            patron.checkOutBook(bookTitle.trim()); // Trim to remove extra spaces
                        }
                    }
                    patrons.put(patron.getCardNumber(), patron); // Use card number as key
                }
            }
        } catch (IOException e) {
            System.out.println("Error loading patrons: " + e.getMessage());
        }
        return patrons;
    }
}
