/* Create a class Adder' having methods int add(int, int)': int add(int, int, int)' and 
double add(double, double)' all of them calculate sum of different numbers and print it. Write a java 
program to create above class with all the methods and a test driver main class to test compile time 
polymorphism.*/

class Adder {
  int add(int a, int b) {
    return a + b;
  }

  int add(int a, int b, int c) {
    return a + b + c;
  }

  double add(double a, double b) {
    return a + b;
  }
}

public class Batch4_q1 {
  public static void main(String[] args) {
    Adder obj = new Adder();
    System.out.println(obj.add(1, 2));
    System.out.println(obj.add(2.5, 2.5));
  }

}
