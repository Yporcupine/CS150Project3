import java.util.*;
import java.io.*;
/**
* Write a description of class Test here.
*
* @author (your name)
* @version (a version number or a date)
*/
public class Test
{
  // instance variables - replace the example below with your own
  public static void main(String[] args) {

    Indices[] demos = {new SortedListIndex(), new TreemapIndex(), new HashmapIndex()};
    for (int i = 0; i < 3; i++) {
      demos[i].getLines("Shakespeare.txt");
    }
    System.out.println("Sorted List add time: " + demos[0].addToIndex());
    System.out.println("Sorted list print time: " + demos[0].printAll("output/SortedList.txt"));
    System.out.println("Tree map add time: " + demos[1].addToIndex());
    System.out.println("Tree map print time: " + demos[1].printAll("output/Treemap.txt"));
    System.out.println("Hash map add time " + demos[2].addToIndex());
    System.out.println("Hash map print time: " + demos[2].printAll("output/Hashmap.txt"));

    /*
    TreeSet<String> test = new TreeSet<String>();
    String string = "Why";
    test.add("hello");
    test.add(string.toLowerCase());
    test.add("Why");
    test.add("hello");
    System.out.println(test.toString());
    Entry one = new Entry("one");
    one.addValue(16);
    one.addValue(37483);
    System.out.println(one.toString());

    String a = "";
    String[] x = a.split("[^A-Za-z]+");
    System.out.println(x[0] == null);

    /*
    System.out.println(test.addToIndex(100));
    for (int i = 0; i < test.index.size(); i++) {
    System.out.println(test.index.get(i).toString());
    }
    */
    
    //System.out.println("ha".compareTo("hc"));

  }
}
