import java.util.*;
import java.io.*;
/**
* Write a description of class EnglishWords here.
*
* @author (your name)
* @version (a version number or a date)
*/
public class EnglishWords
{
  // instance variables - replace the example below with your own
  private ArrayList<String> englishWords;

  /**
  * Constructor for objects of class EnglishWords
  */
  public EnglishWords(String filename)
  {
    try {
      Scanner scanner = new Scanner(new FileReader(filename));
      englishWords = new ArrayList<String>();
      scanner.nextLine();
      while(scanner.hasNextLine()){
        englishWords.add(scanner.nextLine());
      }
    } catch(Exception e) {
      System.out.println(e);
    }
  }

  /**
  * An example of a method - replace this comment with your own
  *
  * @param  y  a sample parameter for a method
  * @return    the sum of x and y
  */
  public boolean hasWord(String word)
  {
    return(Collections.binarySearch(englishWords, word) >= 0);
  }
}
