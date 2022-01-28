package com.smlnskgmail.jaman.leetcodejava.support;

public class ListNodeWithRandom {

    public static boolean areEqual(ListNodeWithRandom l1, ListNodeWithRandom l2) {
        while (l1 != null && l2 != null) {
            if (l1.random != null && l2.random != null && l1.random.val != l2.random.val) {
                return false;
            }
            if (l1.val != l2.val) {
                return false;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        return l1 == null && l2 == null;
    }

    public int val;
    public ListNodeWithRandom next;
    public ListNodeWithRandom random;

    public ListNodeWithRandom(int val, ListNodeWithRandom next, ListNodeWithRandom random) {
        this.val = val;
        this.next = next;
        this.random = random;
    }

    public ListNodeWithRandom(int val) {
        this.val = val;
    }

}
