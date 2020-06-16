import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private ArrayList<Book> collection;
    private int capacity;
    private HashMap<String, Integer> booksByGenre;

    public Library(int capacity) {
        this.collection = new ArrayList<Book>();
        this.capacity = capacity;
        this.booksByGenre = new HashMap<String, Integer>();
    }

    public int countBooks() {
        return this.collection.size();
    }

    public boolean stockFull() {
        return this.countBooks() == this.capacity;
    }

    public void addBook(Book book) {
        if (!stockFull()) {
            this.collection.add(book);
            String genre = book.getGenre();
            int oldCount = this.countByGenre(genre);
            this.booksByGenre.put(genre, oldCount + 1);
        }
    }

    public boolean hasBook(Book book) {
        return this.collection.contains(book);
    }

    public void removeBook(Book book) {
        if (hasBook(book)) {
            this.collection.remove(book);
            String genre = book.getGenre();
            int oldCount = this.countByGenre(genre);
            this.booksByGenre.put(genre, oldCount - 1);
        }
    }

    public int countDistinctGenres() {
        return this.booksByGenre.size();
    }

    public int countByGenre(String genre) {
        return this.booksByGenre.getOrDefault(genre, 0);
    }
}
