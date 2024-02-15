/* A superclass Worker has been defined to store the details of a worker. Define a sub-class Wages to 
compute the monthly wages for the worker. The details/ specifications of both the classes are given below:
Class name: Worker
Data Members/instance variables : 
Name : to store the name of the worker 
Basic : to store the basic pay in decimals 
Member functions : 
(2) 
void display (): display the worker's details 
Worker (...): Parameterised constructor to assign values to the instance variables 
Class name : Wages 
Data Members/instance variables : 
hrs :stores the hours worked 
rate : stores rate per hour 
wage : stores the overall wage of the worker 
Member functions : 
Wages (..) : Parameterised constructor to assign values to the instance variables of both the classes. 
double overtime (): Calculates and returns the overtime amount as (hours*rate) 
void display (): Calculates the wage using the formula wage = overtime amount + Basic pay and displays it along with the other details 
Specify the class Worker giving details of the constructor () and void display ( ). Using the concept of 
inheritance, specify the class Wages giving details of constructor ( ), double-overtime ( ) and void 
display ()
*/
class Worker {
  String name;
  double basic;

  Worker(String name, double basic) {
    this.name = name;
    this.basic = basic;
  }

  void display() {
    System.out.println("Name: " + name);
    System.out.println("Basic: " + basic);

  }
}

class Wages extends Worker {
  double hrs;
  double rate;
  double wage;

  Wages(String name, double basic, double hrs, double rate, double wage) {
    super(name, basic);
    this.hrs = hrs;
    this.rate = rate;
    this.wage = wage;

  }

  double overtime() {
    return hrs * rate;

  }

  void display() {
    super.display();
    System.out.println("Wage: " + (overtime() + basic));

  }
}

public class Batch4_q6 {
  public static void main(String args[]) {
    Wages w = new Wages("Rahul", 1000, 10, 100, 0);
    w.display();
  }
}
