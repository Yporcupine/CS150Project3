

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class EnglishWordsTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class EnglishWordsTest
{
    /**
     * Default constructor for test class EnglishWordsTest
     */
    public EnglishWordsTest()
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
    public void hasWordTest(){
      EnglishWords dic = new EnglishWords("English.txt");

      assertTrue(dic.hasWord("hello"));
    }
}
