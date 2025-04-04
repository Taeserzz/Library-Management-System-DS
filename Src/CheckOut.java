import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class CheckOut {
    private String bookTitle;
    private String borrowerName;
    private LocalDate checkOutDate;
    private LocalDate dueDate;

    // Stack for undo functionality
    private static Stack<CheckOut> checkoutHistory = new Stack<>();

    // Book availability tracker
    private static Map<String, Boolean> bookAvailability = new HashMap<>();

    public CheckOut(String bookTitle, String borrowerName, LocalDate checkOutDate, LocalDate dueDate) {
        if (checkOutDate.isAfter(dueDate)) {
            throw new IllegalArgumentException("Check-out date cannot be after due date.");
        }

        if (bookAvailability.getOrDefault(bookTitle, true)) {
            this.bookTitle = bookTitle;
            this.borrowerName = borrowerName;
            this.checkOutDate = checkOutDate;
            this.dueDate = dueDate;
            checkoutHistory.push(this); // Store checkout action
            bookAvailability.put(bookTitle, false); // Mark book as checked out
            FileHandler.saveBooks(List.of(new Book(bookTitle, "", "", false)));
        } else {
            throw new IllegalStateException("This book is already checked out.");
        }
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    public LocalDate getCheckOutDate() {
        return checkOutDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public boolean isOverdue(LocalDate currentDate) {
        return currentDate.isAfter(dueDate);
    }

    public static CheckOut undoLastCheckout() {
        if (!checkoutHistory.isEmpty()) {
            CheckOut lastCheckout = checkoutHistory.pop();
            bookAvailability.put(lastCheckout.bookTitle, true); // Mark book as available again
            FileHandler.saveBooks(List.of(new Book(lastCheckout.bookTitle, "", "", true)));
            return lastCheckout;
        } else {
            System.out.println("No checkouts to undo.");
            return null;
        }
    }

    public static void returnBook(String bookTitle) {
        bookAvailability.put(bookTitle, true); // Mark book as available again
        FileHandler.saveBooks(List.of(new Book(bookTitle, "", "", true)));
    }
}
