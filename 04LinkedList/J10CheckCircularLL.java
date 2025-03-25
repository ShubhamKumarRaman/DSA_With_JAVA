public class J10CheckCircularLL {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // [Expected Approach-1] By Traversing each node – O(n) time and O(1) space
    public static boolean TraverseAllNode(Node head) {
        if (head == null)
            return true;
        Node temp = head;
        while (temp.next != null && temp.next != head) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null) {
            return false;
        }
        return true;
    }

    public static void main(String args[]) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        System.out.println(TraverseAllNode(head) ? "Yes" : "No");
        head.next.next.next.next = head;
        System.out.println(TraverseAllNode(head) ? "Yes" : "No");
    }
}
