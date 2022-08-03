/**
 * The class containing your tests for the {@link Demo} class.  Make sure you
 * test all methods in this class (including both 
 * {@link Demo#main(String[])} and 
 * {@link Demo#isTriangle(double, double, double)}).
 */

import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;


public class DemoTest {

    @Test
    public void test_isTriangle_1() {
        assertTrue(Demo.isTriangle(3, 4, 5));
    }

    @Test
    public void test_isTriangle_2() {
        assertTrue(Demo.isTriangle(5, 3, 4));
    }

    @Test
    public void test_isTriangle_3() {
        assertTrue(Demo.isTriangle(4, 5, 3));
    }

    @Test
    public void test_isTriangle_4() {
        assertFalse(Demo.isTriangle(3, 4, 1));
    }

    @Test
    public void test_isTriangle_5() {
        assertFalse(Demo.isTriangle(3, 1, 4));
    }

    @Test
    public void test_isTriangle_6() {
        assertFalse(Demo.isTriangle(1, 4, 3));
    }

    @Test
    public void test_main_true() {
        String input = "3\n4\n5\n";

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        // Invoke
        String[] args = {};
        Demo.main(args);

        // Expected Output
        String consoleOutput = "Enter side 1: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 2: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 3: " + System.getProperty("line.separator");
        consoleOutput += "This is a triangle." + System.getProperty("line.separator");

        assertEquals(consoleOutput, out.toString());
    }

    @Test
    public void test_main_false() {
        String input = "1\n4\n3\n";

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        // Invoke
        String[] args = {};
        Demo.main(args);

        // Expected Output
        String consoleOutput = "Enter side 1: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 2: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 3: " + System.getProperty("line.separator");
        consoleOutput += "This is not a triangle." + System.getProperty("line.separator");

        assertEquals(consoleOutput, out.toString());
    }
}
