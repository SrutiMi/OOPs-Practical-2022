/* Write a program in Java to create a base class 'Square' having instance variable side : double'. Initiate 
variable using constructor, a method 'get Volume( ) : double' that calculates volume and print it. 
Create a derived class Cylinder' having instance variable height : double'. Initiate variables of 
both classes through constructor, override method 'get Volume(0: double' to calculate volume of 
cylinder taking 'side' variable of base class as 'radius' and print it.

*/
class Square {
  double side;

  Square(double side) {
    this.side = side;
  }

  double getVolume() {
    return side * side;
  }
}

class Cylinder extends Square {
  double height;

  Cylinder(double side, double height) {
    super(side);
    this.height = height;
  }

  double getVolume() {
    return 3.14 * side * side * height;

  }
}

public class Batch1_q4 {
  public static void main(String[] args) {
    // Create an instance of Square
    Square square = new Square(5.0);

    // Calculate and print the volume of the square
    System.out.println("Volume of Square: " + square.getVolume());

    // Create an instance of Cylinder
    Cylinder cylinder = new Cylinder(3.0, 4.0);

    // Calculate and print the volume of the cylinder
    System.out.println("Volume of Cylinder: " + cylinder.getVolume());
  }
}
