import java.util.*;
/**
* abstract class of all index classes
*
* @author Harry Zhu
* @version 5/5/2020
*/
public abstract class Indices
{
  EnglishWords wordBank;
  ArrayList<String> lines;
  int wordcount;

  /**
  * adds all the english words from a file to the index
  *
  * @param  filename  the name of the file to be read
  * @return   the time executing the process
  */
  public abstract long addToIndex(String filename);

  /**
  * prints all the words and their line numbers in the index to a file
  *
  * @param  filename  the file to be printed in
  * @return   the time executing the process
  */
  public abstract long printAll(String filename);
}
