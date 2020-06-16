import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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

    @Test
    public void collectionStartsEmpty() {
        assertEquals(0, library.countBooks());
    }

    @Test
    public void canAddBook() {
        library.addBook(book1);
        assertEquals(1, library.countBooks());
    }

    @Test
    public void canCheckStockFull() {
        library.addBook(book1);
        library.addBook(book2);
        assertTrue(library.stockFull());
    }
}
