public class J14ChangeFirstLastCircular {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void printList(Node head) {
        Node current = head;
        do {
            System.out.print(" -> " + current.data);
            current = current.next;
        } while (current != head);
        System.out.println();
    }

    // Method 1: (By Changing Links of First and Last Nodes)
    public static Node changeFirstLastNode(Node head){
        
    }

    // Method 2: (By Swapping Values of First and Last nodes)
    public static Node changeFirstLast(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node current = head;
        do {
            current = current.next;
        } while (current.next != head);

        head.data = head.data + current.data - (current.data = head.data);
        return head;
    }

    public static void main(String args[]) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = head;
        printList(head);
        changeFirstLast(head);
        printList(head);
    }
}
