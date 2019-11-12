package solution.test;
import org.junit.Test;
import static org.junit.Assert.*;
import solution.src.StringHelper;

public class StringHelperTest {

    @Test 
    public void sortString_stringSorted() {
        assertEquals("abcde", StringHelper.sortString("badce"));
    }

    @Test 
    public void sortString_emptyString() {
        assertEquals("", StringHelper.sortString(""));
    }

    @Test 
    public void removeIthChar_IthCharRemoved() {
        assertEquals("adce", StringHelper.removeIthChar("badce", 0));
    }

    @Test 
    public void removeIthChar_indexOutOfBounds() {
        String s = "badce"; 
        assertEquals(s, StringHelper.removeIthChar(s, s.length() + 1));
    }

    @Test 
    public void removeIthChar_emptyString() {
        String s = ""; 
        assertEquals(s, StringHelper.removeIthChar(s, s.length() + 1));
    }
}