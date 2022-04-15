import java.io.*;
import java.util.*;
/**
* Write a description of class Main here.
*
* @author (your name)
* @version (a version number or a date)
*/
public class Main
{
  public static void main(String[] args) {
    try {
      String filenames[] = {"AlicesAdventuresinWonderland", "TheCalloftheWild", "TreasureIsland", "Frankenstein", "PrideandPrejudice", "GreatExpectations", "MobyDick", "Ulysses", "Middlemarch", "MothersRemedies", "WarandPeace", "SurgicalAnatomy", "TheLordOfTheRings", "Shakespeare"};
      PrintWriter time[] = {new PrintWriter(new File("output/addTime.csv")), new PrintWriter(new File("output/writeTime.csv"))};
      for(PrintWriter a : time){
        a.append(",");
        a.append("HashIndex");
        a.append(",");
        a.append("TreeIndex");
        a.append(",");
        a.append("SortedListIndex");
        a.append("\n");
      }
      for (String b : filenames) {
        for(PrintWriter a : time){
          a.append(b);
          a.append(",");
        }
        Indices[] indices = {new HashmapIndex(), new TreemapIndex(), new SortedListIndex()};
        for(Indices c : indices){
          long x = 0;
          for (int i = 0; i < 5; i++) {
            x += c.addToIndex("input/" + b + ".txt");
          }
          time[0].append(Long.toString(x/5));
          time[0].append(",");
          time[1].append(Long.toString(c.printAll("output/" + c.getClass().getName() + b + ".txt")));
          time[1].append(",");
        }

        for(PrintWriter a : time){
          a.append(Integer.toString(indices[0].wordcount));
          a.append(",");
          a.append(Integer.toString(indices[2].wordcount));
          a.append("\n");
        }
      }

      for(PrintWriter a : time){
        a.close();
      }

    } catch(Exception e) {
      System.out.println(e);
    }
  }
}
