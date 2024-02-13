
/*Write a Java method to count all words in a string and reverse every word and display them.*/
import java.util.*;

class Batch1_q1 {
  public static String reverseWord(String wrd) {
    String rev = "";
    for (int i = wrd.length() - 1; i >= 0; i--) {
      rev += wrd.charAt(i);
    }
    return rev;
  }

  public static void main(String args[]) {
    Scanner abc = new Scanner(System.in);
    System.out.println("Enter the string:");
    String sent = abc.nextLine();

    String words[] = (sent.trim()).split(" ");
    int count = words.length;

    System.out.println("The no of words in the sentence " + sent + " is " + count);
    String revString = "";
    for (int i = 0; i < words.length; i++) {
      revString += "" + reverseWord(words[i]);
    }
    System.out.println("The reverse of the words in the sentence " + sent + " is " + revString);
    abc.close();
  }
}