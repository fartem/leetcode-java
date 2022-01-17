package com.smlnskgmail.jaman.leetcodejava.support;

public class NextTreeNode {

    public static boolean areEqual(NextTreeNode n1, NextTreeNode n2) {
        if (n1 != null && n2 != null) {
            if (n1.val != n2.val && n1.next != n2.next) {
                return false;
            }
            return areEqual(n1.left, n2.left) && areEqual(n1.right, n2.right);
        }
        return n1 == null && n2 == null;
    }

    public int val;
    public NextTreeNode left;
    public NextTreeNode right;
    public NextTreeNode next;

    public NextTreeNode(int val) {
        this.val = val;
    }

    public NextTreeNode(int val, NextTreeNode next) {
        this.val = val;
        this.next = next;
    }

    public NextTreeNode(
            int val,
            NextTreeNode left,
            NextTreeNode right
    ) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public NextTreeNode(
            int val,
            NextTreeNode left,
            NextTreeNode right,
            NextTreeNode next
    ) {
        this.val = val;
        this.left = left;
        this.right = right;
        this.next = next;
    }

}
