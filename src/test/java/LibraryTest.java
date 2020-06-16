import org.junit.Before;

public class LibraryTest {
    private Library library;
    private Book book1;
    private Book book2;

    @Before
    public void before() {
        library = new Library(2);
        book1 = new Book("The Missing of Clairdelune", "Christelle Dabos", "Fantasy");
        book2 = new Book("A Memory Called Empire", "Arkady Martine", "Science Fiction");
    }
}
