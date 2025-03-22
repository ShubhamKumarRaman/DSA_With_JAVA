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
        while(temp!=null || temp!=head){
            
        }
    }

    public static void main(String args[]) {

    }
}
