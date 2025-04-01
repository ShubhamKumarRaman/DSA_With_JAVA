public class J11CountNodesCircularLL {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Using linear traversal – O(n) time and O(1) space
    public static int countNodes(Node head) {
        Node temp = head;
        int count = 0;
        do {
            temp = temp.next;
            count++;
        } while (temp != head);
        return count;
    }

    public static void main(String args[]) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = head;
        System.out.println("Number of Nodes: " + countNodes(head));
    }
}
