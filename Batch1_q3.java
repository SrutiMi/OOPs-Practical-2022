/*
 * A class called Mypoint, which models a 2D point with x and y co-ordinates. It
 * contains:
 * (a) Two instance variables x(int) and y(int)
 * (b) A de fault constructor that construct a point at the default location of
 * (0, 0).
 * (c) A overloaded constructor that construct a point with the given x and y
 * co-ordinates.
 * (d) A method getData( ) to take values ofx and y from user.
 * (e) A method called linesegment (MyPoint m, MyPoint n) that find out the
 * gradient of the line segment and returns it from the function.
 * Write the MyPoint class in Java and also write a class Gradient-check to test
 * all the public methods defined in the class MyPoint.
 * 
 */

import java.util.*;

class MyPoint {
  int x;
  int y;

  MyPoint() {
    x = 0;
    y = 0;

  }

  MyPoint(int x, int y) {
    this.x = x;
    this.y = y;
  }

  void getData() {
    Scanner abc = new Scanner(System.in);
    System.out.println("Enter the value of x");
    x = abc.nextInt();
    System.out.println("Enter the value of y");
    y = abc.nextInt();
    abc.close();
  }

  double linesegment(MyPoint m, MyPoint n) {

    double gradient = (double) (n.y - m.y) / (n.x - m.x);
    return gradient;
  }
}

class Batch1_q3 {
  public static void main(String args[]) {
    MyPoint m = new MyPoint();
    MyPoint n = new MyPoint(50, 60);
    MyPoint o = new MyPoint();
    System.out.println("Starting point is " + m.x + " " + m.y);
    System.out.println("Ending point is " + n.x + " " + n.y);
    System.out.println("The gradient of the above line is : " + m.linesegment(m, n));

    System.out.println("Give new values for the x and y coordinates:");
    o.getData();
    System.out.println("The value are " + o.x + " " + o.y);
  }
}