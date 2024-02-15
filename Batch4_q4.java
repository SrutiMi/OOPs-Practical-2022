
/* Write a program in Java that accepts a 2D matrix and prints the matrix with row minimum and column 
minimum values. Also find the maximum and minimum value in the 2D array. */
import java.util.*;

public class Batch4_q4 {
  public static void main(String args[]) {
    int matrix[][] = new int[3][3];
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        matrix[i][j] = new Scanner(System.in).nextInt();
      }
    }

    // printing the matrix
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        System.out.println(matrix[i][j] + " ");
      }
      System.out.println();
    }

    int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
    int minRow[] = new int[3];// size equal to the size of the matrix
    int minCol[] = new int[3];// size equal to the size of the matrix
    // for the row operations
    for (int i = 0; i < 3; i++) {

      int rowMin = Integer.MAX_VALUE;
      for (int j = 0; j < 3; j++) {
        if (rowMin > matrix[i][j]) {
          rowMin = matrix[i][j];
        }
        if (min > matrix[i][j]) {
          min = matrix[i][j];
        }
        if (max < matrix[i][j]) {
          max = matrix[i][j];
        }
      }
      minRow[i] = rowMin;
    }
    // for the column operations
    for (int i = 0; i < 3; i++) {
      int colMin = Integer.MAX_VALUE;
      for (int j = 0; j < 3; j++) {
        if (colMin > matrix[j][i]) {
          colMin = matrix[j][i];
        }
      }
      minCol[i] = colMin;
    }

    // Output
    System.out.print("Row minimum :");
    for (int i = 0; i < 3; i++) {
      System.out.print(minRow[i] + " ");
    }
    System.out.println();

    System.out.print("Column minimum :");
    for (int i = 0; i < 3; i++) {
      System.out.print(minCol[i] + " ");
    }

    System.out.println("Maximum value :" + max);
    System.out.println("Minimum value :" + min);
  }
}
