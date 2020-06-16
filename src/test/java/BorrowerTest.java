import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BorrowerTest {
    private Borrower borrower;
    private Library library;
    private Book book1;
    private Book book2;

    @Before
    public void before() {
        borrower = new Borrower("Iain");
        library = new Library(2);
        book1 = new Book("The Missing of Clairdelune", "Christelle Dabos", "Fantasy");
        book2 = new Book("A Memory Called Empire", "Arkady Martine", "Science Fiction");
        library.addBook(book1);
    }

    @Test
    public void hasName() {
        assertEquals("Iain", borrower.getName());
    }

    @Test
    public void collectionStartsEmpty() {
        assertEquals(0, borrower.booksBorrowed());
    }

//    @Test
//    public void canBorrowBookFromLibrary() {
//        borrower.borrow(book1, library);
//        assertTrue(borrower.hasBook(book1));
//        assertFalse(library.hasBook(book1));
//    }

//    @Test
//    public void cannotBorrowBookIfLibraryDoesNotHave() {
//        borrower.borrow(book2, library);
//        assertFalse(borrower.hasBook(book2));
//        assertFalse(library.hasBook(book2));
//    }
}
