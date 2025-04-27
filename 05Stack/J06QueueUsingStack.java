import java.util.Stack;

public class J06QueueUsingStack {
    // By Making Enqueue Operation Costly
    public static class QueueEn {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        void enqueue(int data) {
            while (!s1.isEmpty()) {
                s2.push(s1.peek());
                s1.pop();
            }
            s1.push(data);

            while (!s2.isEmpty()) {
                s1.push(s2.peek());
                s2.pop();
            }
        }

        int dequeue() {
            if (s1.isEmpty()) {
                return -1;
            }
            int value = s1.peek();
            s1.pop();
            return value;
        }
    }

    public static void main(String args[]) {
        QueueEn q1 = new QueueEn();
        q1.enqueue(1);
        q1.enqueue(2);
        q1.enqueue(3);
        System.out.println(q1.s1);
        System.out.println(q1.dequeue());
        System.out.println(q1.dequeue());
        System.out.println(q1.dequeue());

    }
}
