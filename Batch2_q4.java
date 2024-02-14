/*
 * Create a class Box' having parameterized constructor with an object argument to breadth' and initialize length','breadth','height' and also create a method Volume( )' which returns the volume of the box. Write to create the class and a test driver main class to test all functions mentioned above. 

 */

class Box {
  int length;
  int breadth;
  int height;

  Box(int length, int breadth, int height) {
    this.length = length;
    this.breadth = breadth;
    this.height = height;
  }

  Box(Box b) {
    this.length = b.length;
    this.breadth = b.breadth;
    this.height = b.height;
  }

  int Volume() {
    return length * breadth * height;
  }
}

public class Batch2_q4 {
  public static void main(String args[]) {
    Box b1 = new Box(10, 20, 30);
    Box b2 = new Box(b1);
    System.out.println("Volume of b1: " + b1.Volume());
    System.out.println("Volume of b2: " + b2.Volume());
  }
}
