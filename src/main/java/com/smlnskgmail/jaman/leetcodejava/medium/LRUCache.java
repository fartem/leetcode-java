package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/lru-cache/
public class LRUCache {

    private final Node head = new Node();
    private final Node tail = new Node();

    private final Map<Integer, Node> cache;

    private final int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        cache = new HashMap<>(capacity);
        head.next = tail;
        tail.previous = head;
    }

    public int get(int key) {
        Node node = cache.get(key);
        if (node != null) {
            remove(node);
            add(node);
            return node.val;
        }
        return -1;
    }

    public void put(int key, int value) {
        Node node = cache.get(value);
        if (node != null) {
            remove(node);
            node.val = value;
            add(node);
        } else {
            if (cache.size() == capacity) {
                cache.remove(tail.previous.key);
                remove(tail.previous);
            }
            node = new Node();
            node.key = key;
            node.val = value;
            cache.put(key, node);
            add(node);
        }
    }

    private void add(Node node) {
        Node next = head.next;
        head.next = node;
        next.previous = node;
        node.next = next;
        node.previous = head;
    }

    private void remove(Node node) {
        Node next = node.next;
        Node previous = node.previous;

        next.previous = previous;
        previous.next = next;
    }

    private class Node {

        int key;
        int val;

        Node previous;
        Node next;

    }

}
