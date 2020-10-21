import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MyFirstTest {

    @Test
    public void testIfNameIsEqual(){
        String expected = "Codeup";
        String actual = "CodeUp";

        //assertEquals(expected, actual);
        //Above method fails.

        assertNotEquals(expected, actual);
        //Above method passes
    }

    @Test
    public void testIfArrayListsAreSame() {
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();

        assertNotSame(languages, moreLanguages);
        //Above test passes
    }

    @Test
    public void testIfArraysAreEqual() {
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;

        assertArrayEquals(numbers, otherNumbers);
    }

    @Test
    public void testToSeeIfStringIsTrue() {
        String language = "PHP";
        assertTrue(language.contains("H")); // use assertTrue for this statement
        assertFalse(language.contains("J")); // use assertFalse for this statement
    }

}
