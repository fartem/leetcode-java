package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ReverseOddLevelsOfBinaryTreeTest {

    @Test
    public void defaultTests() {
        assertTrue(
                TreeNode.areEqual(
                        TreeNode.perfectFromArray(
                                2, 5, 3, 8, 13, 21, 34
                        ),
                        new ReverseOddLevelsOfBinaryTree(
                                TreeNode.perfectFromArray(
                                        2, 3, 5, 8, 13, 21, 34
                                )
                        ).solution()
                )
        );
        assertTrue(
                TreeNode.areEqual(
                        TreeNode.perfectFromArray(7, 11, 13),
                        new ReverseOddLevelsOfBinaryTree(
                                TreeNode.perfectFromArray(7, 13, 11)
                        ).solution()
                )
        );
        assertTrue(
                TreeNode.areEqual(
                        TreeNode.perfectFromArray(
                                0, 2, 1, 0, 0, 0, 0, 2, 2, 2, 2, 1, 1, 1, 1
                        ),
                        new ReverseOddLevelsOfBinaryTree(
                                TreeNode.perfectFromArray(
                                        0, 1, 2, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2
                                )
                        ).solution()
                )
        );
    }

}
