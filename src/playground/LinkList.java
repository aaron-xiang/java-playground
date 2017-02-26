package playground;

/**
 * Created by aaron on 2/3/17.
 */
public class LinkList {

//
//    private class Node {
//        int ID;
//        Node prev;
//        Node next;
//        public Node (int id) {
//            ID = id;
//            next = null;
//            prev = null;
//        }
//    }
//    Node head;
//    Node tail;
//    int listCount;
//
//    public LinkList() {
//        head = null;
//        tail = null;
//        listCount = 0;
//    }
//
//    void myAppend(Node node) {
//        if (listCount == 0) {
//            head = node;
//            tail = node;
//        } else {
//            tail.next = node;
//            node.prev = tail;
//            tail = node;
//        }
//        listCount++;
//    }
//
//    void myDelete(int id) {
//        Node info = head;
//        for (int i = 0; i < listCount; i++) {
//            if (info.ID == id) {
//                if (i == 0) {
//                    head = info.next;
//                    info = null;
//                }
//                else if () {
//                    tail = info.prev;
//                    info = null;
//                }
//
//                info.prev.next = info.next;
//                info.next.prev = info.prev;
//                info = null;
//            }
//            else {
//                info = info.next;
//            }
//        }
//    }
//
//    void myPreppend(Node node) {
//        if (listCount == 0) {
//            head = node;
//            tail = node;
//        }
//        else {
//            node.next = head;
//            head.prev = node;
//            head = node;
//        }
//    }
//
//    public void append(int id) {
//        Node node  = new Node(id);
//        myAppend(node);
//    }
//
//    public void preppend(int id) {
//
//    }
//
//
//    public void print() {
//        Node info = head;
//        for (int c = 0; c < listCount; c++) {
//            System.out.println(info.ID);
//            info = info.next;
//        }
//    }
//
//
//
//    public static void main(String[] args) {
//        LinkList list = new LinkList();
//        list.append(3);
//        list.append(4);
//        list.append(5);
//        list.print();
//    }

}
