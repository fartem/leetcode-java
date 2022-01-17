package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

public class SecondMinimumNodeInABinaryTreeTest {

    @Test
    public void defaultTest() {
        TreeNode root =
                new TreeNode(2, new TreeNode(2), new TreeNode(5, new TreeNode(5), new TreeNode(7)));
        assertEquals(5, new SecondMinimumNodeInABinaryTree(root).solution());
    }
}
