import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Book bookA;
    Book bookB;
    Borrower borrowerA;


    @Before
    public void setup(){
        bookA = new Book("Test", "Mr Testing", "Fiction");
        bookB = new Book("Test2", "Mr Testing2", "Fiction2");
        borrowerA = new Borrower("Dave", 22);
    }


    @Test
    public void userCanHaveAName(){
        assertEquals("Dave", borrowerA.getName());
    }

    @Test
    public void userCanBorrowBook(){
        
    }
}
