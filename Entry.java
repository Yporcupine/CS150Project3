import java.util.*;
/**
* Write a description of class Entry here.
*
* @author (your name)
* @version (a version number or a date)
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

  public void addValue(int line){
    values.add(new Integer(line));
  }

  /**
  * An example of a method - replace this comment with your own
  *
  * @param  y  a sample parameter for a method
  * @return    the sum of x and y
  */
  public int compareTo(Entry e){
    return key.compareTo(e.key);
  }

  @Override
  public boolean equals(Object o){
    if(!(o instanceof Entry)) return true;
    Entry e = (Entry)o;
    return key.equals(e.key);
  }

  @Override
  public String toString(){
    return key + " " +  values.toString();
  }

}
