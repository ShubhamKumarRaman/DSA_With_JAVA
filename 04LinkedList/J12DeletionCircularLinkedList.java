public class J12DeletionCircularLinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // 1. Deletion from the beginning of the circular linked list
    public static Node deleteFirst(Node last) {
        if (last == null) {
            System.out.println("List is Empty.");
            return null;
        }

        Node head = last.next;
        if (head == last) {
            last = null;
        } else {
            last.next = head.next;
        }
        return last;
    }

    // 2. Deletion at specific position in circular linked list
    public static Node deletePosition(Node last, int key) {
        if (last == null) {
            System.out.println("List is Empty, Nothing to delete");
            return null;
        }
        Node current = last.next;
        Node previous = last;

        if (current == last && current.data == key) {
            last = null;
            return last;
        }

        if (current.data == key) {
            last.next = current.next;
            return last;
        }

        while (current != last && current.data != key) {
            previous = current;
            current = current.next;
        }

        if (current.data == key) {
            previous.next = current.next;
            if (current == last) {
                last = previous;
            }
        } else {
            System.out.println("Key not found");
        }
        return last;
    }

    public static void printList(Node last) {
        if (last == null) {
            System.out.println("List is Empty.");
            return;
        }
        Node current = last.next;
        while (true) {
            System.out.print(" -> " + current.data);
            current = current.next;
            if (current == last.next) {
                break;
            }
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        Node last = head.next.next.next;
        last.next = head;

        printList(last);
        deleteFirst(last);
        printList(last);

        deletePosition(last, 50);
        printList(last);

    }
}
