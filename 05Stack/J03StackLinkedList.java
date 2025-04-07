import java.util.Scanner;

public class J03StackLinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    public boolean isEmpty() {
        return head == null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int top = head.data;
        head = head.next;
        return top;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return head.data;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.println("|  " + temp.data + "  |");
            temp = temp.next;
        }
        System.out.println("--------");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        J03StackLinkedList s = new J03StackLinkedList();

        int choice, value;
        do {
            System.out.println("---------------------------");
            System.out.println("0. Exit");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.print("Enter Your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 0:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                case 1:
                    System.out.print("Enter the value: ");
                    value = sc.nextInt();
                    s.push(value);
                    break;
                case 2:
                    value = s.pop();
                    if (value != -1) {
                        System.out.println(value + " is popped from stack.");
                    }
                    break;
                case 3:
                    value = s.peek();
                    if (value != -1) {
                        System.out.println(value + " is peeked from stack.");
                    }
                    break;
                case 4:
                    s.display();
                    break;
                default:
                    System.out.println("Invalid choice..! Choose correct option ......!");
                    break;
            }
        } while (choice != 0);
        sc.close();
    }
}
