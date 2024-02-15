
/* Write a Java program to get a substring of a given string between two specified positions. 
Example: 
Input : The quick brown fox jumps over the lazy dog. Specified Positions : 10, 25 
Output: brown fox jumps */
import java.util.*;

public class Batch4_q2 {
  public static void main(String args[]) {
    System.out.println("enter the string:");
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    System.out.println("enter the start position:");
    int start = sc.nextInt();
    System.out.println("enter the end position:");
    int end = sc.nextInt();
    String newStr = "";
    if (end <= str.length() && start >= 0 && start <= end) {
      for (int i = start; i < end; i++) {
        newStr += str.charAt(i);
      }
    }
    System.out.println(newStr);
    sc.close();
  }
}
