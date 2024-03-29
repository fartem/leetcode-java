package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class AllNodesDistanceKInBinaryTreeTest {

    @Test
    public void defaultTest() {
        TreeNode target = new TreeNode(
                5,
                new TreeNode(6),
                new TreeNode(
                        2,
                        new TreeNode(7),
                        new TreeNode(4)
                )
        );
        assertEquals(
                Arrays.asList(7, 4, 1),
                new AllNodesDistanceKInBinaryTree(
                        new TreeNode(
                                3,
                                target,
                                new TreeNode(
                                        1,
                                        new TreeNode(0),
                                        new TreeNode(8)
                                )
                        ),
                        target,
                        2
                ).solution()
        );
    }

}
