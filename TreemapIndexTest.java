

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TreemapIndexTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TreemapIndexTest
{
    /**
     * Default constructor for test class TreemapIndexTest
     */
    public TreemapIndexTest()
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
      Indices index = new TreemapIndex();
      index.addToIndex("input/AlicesAdventuresinWonderland.txt");

      assertEquals(index.wordcount, 30227);
    }

    @Test
    public void printAllTest(){
      Indices index = new TreemapIndex();
      index.addToIndex("input/AlicesAdventuresinWonderland.txt");
      index.printAll("sample/test.txt");

      assertEquals(index.wordcount, 30227);
    }
}
