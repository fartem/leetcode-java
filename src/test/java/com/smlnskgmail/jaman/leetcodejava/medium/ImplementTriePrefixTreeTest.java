package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ImplementTriePrefixTreeTest {

    @Test
    public void defaultTest() {
        ImplementTriePrefixTree trie = new ImplementTriePrefixTree();
        trie.insert("apple");

        assertTrue(trie.search("apple"));
        assertFalse(trie.search("app"));
        assertTrue(trie.startsWith("app"));

        trie.insert("app");

        assertTrue(trie.search("app"));
    }

}
