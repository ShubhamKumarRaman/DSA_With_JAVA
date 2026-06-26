public class J02SinglyLinkedList {
    public class Node {
        int data;
        Node next;

        // Constructor
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // Create Operation

    // Insertion at Beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    public static void main(String args[]) {

    }
}
