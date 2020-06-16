import java.util.ArrayList;

public class Library {
    private ArrayList<Book> collection;
    private int capacity;

    public Library(int capacity) {
        this.collection = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public int countBooks() {
        return this.collection.size();
    }

    public boolean stockFull() {
        return countBooks() == this.capacity;
    }

    public void addBook(Book book) {
        if (!stockFull()) {
            this.collection.add(book);
        }
    }

    public boolean hasBook(Book book) {
        return this.collection.contains(book);
    }
}
