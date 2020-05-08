import java.util.*;
import java.io.*;
/**
* Abstract class IndexMap - write a description of the class here
*
* @author (your name here)
* @version (version number or date here)
*/
public abstract class IndexMap
{
  // instance variables - replace the example below with your own
  EnglishWords wordBank;
  ArrayList<String> lines;
  ArrayList<ArrayList<String>> englishWords;

  /**
  * An example of a method - replace this comment with your own
  *
  * @param  y  a sample parameter for a method
  * @return    the sum of x and y
  */
  public void getLines(String filename)
  {
    try {
      Scanner scanner = new Scanner(new FileReader(filename));
      while(scanner.hasNextLine()){
        lines.add(scanner.nextLine());
      }
      scanner.close();

      for (int i = 0; i < lines.size(); i ++) {
        ArrayList<String> words = new ArrayList<String>();
        String[] lineOfWords = lines.get(i).split("[^A-Za-z]+");
        for (int j = 0; j < lineOfWords.length; j ++) {
          if(wordBank.hasWord(lineOfWords[j].toLowerCase())) {
            words.add(lineOfWords[j].toLowerCase());
          }
        }
        englishWords.add(i, words);
      }
      englishWords.add(0, new ArrayList<String>());
    } catch(Exception e) {
      System.out.println(e);
    }
  }
}
