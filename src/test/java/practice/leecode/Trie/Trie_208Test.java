package practice.leecode.Trie;

import org.junit.Test;

import static org.junit.Assert.*;

public class Trie_208Test {

    @Test
    public void trie_1() {
        Trie_208 trie = new Trie_208();
        trie.insert("apple");
        assertTrue(trie.search("apple"));   // 返回 True
        assertFalse(trie.search("app"));     // 返回 False
        assertTrue(trie.startsWith("app")); // 返回 True
        trie.insert("app");
        assertTrue(trie.search("app"));     // 返回 True
    }

    @Test
    public void trie_2() {
        Trie_208 trie = new Trie_208();
        trie.insert("hello");
        assertFalse(trie.search("hell"));   // 返回 False
        assertFalse(trie.search("helloa"));     // 返回 False
        assertTrue(trie.search("hello")); // 返回 True
        assertTrue(trie.startsWith("hell")); // 返回 True
        assertFalse(trie.startsWith("helloa")); // 返回 False
        assertTrue(trie.startsWith("hello")); // 返回 True
    }


}