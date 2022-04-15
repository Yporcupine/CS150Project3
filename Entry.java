import java.util.*;
/**
* entry class for SortedListIndex map
*
* @author Harry Zhu
* @version 5/5/2020
*/
public class Entry implements Comparable<Entry>
{
  // instance variables - replace the example below with your own
  public String key;
  public TreeSet<Integer> values;

  /**
  * Constructor for objects of class Entry
  */
  public Entry(String key, int line)
  {
    this.key = key;
    values = new TreeSet<Integer>();
    values.add(new Integer(line));
  }
  /**
  * adding a integer value to the Entry
  *
  * @param  line  the line number to be added
  */
  public void addValue(int line){
    values.add(new Integer(line));
  }

  /**
  * compares two entry class
  *
  * @param  e  the other entry to be compared
  * @return    the difference
  */
  public int compareTo(Entry e){
    return key.compareTo(e.key);
  }

  /**
  * compares two entry class to see if they are equal
  *
  * @param  o  the other entry to be compared
  * @return    whether they are the same
  */
  @Override
  public boolean equals(Object o){
    if(!(o instanceof Entry)) return true;
    Entry e = (Entry)o;
    return key.equals(e.key);
  }

  /**
  * prints the entry class to a string
  *
  *
  * @return    the key and all the line numbers
  */
  @Override
  public String toString(){
    return key + " " +  values.toString();
  }

}
