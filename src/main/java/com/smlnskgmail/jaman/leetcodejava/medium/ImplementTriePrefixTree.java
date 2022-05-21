package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/implement-trie-prefix-tree/
public class ImplementTriePrefixTree {

    private final Node root = new Node();

    public ImplementTriePrefixTree() {

    }

    public void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            Node node = curr.children.get(c);
            if (node == null) {
                node = new Node();
                curr.children.put(c, node);
            }
            curr = node;
        }
        curr.end = true;
    }

    public boolean search(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            Node node = curr.children.get(c);
            if (node == null) {
                return false;
            }
            curr = node;
        }
        return curr.end;
    }

    public boolean startsWith(String prefix) {
        Node curr = root;
        for (int i = 0; i < prefix.length(); i++) {
            char c = prefix.charAt(i);
            Node node = curr.children.get(c);
            if (node == null) {
                return false;
            }
            curr = node;
        }
        return true;
    }

    private static class Node {

        private final Map<Character, Node> children = new HashMap<>();
        boolean end;

    }

}
