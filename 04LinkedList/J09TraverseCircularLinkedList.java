public class J09TraverseCircularLinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // [Expected Approach – 1] Using Iterative Method – O(n) Time and O(1) Space:
    public static void usingIteration(Node head) {
        if (head == null) {
            return;
        }
        Node current = head;
        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != head);
        System.out.println("null");
    }

    // [Expected Approach – 2] Using Recursion – O(n) Time and O(n) Space:
    public static void usingRecursion(Node head, Node current) {
        if (head == null) {
            return;
        }
        System.out.print(" -> " + current.data);
        if (current.next == head) {
            return;
        }
        usingRecursion(head, current.next);
    }

    public static void main(String args[]) {
        Node head = new Node(11);
        head.next = new Node(2);
        head.next.next = new Node(56);
        head.next.next.next = new Node(12);
        head.next.next.next.next = head;

        usingIteration(head);
        usingRecursion(head, head);
    }
}
