/*
 * Write a Java program to find the longest consecutive elements sequence from a
 * given unsorted array of integers and display it with its length.
 */

import java.util.*;

class Batch1_q5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array: ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the elements of the array: ");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    Arrays.sort(arr);
    int max = 1;
    int count = 1;
    int start = 0;
    int end = 0;
    for (int i = 1; i < n; i++) {
      if (arr[i] == arr[i - 1] + 1) {
        count++;
        if (count > max) {
          max = count;
          start = i - count + 1;
          end = i;
        }
      } else {
        count = 1;
      }
    }
    System.out.println("The longest consecutive elements sequence is: ");
    for (int i = start; i <= end; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println("\nThe length of the sequence is: " + max);
    sc.close();
  }
}