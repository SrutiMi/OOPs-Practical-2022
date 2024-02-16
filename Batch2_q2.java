/*
 * Create a Java program to create and display a singly linked list. Also write a list. function to reverse the singly linked list.
 */
class Node {
  int data;
  Node next;

  public Node(int data) {
    this.data = data;
    this.next = null;
  }
}

class LinkedList {
  Node head;

  public void insert(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
    } else {
      Node temp = head;
      while (temp.next != null) {
        temp = temp.next;
      }
      temp.next = newNode;
    }
  }

  public void display() {
    Node temp = head;
    while (temp != null) {
      System.out.println(temp.data + " ");
      temp = temp.next;
    }
    System.out.println();
  }

  public void reverse() {
    Node current = head;
    Node prev = null;
    Node next = null;

    while (current != null) {
      next = current.next;
      current.next = prev;
      prev = current;
      current = next;
    }

    head = prev;
  }
}

public class Batch2_q2 {
  public static void main(String args[]) {
    LinkedList linkedlist = new LinkedList();
    linkedlist.insert(1);
    linkedlist.insert(2);
    linkedlist.insert(3);
    linkedlist.insert(4);

    System.out.println("Original linked list");
    linkedlist.display();

    linkedlist.reverse();

    System.out.println("Reversed linked list");
    linkedlist.display();
  }
}
