/*
 * Take an input string that will consist of a number of lincs of English text
 * consisting of the letters of the
 * English alphabet, the punctuation marks () apostrophe, (.) full stop (,)
 * comma, (;) semicolon, (:) colon
 * and white space characters (blank, new line). Print the words of the text in
 * reverse order without any punctuation marks other than blanks.
 * Eg 1 : This is a sample piece of text to illustrate this question.
 * The output should be :
 * If you are smart you will solve this right.
 * right this solve will you smart are you If question this illustrate to text
 * to piece sample a is This.
 */

import java.util.Scanner;

public class Batch4_q5 {
  public static void main(String args[]) {
    Scanner abc = new Scanner(System.in);
    System.out.println("Enter the multiple lines of text(press Enter twice to finish):");

    String inputText = "";
    while (abc.hasNextLine()) {
      String line = abc.nextLine();

      if (line.isEmpty()) {
        break;
      }
      inputText += line + "\n";
    }
    System.out.println("the input is " + inputText);
    String result[] = inputText.split("[',.;:\\n\\s]");
    for (int i = result.length - 1; i >= 0; i--) {
      System.out.print(result[i] + " ");
    }

    abc.close();

  }
}