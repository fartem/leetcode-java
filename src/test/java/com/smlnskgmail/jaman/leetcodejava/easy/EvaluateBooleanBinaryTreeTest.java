package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class EvaluateBooleanBinaryTreeTest {

    @Test
    public void defaultTest() {
        assertTrue(
                new EvaluateBooleanBinaryTree(
                        new TreeNode(
                                2,
                                new TreeNode(1),
                                new TreeNode(
                                        3,
                                        new TreeNode(0),
                                        new TreeNode(1)
                                )
                        )
                ).solution()
        );
    }

}
