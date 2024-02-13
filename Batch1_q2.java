/* Write a program in Java to create your own exception as Negative Exception whenever negative 
values are put in an array */

import java.util.*;

class NegativeException extends Exception {
  public NegativeException(String message) {
    super(message);
  }
}

public class Batch1_q2 {
  public static void main(String args[]) {
    Scanner abc = new Scanner(System.in);
    System.out.println("Enter the size of the array: ");
    int size = abc.nextInt();
    int arr[] = new int[size];
    System.out.println("Enter the elements of the array: ");
    for (int i = 0; i < size; i++) {
      arr[i] = abc.nextInt();
    }

    // Exception handling
    try {
      validateArray(arr);// to validate the array
      System.out.println("Array is valid:");
    } catch (NegativeException e) {
      System.out.println("Error: " + e.getMessage());
    } finally {
      abc.close();
    }
  }

  // method to validate the array for negative values
  // throws NegativeException: This part of the method signature indicates that
  // the validateArray method may throw a checked exception of type
  public static void validateArray(int arr[]) throws NegativeException {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < 0) {
        throw new NegativeException("Negative value found " + arr[i]);
      }
    }
  }
}
