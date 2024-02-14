
/*
 *  Write a program in Java to delete all consonants from an input string and print the resultant string. 
 */
import java.util.*;

public class Batch2_q3 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string: ");
    String str = sc.nextLine();
    String strNew = "";
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'A' || str.charAt(i) == 'a' || str.charAt(i) == 'E' || str.charAt(i) == 'e'
          || str.charAt(i) == 'I' || str.charAt(i) == 'i' || str.charAt(i) == 'O' || str.charAt(i) == 'o'
          || str.charAt(i) == 'U' || str.charAt(i) == 'u') {
        strNew += str.charAt(i);
      }
    }
    System.out.println("Resultant string: " + strNew);
    sc.close();
  }
}
