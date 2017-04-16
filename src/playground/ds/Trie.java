package playground.ds;

import java.util.HashMap;
import java.util.Map;

public class Trie {
    public static class Node {
        String value;
        Map<Character, Node> children = new HashMap<>();
    }

    Node root = new Node();

    public void insert(String word) {
        Node currentNode = root;
        for (Character c : word.toLowerCase().toCharArray()) {
            currentNode.children.put(c, new Node());
            currentNode = currentNode.children.get(c);
        }

    }

    public boolean find(String word) {
        Node currentNode = root;
        for (Character c : word.toLowerCase().toCharArray()) {
            if (currentNode.children.containsKey(c)) {
                currentNode = currentNode.children.get(c);
            } else {
                return false;
            }
        }
        return true;
    }
}
