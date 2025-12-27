public class J13SinglyToCircular {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // [Expected Approach - 1] Using Recursion - O(n) Time and O(n) Space:
    public static void usingRecursion(Node curr, Node head) {
        if (curr.next == null) {
            curr.next = head;
            return;
        }
        usingRecursion(curr.next, head);
    }

    // [Expected Approach - 2] Using Iterative Approach - O(n) Time and O(1) Space:
    public static Node usingIteration(Node head) {
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = head;
        return head;
    }

    // Print Linked-List
    public static void printList(Node head) {
        Node curr = head;
        do {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        } while (curr != head);

        System.out.println("null");
    }

    public static void main(String args[]) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        usingRecursion(head, head);
        printList(head);

        Node head1 = new Node(100);
        head1.next = new Node(200);
        head1.next.next = new Node(300);
        head1.next.next.next = new Node(400);

        usingIteration(head1);
        printList(head1);
    }
}
