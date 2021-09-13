package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;
import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

// https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree
public class ConvertSortedListToBinarySearchTree {

    private final ListNode input;

    public ConvertSortedListToBinarySearchTree(ListNode input) {
        this.input = input;
    }

    public TreeNode solution() {
        return toBST(input);
    }

    private TreeNode toBST(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode middle = middle(head);
        TreeNode node = new TreeNode(middle.val);
        if (head == middle) {
            return node;
        }
        node.left = toBST(head);
        node.right = toBST(middle.next);
        return node;
    }

    private ListNode middle(ListNode node) {
        ListNode fast = node;
        ListNode slow = node;
        ListNode prev = node;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if (prev != null) {
            prev.next = null;
        }
        return slow;
    }

}
