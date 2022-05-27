package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LowestCommonAncestorOfABinaryTreeTest {

    @Test
    public void defaultTest() {
        TreeNode p = new TreeNode(
                5,
                new TreeNode(6),
                new TreeNode(
                        2,
                        new TreeNode(7),
                        new TreeNode(4)
                )
        );
        TreeNode q = new TreeNode(
                1,
                new TreeNode(0),
                new TreeNode(8)
        );
        TreeNode root = new TreeNode(3, p, q);
        assertEquals(
                root,
                new LowestCommonAncestorOfABinaryTree(root, p, q).solution()
        );
    }

}
