package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

public class ConstructStringFromBinaryTreeTest {

    @Test
    public void defaultTest() {
        assertEquals(
                "1(2(4))(3)",
                new ConstructStringFromBinaryTree(
                                new TreeNode(
                                        1, new TreeNode(2, new TreeNode(4), null), new TreeNode(3)))
                        .solution());
    }
}
