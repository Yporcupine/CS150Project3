

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class EntryTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class EntryTest
{
    /**
     * Default constructor for test class EntryTest
     */
    public EntryTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }


    @Test
    public void  addValueTest(){
      Entry entry = new Entry("hello", 5);
      entry.addValue(10);
      String result = entry.toString();
      String expected = "hello [5, 10]";

      assertEquals(result, expected);
    }

    @Test
    public void compareToTest(){
      Entry entry1 = new Entry("hello", 6);
      Entry entry2 = new Entry("hello", 8);

      assertEquals(entry1.compareTo(entry2), 0);
    }

    @Test
    public void equalsTest(){
      Entry entry1 = new Entry("hello", 6);
      Entry entry2 = new Entry("hello", 8);

      assertTrue(entry1.equals(entry2));
    }

    @Test
    public void  toStringTest(){
      Entry entry = new Entry("hello", 5);
      entry.addValue(10);
      String result = entry.toString();
      String expected = "hello [5, 10]";

      assertEquals(result, expected);
    }
}
