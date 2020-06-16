import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LibraryTest {
    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;

    @Before
    public void before() {
        library = new Library(2);
        book1 = new Book("The Missing of Clairdelune", "Christelle Dabos", "Fantasy");
        book2 = new Book("A Memory Called Empire", "Arkady Martine", "Science Fiction");
        book3 = new Book("Moominland Midwinter", "Tove Jansson", "Children's");
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

    @Test
    public void canCheckStockNotFull() {
        library.addBook(book1);
        assertFalse(library.stockFull());
    }

    @Test
    public void cannotAddBookIfStockFull() {
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(2, library.countBooks());
    }

    @Test
    public void canCheckHasBook() {
        library.addBook(book1);
        assertTrue(library.hasBook(book1));
    }

    @Test
    public void canCheckDoesNotHaveBook() {
        library.addBook(book1);
        assertFalse(library.hasBook(book2));
    }

    @Test
    public void canRemoveBook() {
        library.addBook(book1);
        library.addBook(book2);
        library.removeBook(book1);
        assertFalse(library.hasBook(book1));
    }

    @Test
    public void cannotRemoveBookIfLibraryDoesNotHave() {
        library.addBook(book1);
        library.removeBook(book2);
        assertEquals(1, library.countBooks());
    }
}
