package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.Objects;

// https://leetcode.com/problems/design-hashmap/
public class DesignHashMap {

    private final Entry[] entries = new Entry[500];

    public void put(int key, int value) {
        int i = indexFor(Objects.hashCode(key), entries.length);
        Entry e = entries[i];
        if (e != null) {
            if (e.key == key) {
                e.value = value;
            } else {
                Entry p = e;
                while (e != null) {
                    if (e.key == key) {
                        e.value = value;
                        break;
                    }
                    p = e;
                    e = e.next;
                }
                if (e == null) {
                    p.next = new Entry(key, value);
                }
            }
        } else {
            entries[i] = new Entry(key, value);
        }
    }

    private int indexFor(int hash, int length) {
        return hash & (length - 1);
    }

    public int get(int key) {
        int i = indexFor(Objects.hashCode(key), entries.length);
        Entry e = entries[i];
        if (e != null) {
            do {
                if (e.key == key) {
                    return e.value;
                }
                e = e.next;
            } while (e != null);
        }
        return -1;
    }

    public void remove(int key) {
        int i = indexFor(Objects.hashCode(key), entries.length);
        Entry e = entries[i];
        if (e != null) {
            if (e.key == key) {
                entries[i] = e.next;
            } else {
                Entry p = e;
                e = e.next;
                while (e != null) {
                    if (e.key == key) {
                        p.next = e.next;
                    }
                    p = e;
                    e = e.next;
                }
            }
        }
    }

    private static class Entry {
        public int key;
        public int value;
        public Entry next;

        public Entry(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }


}
