
/* Write a program in Java with class Employee and do the following operations on it 
(a) Create two constructor default and with object as parameter to initialize class variable.
(b)Create a function 'Calculate' which calculates the HRA, DA and gross on the basic pay of an object. HRA = 12% of basic pay, gross = basic pay + HRA + DA
DA = 3% of basic pay
(c) Display the details of the employees whose gross is more than Rs.50,000. 
 * 
 */
import java.util.ArrayList;

class Employee {
  String name;
  double basicPay;
  double HRA;
  double DA;
  double gross;

  Employee(String name, double basicPay) {
    this.name = name;
    this.basicPay = basicPay;
    Calculate();
  }

  Employee() {
    name = "unknown";
    basicPay = 0;
    Calculate();

  }

  void Calculate() {
    HRA = 0.12 * basicPay;
    DA = 0.03 * basicPay;
    gross = basicPay + HRA + DA;

  }

  void display() {
    System.out.println("Employee Details");
    System.out.println("Name: " + name);
    System.out.println("Basic Pay: " + basicPay);
    System.out.println("HRA: " + HRA);
    System.out.println("DA: " + DA);
    System.out.println("Gross: " + gross);

  }
}

public class Batch2_q1 {
  public static void main(String args[]) {
    ArrayList<Employee> employee = new ArrayList<>();
    employee.add(new Employee("John", 50000));
    employee.add(new Employee("Doe", 60000));
    employee.add(new Employee("Jane", 70000));

    System.out.println("Emplyees with gross more than Rs.50,000: ");
    for (int i = 0; i < employee.size(); i++) {
      Employee emp = employee.get(i);
      if (emp.gross > 50000.0) {
        emp.display();
      }
    }

  }

}
