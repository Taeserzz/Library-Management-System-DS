class BookNode {
    String title; 
    Strin author;
    String ISBN;
    BookNode left;
    BookNode right;

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
        int compareResult = title.compareTo(root.title);
        if (compareResult < 0) {
            root.left = insertRec(root.left, title, author, ISBN);
        } else if (compareResult > 0) {
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
        int compareResult = title.compareToIgnoreCase(root.title);
        return compareResult < 0 ? searchTitleRec(root.left, title) : searchTitleRec(root.right, title);
    }

    public void searchByAuthor(String author) {
        searchAuthorRec(root, author);
    }

    private BookNode searchAuthorRec(BookNode root, String author) {
        if (root == null) {
            return;
        }
        if (root.author.equalsIgnoreCase(author)) {
            System.out.println("Book found: Title: " + root.title + ", Author: " + root.author + ", ISBN: " + root.ISBN);
            return;
        }
        searchAuthorRec(root.left, author);
        searchAuthorRec(root.right, author);
    }

    public BookNode searchByISBN(String ISBN) {
        return searchISBNRec(root, ISBN);
    }

    private BookNode searchISBNRec(BookNode root, String ISBN) {
        if (root == null) {
            return null;
        }
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
