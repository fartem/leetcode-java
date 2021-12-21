package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FindElementsInAContaminatedBinaryTreeTest {

    @Test
    public void defaultTest() {
        var findElementsInAContaminatedBinaryTree = new FindElementsInAContaminatedBinaryTree(
                new TreeNode(
                        -1,
                        null,
                        new TreeNode(-1)
                )
        );
        assertFalse(findElementsInAContaminatedBinaryTree.find(1));
        assertTrue(findElementsInAContaminatedBinaryTree.find(2));
    }

}
