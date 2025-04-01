class BookNode {
    String title, author, ISBN;
    BookNode left, right;

    public BookNode(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.left = this.right = null;
    }
}

public class Search {
    private BookNode root;

    public void insert(String title, String author, String ISBN) {
        root = insertRec(root, title, author, ISBN);
    }

    private BookNode insertRec(BookNode root, String title, String author, String ISBN) {
        if (root == null) {
            return new BookNode(title, author, ISBN);
        }
        if (title.compareTo(root.title) < 0) {
            root.left = insertRec(root.left, title, author, ISBN);
        } else if (title.compareTo(root.title) > 0) {
            root.right = insertRec(root.right, title, author, ISBN);
        }
        return root;
    }

    public BookNode searchByTitle(String title) {
        return searchTitleRec(root, title);
    }

    private BookNode searchTitleRec(BookNode root, String title) {
        if (root == null || root.title.equalsIgnoreCase(title)) {
            return root;
        }
        return title.compareToIgnoreCase(root.title) < 0 ? searchTitleRec(root.left, title) : searchTitleRec(root.right, title);
    }

    public void searchByAuthor(String author) {
        searchAuthorRec(root, author);
    }

    private void searchAuthorRec(BookNode root, String author) {
        if (root != null) return null;
        if (root.author.equalsIgnoreCase(author)) {
            return root;
        }
        BookNode found = searchAuthorRec(root.right, author);
        if (found == null) {
            found = searchAuthorRec(root.right, author);
        }
        return found;
    }

    public BookNode searchByISBN(String ISBN) {
        return searchISBNRec(root, ISBN);
    }

    private BookNode searchISBNRec(BookNode root, String ISBN) {
        if (root == null) return null;
         if (root.ISBN.equals(ISBN)) {
             return root;
         } 
         BookNode found = searchISBNRec(root.left, ISBN);
            if (found == null) {
                found = searchISBNRec(root.right, ISBN);
            }
            return found;
    }

    public void displayBooks() {
        inOrderRec(root);
    }

    private void inOrderRec(BookNode root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.println("Title: " + root.title + ", Author: " + root.author + ", ISBN: " + root.ISBN);
            inOrderRec(root.right);
        }
    }
}
