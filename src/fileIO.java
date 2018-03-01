import java.util.*;
import java.util.Scanner;
import java.io.*;

class files{
  private String specialLine1;
  private ArrayList<String> rideLines;
  private ArrayList<Integer> intSpecialFirstLine;
  private ArrayList<Integer> intRideLines;

  public files(String fileToUse) throws FileNotFoundException {
    rideLines = new ArrayList<>();
    intSpecialFirstLine = new ArrayList<>();
    intRideLines = new ArrayList<>();
    Scanner thefile = new Scanner(new File(fileToUse));
    specialLine1 = thefile.nextLine(); //Get the special first line
    while (thefile.hasNextLine()) { //Read every line one at a time
        String line = thefile.nextLine(); //Save the line as a string
        rideLines.add(line); //Add the record to Array
    }
    thefile.close(); //close the file
  }

  public ArrayList<Integer> parseAttributesAitor(){
    String[] tempHelp = specialLine1.split(" ");
    int len = tempHelp.length;
    for (int i = 0; i < len; i++){
      intSpecialFirstLine.add(Integer.parseInt(tempHelp[i]));
    }
    return intSpecialFirstLine;
  }
  public ArrayList<Integer> parseAttributesKamman(){
    if (rideLines.size() == 0){
      throw new ArrayIndexOutOfBoundsException("How weird");
    }
    for (int i = 0; i < rideLines.size(); i++){
      String[] tempHelp = rideLines.get(i).split(" ");
      int len = tempHelp.length;
      for (int j = 0; j < len; j++){
        intRideLines.add(Integer.parseInt(tempHelp[j]));
      }
    }
    return intRideLines;
  }
}
public class fileIO{
  public static void main(String[] args) throws FileNotFoundException{
    files test = new files("a_example.in");
    System.out.println(test.parseAttributesAitor().toString());
    System.out.println(test.parseAttributesKamman().toString());
  }
}
