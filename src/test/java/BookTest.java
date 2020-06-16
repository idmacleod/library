import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    private Book book;

    @Before
    public void before() {
        book = new Book("The Missing of Clairdelune", "Christelle Dabos", "Fantasy");
    }

    @Test
    public void hasTitle() {
        assertEquals("The Missing of Clairdelune", book.getTitle());
    }

    @Test
    public void hasAuthor() {
        assertEquals("Christelle Dabos", book.getAuthor());
    }

    @Test
    public void hasGenre() {
        assertEquals("Fantasy", book.getGenre());
    }
}
