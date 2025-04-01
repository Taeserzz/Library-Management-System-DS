import java.io.*;
import java.util.*;

public class FileHandler {
    
    private static final String BOOKS_FILE = "Data/books.txt";
    private static final String PATRONS_FILE = "Data/patrons.txt";
    private static final String PASSWORDS_FILE = "Data/passwords.txt";
    
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
                    books.add(new Book(parts[0], parts[1],  parts[2], Boolean.parseBoolean(parts[3])));
                }
            }
        } catch (IOException e) {
            System.out.println("Error loading books: " + e.getMessage());
        }
        return books;
    }
    
    // Save patrons to file 
     public static void savePatrons(List<Patron> patrons) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(PATRONS_FILE))) {
            for (Patron patron : patrons) {
                writer.write(patron.getName() + "," + patron.getLibraryCardNumber() + "," + patron.getCheckedOutBooks());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving patrons: " + e.getMessage());
        }
    }
    
    // Load patrons from file 
    public static List<Patron> loadPatrons() {
        List<Patron> patrons = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(PATRONS_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    Patron patron = new Patron(parts[0], parts[1]);
                    patrons.setBooksCheckOut(parts[2]);
                    patrons.add(patron);
                }
            }
        } catch (IOException e) {
            System.out.println("Error loading patrons: " + e.getMessage());
        }
        return patrons;
    }
}
