package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountNodesEqualToAverageOfSubtreeTest {

    @Test
    public void defaultTest() {
        assertEquals(
                5,
                new CountNodesEqualToAverageOfSubtree(
                        new TreeNode(
                                4,
                                new TreeNode(
                                        8,
                                        new TreeNode(0),
                                        new TreeNode(1)
                                ),
                                new TreeNode(
                                        5,
                                        null,
                                        new TreeNode(6)
                                )
                        )
                ).solution()
        );
    }

}
