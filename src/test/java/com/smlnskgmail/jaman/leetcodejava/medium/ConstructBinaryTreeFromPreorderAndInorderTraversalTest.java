package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ConstructBinaryTreeFromPreorderAndInorderTraversalTest {

    @Test
    public void defaultTest() {
        assertTrue(
                TreeNode.areEqual(
                        new TreeNode(
                                3,
                                new TreeNode(9),
                                new TreeNode(
                                        20,
                                        new TreeNode(15),
                                        new TreeNode(7)
                                )
                        ),
                        new ConstructBinaryTreeFromPreorderAndInorderTraversal(
                                new int[]{3, 9, 20, 15, 7},
                                new int[]{9, 3, 15, 20, 7}
                        ).solution()
                )
        );
    }

}
