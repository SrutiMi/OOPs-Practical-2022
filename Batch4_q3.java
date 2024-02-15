
/*Write a Java program to design vehicle-engine with 'int speed' and int gear'. You can define your 
engine functionalities 'speed Up (value)' and 'change Gear(value)' in an interface. The class which is 
implementing the interface should implement all the methods in the interface.  */
interface Engine {
  public void speedUp(int value);

  public void changeGear(int value);
}

class Vehicle implements Engine {
  int speed;
  int gear;

  Vehicle(int speed, int gear) {
    this.speed = speed;
    this.gear = gear;
  }

  public void changeGear(int value) {
    gear = value;
    System.out.println(" Gear changed to " + value);
  }

  public void speedUp(int value) {
    speed += value;
    System.out.println(" Speed increased by " + value + " to " + speed);
  }
}

public class Batch4_q3 {
  public static void main(String[] args) {
    Vehicle v = new Vehicle(0, 0);
    v.changeGear(2);
    v.speedUp(10);
  }
}
