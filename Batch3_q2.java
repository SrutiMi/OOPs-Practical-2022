/*
 * Create a base class 'Square' having instance variable side(data type double).Initiate variable using constructor a method 'double getVolume()' that calculates volume and print it. Create a derived class 'Cylinder' having instance variable height(data type double).Initiate variables of both classes through consructor, override method double getVolume() to claculate volume of cylinder taking 'side' variable of base class as radius and print it .Write a java program to create above two classes and a test driver main class to test driver main class to test all the above mentioned inheritance properties
 */

class Square {
  double side;

  Square() {
    side = 0;
  }

  Square(double side) {
    this.side = side;
  }

  double getVolume() {
    return side * side * side;
  }
}

class Cylinder extends Square {
  double height;

  Cylinder(double radius, double height) {
    super(radius);
    this.height = height;
  }

  double getVolume() {
    return 3.14 * side * side * height;
  }
}

public class Batch3_q2 {
  public static void main(String args[]) {
    Square s = new Square();
    s.side = 50;
    System.out.println("The volume of square is :" + s.getVolume());
    Cylinder c = new Cylinder(2, 5);
    System.out.println("The volume of the cylinder is :" + c.getVolume());
  }
}
