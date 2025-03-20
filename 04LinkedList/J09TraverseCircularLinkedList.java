public class J09TraverseCircularLinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

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

    public static void main(String args[]) {
        Node head = new Node(11);
        head.next = new Node(2);
        head.next.next = new Node(56);
        head.next.next.next = new Node(12);
        head.next.next.next.next = head;

        usingIteration(head);
    }
}
