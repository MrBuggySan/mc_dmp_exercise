package solution.test;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import solution.src.FindPerm;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;


public class FindPermTest {
    //Ideally we should use mocking framework (mockito) to mock out StringHelper

    //Testing console output: https://stackoverflow.com/questions/1119385/junit-test-for-system-out-println             
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void printPermutations_testHappy() {
        FindPerm.printPermutations("DOG");
        String[] perms = outContent.toString().split("\n");
        assertEquals(6, perms.length);
    }

    @Test
    public void printPermutations_stringWithDuplicateChars_1() {
        FindPerm.printPermutations("GGGG");
        String[] perms = outContent.toString().split("\n");
        assertEquals(1, perms.length);
    }

    @Test
    public void printPermutations_stringWithDuplicateChars_2() {
        FindPerm.printPermutations("GGGG0");
        String[] perms = outContent.toString().split("\n");
        assertEquals(5, perms.length);
    }

    @Test
    public void printPermutations_emptyString_nothingPrinted() {
        FindPerm.printPermutations("");
        String[] perms = outContent.toString().split("\n");
        assertEquals(0, perms.length);
    }

}