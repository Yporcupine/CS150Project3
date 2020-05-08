import java.util.*;
import java.io.*;
/**
* Write a description of class HashmapIndex here.
*
* @author (your name)
* @version (a version number or a date)
*/
public class HashmapIndex extends IndexMap implements Indices
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
    englishWords = new ArrayList<ArrayList<String>>();

    index = new HashMap<String, TreeSet<Integer>>();
  }

  /**
  * An example of a method - replace this comment with your own
  *
  * @param  y  a sample parameter for a method
  * @return    the sum of x and y
  */
  public long addToIndex(int count)
  {
    int wordcount = 0;
    int i = 0;
    long startTime = System.currentTimeMillis();
    while(wordcount < count && i < englishWords.size()){
      ArrayList<String> words = englishWords.get(i);
      if(!words.isEmpty()){
        for (int j = 0; j < words.size(); j++) {
          wordcount++;
          if(index.containsKey(words.get(j))){
            index.get(words.get(j)).add(new Integer(i));
          }
          else{
            TreeSet<Integer> values = new TreeSet<Integer>();
            values.add(new Integer(i));
            index.put(words.get(j), values);
          }
        }
      }
      i++;
    }
    return System.currentTimeMillis() - startTime;
  }

  public long addToIndex(){
    long startTime = System.currentTimeMillis();
    for(int i = 0; i < englishWords.size(); i ++){
      ArrayList<String> words = englishWords.get(i);
      if(!words.isEmpty()){
        for (int j = 0; j < words.size(); j++) {
          if(index.containsKey(words.get(j))){
            index.get(words.get(j)).add(new Integer(i));
          }
          else{
            TreeSet<Integer> values = new TreeSet<Integer>();
            values.add(new Integer(i));
            index.put(words.get(j), values);
          }
        }
      }
    }
    return System.currentTimeMillis() - startTime;
  }

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
