package playground.ds;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TrieTest {
    Trie trie;

    @Before
    public void setup() {
        trie = new Trie();
    }

    @Test
    public void testInsertAndFind() throws Exception {
        List<String> words = new ArrayList<>();
        words.add("hello");
        words.add("world");
        words.add("about");
        words.add("java");
        String wordIncluded = "hello";
        String wordExcluded = "test";
        for (String w : words) {
            trie.insert(w);
        }
        assertEquals(true, trie.find(wordIncluded));
        assertEquals(false, trie.find(wordExcluded));
    }

}