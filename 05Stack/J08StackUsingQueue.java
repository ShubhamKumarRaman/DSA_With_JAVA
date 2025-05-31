import java.util.LinkedList;
import java.util.Queue;

public class J08StackUsingQueue {
    // By making push() operation costly - Push in O(n) and Pop() in O(1)
    public static class stack1 {
        static Queue<Integer> q1 = new LinkedList<Integer>();
        static Queue<Integer> q2 = new LinkedList<Integer>();

        static int currentSize = 0;

        public void push(int data) {
            currentSize++;
            while (!q1.isEmpty()) {
                q2.add(q1.peek());
                q1.remove();
            }
            q1.add(data);
            while (!q2.isEmpty()) {
                q1.add(q2.peek());
                q2.remove();
            }
        }

        public int pop() {
            if (q1.isEmpty()) {
                System.out.println("Stack is Empty.");
                return -1;
            }
            currentSize--;
            int data = q1.peek();
            q1.remove();
            return data;
        }

        public void printStack() {
            System.out.println("Stack elements are: " + q1);
            System.out.println("Stack size: " + currentSize);
        }
    }

    // By making pop() operation costly - Push in O(1) and Pop() in O(n)
    public static class stack2 {
        static Queue<Integer> q1 = new LinkedList<Integer>();
        static Queue<Integer> q2 = new LinkedList<Integer>();

        static int currentSize = 0;

        public void push(int data) {
            q1.add(data);
            currentSize++;
        }

        public int pop() {
            if (q1.isEmpty()) {
                System.out.println("Stack is Empty.");
                return -1;
            }

            while (!q1.isEmpty()) {
                q2.add(q1.peek());
                q1.remove();
            }
            int data = q2.peek();
            q2.remove();
            while (!q2.isEmpty()) {
                q1.add(q2.peek());
                q2.remove();
            }
            currentSize--;
            return data;
        }

        public void printStack() {
            System.out.println("Stack elements: " + q1);
            System.out.println("Stack size: " + currentSize);
        }
    }

    public static void main(String args[]) {
        stack1 s1 = new stack1();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.printStack();

        System.out.println(s1.pop() + " element popped.");
        s1.printStack();

        System.out.println("======================================");

        stack2 s2 = new stack2();
        s2.push(10);
        s2.push(20);
        s2.push(30);
        s2.printStack();

        System.out.println(s2.pop() + " element popped.");
        s2.printStack();
    }
}
