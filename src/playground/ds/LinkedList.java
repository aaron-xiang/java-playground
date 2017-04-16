package playground.ds;

public class LinkedList {
    class Node {
        int data;
        Node next;
    }

    Node head;
    int size;

    public void add(int item) {
        Node node = new Node();
        node.data = item;
        if (head == null) {
            head = node;
        } else {
            getLastNode().next = node;
        }
        size += 1;
    }

    public void removeLast() {
        removeAt(size-1);
    }

    public void removeAt(int i) {
        Node node = getNodeAt(i-1);
        if (node.next == null)
            throw new IndexOutOfBoundsException();
        node.next = node.next.next;
        size -= 1;
    }

    public int size() {
        return size;
    }

    public Node getLastNode() {
        Node last = head;
        while (last != null && last.next != null) {
            last = last.next;
        }
        return last;
    }

    public Node getNodeAt(int i) {
        if (i > size-1) {
            throw new IndexOutOfBoundsException();
        }
        Node node = head;
        for (int n = 1; n <= i; n++) {
            node = node.next;
        }
        return node;
    }
}
