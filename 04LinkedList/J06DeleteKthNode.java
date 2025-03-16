public class J06DeleteKthNode {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // [Expected Approach – 1] Iterative Approach – O(n) Time and O(1) Space
    public static Node usingIterative(Node head, int k) {
        Node current = head;
        Node previous = null;
        int count = 0;
        while (current != null) {
            count++;
            if (count % k == 0) {
                if (previous != null) {
                    previous.next = current.next;
                } else {
                    head = current.next;
                }
            } else {
                previous = current;
            }
            current = current.next;
        }
        return head;
    }

    // Print List
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        System.out.print("Before deletion:- ");
        printList(head);
        usingIterative(head, 2);
        System.out.print("After deletion:- ");
        printList(head);
    }
}
