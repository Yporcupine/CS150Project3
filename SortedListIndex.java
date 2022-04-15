import java.util.*;
import java.io.*;
/**
* constructing an index with a sorted ArrayList
*
* @author Harry Zhu
* @version 5/5/2020
*/
public class SortedListIndex extends Indices
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

    index = new ArrayList<Entry>();
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
            Entry entry = new Entry(lineOfWords[j].toLowerCase(), i);
            int x =  Collections.binarySearch(index, entry);
            if(x >= 0 ){
              index.get(x).addValue(i);
            }
            else{
              index.add((-x-1),entry);
            }
          }
        }
      }
    }catch(Exception e){
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
