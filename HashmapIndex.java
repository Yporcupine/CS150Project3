import java.util.*;
import java.io.*;
/**
* constructing an index with a hashmap
*
* @author Harry Zhu
* @version 5/5/2020
*/
public class HashmapIndex extends Indices
{
  // instance variables - replace the example below with your own
  HashMap<String, TreeSet<Integer>> index;

  /**
  * Constructor for objects of class HashmapIndex
  */
  public HashmapIndex()
  {
    // initialise instance variables
    wordBank = new EnglishWords("English.txt");
    lines = new ArrayList<String>();

    index = new HashMap<String, TreeSet<Integer>>();
  }

  /**
  * adds all the english words from a file to the index
  *
  * @param  filename  the name of the file to be read
  * @return   the time executing the process
  */
  public long addToIndex(String filename){
    index.clear();
    lines.clear();
    wordcount = 0;
    long startTime = System.currentTimeMillis();
    try {
      lines.add("");
      Scanner scanner = new Scanner(new FileReader(filename));
      while(scanner.hasNextLine()){
        lines.add(scanner.nextLine());
      }
      scanner.close();

      for (int i = 0; i < lines.size(); i ++) {
        String[] lineOfWords = lines.get(i).split("[^A-Za-z]+");
        for (int j = 0; j < lineOfWords.length; j ++){
          if(wordBank.hasWord(lineOfWords[j].toLowerCase())) {
            wordcount++;
            if(index.containsKey(lineOfWords[j].toLowerCase())){
              index.get(lineOfWords[j].toLowerCase()).add(new Integer(i));
            }
            else{
              TreeSet<Integer> values = new TreeSet<Integer>();
              values.add(new Integer(i));
              index.put(lineOfWords[j].toLowerCase(), values);
            }
          }
        }
      }
    }catch(Exception e) {
      System.out.println(e);
    }
    return System.currentTimeMillis() - startTime;
  }


  /**
  * prints all the words and their line numbers in the index to a file
  *
  * @param  filename  the file to be printed in
  * @return   the time executing the process
  */
  public long printAll(String filename){
    long startTime = System.currentTimeMillis();
    try {
      PrintWriter print = new PrintWriter(new File(filename));
      ArrayList<String> keys = new ArrayList<String>(index.keySet());
      Collections.sort(keys);
      for(String a : keys) {
        print.println(a + " " + index.get(a).toString());
      }
      print.close();
    } catch(Exception e) {
      System.out.println(e);
    }
    return System.currentTimeMillis() - startTime;
  }
}
