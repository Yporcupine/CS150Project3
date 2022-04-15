

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class SortedListIndexTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class SortedListIndexTest
{
    /**
     * Default constructor for test class SortedListIndexTest
     */
    public SortedListIndexTest()
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
    public void addToIndexTest(){
      Indices index = new SortedListIndex();
      index.addToIndex("input/AlicesAdventuresinWonderland.txt");

      assertEquals(index.wordcount, 30227);
    }

    @Test
    public void printAllTest(){
      Indices index = new SortedListIndex();
      index.addToIndex("input/AlicesAdventuresinWonderland.txt");
      index.printAll("sample/test.txt");

      assertEquals(index.wordcount, 30227);
    }
}
