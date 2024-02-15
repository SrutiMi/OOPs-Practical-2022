/*Create a class to print the area of a square and a rectangle.The class has two methods with the same name but different number of parameters.The method for printing area of rectangle has two parameters which are length and breadth respetively while the other method for printing area of square has one parameter which is side of square. Write a java program to create above with all the methods and a test driver main class to test compile time polymorphism 
 * 
 */
class Area {
  void area(int l, int b) {
    System.out.println("Area of rectangle is: " + (l * b));
  }

  void area(int s) {
    System.out.println("Area of square is: " + (s * s));
  }
}

public class Batch3_q1 {
  public static void main(String args[]) {
    Area a = new Area();
    a.area(10, 5);
    a.area(6);
  }

}
