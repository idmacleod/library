import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    private Borrower borrower;

    @Before
    public void before() {
        borrower = new Borrower("Iain");
    }

    @Test
    public void hasName() {
        assertEquals("Iain", borrower.getName());
    }

    @Test
    public void collectionStartsEmpty() {
        assertEquals(0, borrower.booksBorrowed());
    }
}
