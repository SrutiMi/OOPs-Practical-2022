
/* Using methods charAt() and lengths() of string class ,write a java program to print the frequency of each character in a string */
import java.util.*;

public class Batch2_q5 {
  public static boolean notPresent(String s, char c) {
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == c) {
        return false;
      }
    }
    return true;
  }

  public static void main(String args[]) {
    // String str = "hello";
    // int[] freq = new int[str.length()];
    // char[] string = str.toCharArray();
    // for(int i = 0; i < str.length(); i++) {
    // freq[i] = 1;
    // for(int j = i+1; j < str.length(); j++) {
    // if(string[i] == string[j]) {
    // freq[i]++;
    // string[j] = '0';
    // }
    // }
    // }
    // System.out.println("Characters and their corresponding frequencies");
    // for(int i = 0; i < freq.length; i++) {
    // if(string[i] != ' ' && string[i] != '0') {
    // System.out.println(string[i] + "-" + freq[i]);
    // }
    // }

    // _________________________________________
    Scanner abc = new Scanner(System.in);
    System.out.print("Enter the string:");
    String str = abc.nextLine();
    int freq[] = new int[str.length()];
    String check = "";
    int k = 0;
    for (int i = 0; i < str.length(); i++) {
      if (notPresent(check, str.charAt(i))) {
        freq[k] = 1;
        check += str.charAt(i);
        for (int j = i + 1; j < str.length(); j++) {
          if (str.charAt(i) == str.charAt(j)) {
            freq[k]++;

          }
        }
        k++;
      }
    }

    for (int i = 0; i < check.length(); i++) {
      System.out.println("Frequency of " + check.charAt(i) + " is " + freq[i]);
    }
    abc.close();
  }
}
