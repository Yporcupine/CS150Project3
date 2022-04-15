import java.util.*;
import java.io.*;
/**
* constructing an english dictionary to check whether a word is an english word
*
* @author Harry Zhu
* @version 5/5/2020
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
  * checks whether a word exists in the dictionary with binary search
  *
  * @param  word  the word to be checked
  * @return    whether the word is in the dictionary
  */
  public boolean hasWord(String word)
  {
    return(Collections.binarySearch(englishWords, word) >= 0);
  }
}
