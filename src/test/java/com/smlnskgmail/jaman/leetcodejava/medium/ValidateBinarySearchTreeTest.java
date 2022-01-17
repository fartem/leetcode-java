package com.smlnskgmail.jaman.leetcodejava.medium;

import static org.junit.Assert.assertTrue;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

public class ValidateBinarySearchTreeTest {

    @Test
    public void defaultTest() {
        assertTrue(
                new ValidateBinarySearchTree(new TreeNode(2, new TreeNode(1), new TreeNode(3)))
                        .solution());
    }
}
