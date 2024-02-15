
/*WAP to replace a specified with another character.Also print the no of times a specified character is relaced
 * 
 */
import java.util.Scanner;

public class Batch3_q3 {

  public static void main(String args[]) {
    Scanner abc = new Scanner(System.in);
    System.out.println("Enter the string");
    String str = abc.nextLine();
    System.out.println("Enter the character to be replaced");
    char r = abc.next().charAt(0);
    System.out.println("Enter the character to be replaced with");
    char c = abc.next().charAt(0);

    String newString = "";
    for (int i = 0; i < str.length(); i++) {
      if (r == str.charAt(i)) {
        newString += c;
      } else {
        newString += str.charAt(i);
      }
    }
    System.out.println("The new string is : " + newString);
    abc.close();

  }

}
