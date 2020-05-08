
/**
 * Write a description of class Test2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Test2
{
    public static void main(String[] args) {
      Indices test2 = new TreemapIndex();
      test2.getLines("Shakespeare.txt");

      for (int i = 0; i < 10; i++) {
        System.out.println(test2.addToIndex());
      }
    }
}
