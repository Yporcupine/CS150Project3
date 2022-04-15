import java.util.*;
import java.io.*;
/**
* demonstration for class
*
* @author harry Zhu
* @version 5/7/2020
*/
public class Test
{
  // instance variables - replace the example below with your own
  public static void main(String[] args) {
    int trials = 1;

    Indices[] demos = {new HashmapIndex(), new TreemapIndex(), new SortedListIndex()};
    long[] data = {0, 0, 0, 0, 0, 0};
    for (int j = 0; j < trials; j++) {
      for (int i = 0; i < 3; i++) {
        data[2 * i] += demos[i].addToIndex("Shakespeare.txt");
        data[2*i + 1] += demos[i].printAll("output/" + demos[i].getClass().getName() + ".txt");
      }
    }
    for (int i = 0; i < 3; i++) {
      System.out.println(demos[i].getClass().getName() + " add time: " + data[2*i]/trials);
      System.out.println(demos[i].getClass().getName() + " print time: " + data[2*i + 1]/trials);
    }
    System.out.println();

    /*
    System.out.println("Hash map add time: " + data[0]/trials);
    //demos[0].addToIndex());
    System.out.println("Hash map print time: " + data[1]/trials);
    //demos[0].printAll("output/Hashmap.txt"));
    System.out.println("Tree map add time: " + data[2]/5);
    // demos[1].addToIndex());
    System.out.println("Tree map print time: " + data[3]/5);
    //demos[1].printAll("output/Treemap.txt"));
    System.out.println("Sorted List add time: " + data[4]/5);
    //demos[2].addToIndex());
    System.out.println("Sorted list print time: " + data[5]/5);
    //demos[2].printAll("output/SortedList.txt"));

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
