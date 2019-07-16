import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibaryTest {

    Book bookA;
    Book bookB;
    Book bookC;
    Library libraryA;

    @Before
    public void setup(){
        bookA = new Book("New Frontiers", "Steve Jones", "Fan Fiction");
        bookB = new Book("Black Box Thinking", "John Mckenna", "Mockummentary");
        bookC = new Book("Matilda", "Charles Dickens", "Childrens");
        libraryA = new Library("St James Library", 2);
        libraryA.addBook(bookA);
    }


    @Test
    public void libraryHasName(){
        assertEquals("St James Library", libraryA.getName());
    }

    @Test
    public void libraryHasABook(){
        assertEquals(1, libraryA.getNumberOfBooks());
    }


}
