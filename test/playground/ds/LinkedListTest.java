package playground.ds;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinkedListTest {
    LinkedList linkedList;

    @Before
    public void setup() {
        linkedList = new LinkedList();
    }

    @Test
    public void testAddNodes() throws Exception {
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        assertEquals(4, linkedList.size());
        assertEquals(1, linkedList.getNodeAt(0).data);
        assertEquals(2, linkedList.getNodeAt(1).data);
        assertEquals(3, linkedList.getNodeAt(2).data);
        assertEquals(4, linkedList.getNodeAt(3).data);
    }

    @Test
    public void testRemoveNodes() throws Exception {
        linkedList.add(0);
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        LinkedList.Node node = linkedList.getNodeAt(3);
        linkedList.removeAt(2);
        assertEquals(node.data, linkedList.getNodeAt(2).data);
    }

    @Test
    public void testRemoveLast() throws Exception {
        linkedList.add(0);
        linkedList.add(1);
        linkedList.add(2);
        linkedList.removeLast();
        assertEquals(1, linkedList.getLastNode().data);
    }

}