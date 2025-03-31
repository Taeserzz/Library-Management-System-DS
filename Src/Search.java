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
        if (root == null || root.title.equals(title)) {
            return root;
        }
        return title.compareTo(root.title) < 0 ? searchTitleRec(root.left, title) : searchTitleRec(root.right, title);
    }

    public void searchByAuthor(String author) {
        searchAuthorRec(root, author);
    }

    private void searchAuthorRec(BookNode root, String author) {
        if (root != null) {
            searchAuthorRec(root.left, author);
            if (root.author.equalsIgnoreCase(author)) {
                System.out.println("Title: " + root.title + ", Author: " + root.author + ", ISBN: " + root.ISBN);
            }
            searchAuthorRec(root.right, author);
        }
    }

    public void searchByISBN(String ISBN) {
        searchISBNRec(root, ISBN);
    }

    private void searchISBNRec(BookNode root, String ISBN) {
        if (root != null) {
            searchISBNRec(root.left, ISBN);
            if (root.ISBN.equals(ISBN)) {
                System.out.println("Title: " + root.title + ", Author: " + root.author + ", ISBN: " + root.ISBN);
            }
            searchISBNRec(root.right, ISBN);
        }
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
