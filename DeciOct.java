/* Batch3_q5
A class DeciOct has been defined to convert a decimal no into its equivalent octal no. */
public class DeciOct {
  int n, oct;

  DeciOct() {
    n = 0;
    oct = 0;

  }

  void getnum(int nn) {
    this.n = nn;

  }

  void deci_oct() {
    int temp = n;
    int i = 0;
    while (temp > 0) {

      oct += (temp % 8) * Math.pow(10, i);

      i++;
      temp /= 8;
    }
    System.out.println("The octal no is :" + oct);
  }

  void show() {
    System.out.println("The decimal no is :" + this.n);
    deci_oct();
  }

  public static void main(String args[]) {
    DeciOct obj = new DeciOct();
    obj.getnum(18);
    obj.show();
  }

}
