import java.util.*;
import java.io.*;
/**
* Write a description of class SortedListIndex here.
*
* @author (your name)
* @version (a version number or a date)
*/
public class SortedListIndex extends IndexMap implements Indices
{
  // instance variables - replace the example below with your own
  ArrayList<Entry> index;

  /**
  * Constructor for objects of class SortedListIndex
  */
  public SortedListIndex()
  {
    wordBank = new EnglishWords("English.txt");
    lines = new ArrayList<String>();
    englishWords = new ArrayList<ArrayList<String>>();

    index = new ArrayList<Entry>();
  }

  /**
  * An example of a method - replace this comment with your own
  *
  * @param  y  a sample parameter for a method
  * @return    the sum of x and y
  */
  public long addToIndex(int count){
    int wordcount = 0;
    int i = 0;
    long startTime = System.currentTimeMillis();
    while(wordcount < count && i < englishWords.size()){
      ArrayList<String> words = englishWords.get(i);
      if(!words.isEmpty()){
        for (int j = 0; j < words.size(); j++) {
          wordcount++;
          Entry entry = new Entry(words.get(j), i);
          int x = Collections.binarySearch(index, entry);
          if(x >= 0 ){
            index.get(x).addValue(i);
          }
          else{
            index.add((-x-1),entry);
          }
        }
      }
      i++;
    }
    return System.currentTimeMillis() - startTime;
  }

  public long addToIndex(){
    long startTime = System.currentTimeMillis();
    for (int i = 0; i < englishWords.size(); i++) {
      ArrayList<String> words = englishWords.get(i);
      if(!words.isEmpty()){
        for (int j = 0; j < words.size(); j++) {
          Entry entry = new Entry(words.get(j), i);
          int x = Collections.binarySearch(index, entry);
          if(x >= 0 ){
            index.get(x).addValue(i);
          }
          else{
            index.add((-x-1),entry);
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

      for (int i = 0; i < index.size(); i++) {
        print.println(index.get(i).toString());
      }
      print.close();
    } catch(Exception e) {
      System.out.println(e);
    }
    return System.currentTimeMillis() - startTime;
  }

}
