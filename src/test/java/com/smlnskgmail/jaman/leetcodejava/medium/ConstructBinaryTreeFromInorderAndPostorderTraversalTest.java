package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ConstructBinaryTreeFromInorderAndPostorderTraversalTest {

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
                        new ConstructBinaryTreeFromInorderAndPostorderTraversal(
                                new int[]{9, 3, 15, 20, 7},
                                new int[]{9, 15, 7, 20, 3}
                        ).solution()
                )
        );
    }

}
