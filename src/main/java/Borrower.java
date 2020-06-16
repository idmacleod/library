import java.util.ArrayList;

public class Borrower {
    private String name;
    private ArrayList<Book> collection;

    public Borrower(String name) {
        this.name = name;
        this.collection = new ArrayList<Book>();
    }

    public String getName() {
        return this.name;
    }

    public int countBooks() {
        return this.collection.size();
    }

    public void addBook(Book book) {
        this.collection.add(book);
    }

    public boolean hasBook(Book book) {
        return this.collection.contains(book);
    }

    public void removeBook(Book book) {
        if (this.hasBook(book)) {
            this.collection.remove(book);
        }
    }

    public void borrowBook(Book book, Library library) {
        if (library.hasBook(book)) {
            library.removeBook(book);
            this.addBook(book);
        }
    }

    public void returnBook(Book book, Library library) {
        if (this.hasBook(book)) {
            this.removeBook(book);
            library.addBook(book);
        }
    }
}
