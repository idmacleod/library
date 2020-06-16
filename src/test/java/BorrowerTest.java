import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BorrowerTest {
    private Borrower borrower;
    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;

    @Before
    public void before() {
        borrower = new Borrower("Iain");
        library = new Library(2);
        book1 = new Book("The Missing of Clairdelune", "Christelle Dabos", "Fantasy");
        book2 = new Book("A Memory Called Empire", "Arkady Martine", "Science Fiction");
        book3 = new Book("Moominland Midwinter", "Tove Jansson", "Children's");
        library.addBook(book1);
        library.addBook(book3);
    }

    @Test
    public void hasName() {
        assertEquals("Iain", borrower.getName());
    }

    @Test
    public void collectionStartsEmpty() {
        assertEquals(0, borrower.countBooks());
    }

    @Test
    public void canAddBook() {
        borrower.addBook(book1);
        assertEquals(1, borrower.countBooks());
    }

    @Test
    public void canRemoveBook() {
        borrower.addBook(book1);
        borrower.addBook(book2);
        borrower.removeBook(book1);
        assertEquals(1, borrower.countBooks());
    }

    @Test
    public void cannotRemoveBookIfBorrowerDoesNotHave() {
        borrower.addBook(book1);
        borrower.removeBook(book2);
        assertEquals(1, borrower.countBooks());
    }

    @Test
    public void canBorrowBookFromLibrary() {
        borrower.borrowBook(book1, library);
        assertTrue(borrower.hasBook(book1));
        assertFalse(library.hasBook(book1));
    }

    @Test
    public void cannotBorrowBookIfLibraryDoesNotHave() {
        borrower.borrowBook(book2, library);
        assertFalse(borrower.hasBook(book2));
        assertFalse(library.hasBook(book2));
    }

    @Test
    public void canReturnBookToLibrary() {
        borrower.borrowBook(book1, library);
        borrower.borrowBook(book3, library);
        borrower.returnBook(book1, library);
        assertFalse(borrower.hasBook(book1));
        assertTrue(library.hasBook(book1));
    }

    @Test
    public void cannotReturnBookIfBorrowerDoesNotHave() {
        borrower.borrowBook(book1, library);
        borrower.returnBook(book2, library);
        assertFalse(borrower.hasBook(book2));
        assertFalse(library.hasBook(book2));
    }
}
