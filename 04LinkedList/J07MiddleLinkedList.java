public class J07MiddleLinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // [Naive Approach] By Counting Nodes – O(n) time and O(1) space:
    public static int countNodes(Node head) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static int usingcountingNodes(Node head, int middle) {
        Node temp = head;
        while (middle > 0) {
            temp = temp.next;
            middle--;
        }
        return temp.data;
    }

    public static void main(String args[]) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);
        System.out.println(usingcountingNodes(head, countNodes(head) / 2));
    }
}
