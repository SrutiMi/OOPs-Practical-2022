/*
 * Write a program to create two threads,one prints 'Hello' and other prints 'Hi'.
 */

class PrintHello implements Runnable {
  public void run() {
    System.out.println("Hello");

  }

}

class PrintHi implements Runnable {
  public void run() {
    System.out.println("Hi");

  }
}

public class Batch2_q6 {
  public static void main(String args[]) {
    // Creating instances of the two Runnable classes
    PrintHello hello = new PrintHello();
    PrintHi hi = new PrintHi();

    // Creating two threads
    Thread threadhello = new Thread(hello);
    Thread threadhi = new Thread(hi);

    // Starting thr threads
    threadhello.start();
    threadhi.start();

  }

}
