package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SubtreeOfAnotherTreeTest {

    @Test
    public void defaultTest() {
        assertTrue(
                new SubtreeOfAnotherTree(
                        new TreeNode(
                                3,
                                new TreeNode(
                                        4,
                                        new TreeNode(1),
                                        new TreeNode(2)
                                ),
                                new TreeNode(5)
                        ),
                        new TreeNode(
                                4,
                                new TreeNode(1),
                                new TreeNode(2)
                        )
                ).solution()
        );
    }

}
