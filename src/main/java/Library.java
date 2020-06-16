import java.util.ArrayList;

public class Library {
    private ArrayList<Book> collection;
    private int capacity;

    public Library(int capacity) {
        this.collection = new ArrayList<Book>();
        this.capacity = capacity;
    }
}
