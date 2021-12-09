package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeepestLeavesSumTest {

    @Test
    public void defaultTest() {
        assertEquals(
                15,
                new DeepestLeavesSum(
                        new TreeNode(
                                1,
                                new TreeNode(
                                        2,
                                        new TreeNode(
                                                4,
                                                new TreeNode(7),
                                                null
                                        ),
                                        new TreeNode(5)
                                ),
                                new TreeNode(
                                        3,
                                        null,
                                        new TreeNode(
                                                6,
                                                null,
                                                new TreeNode(8)
                                        )
                                )
                        )
                ).solution()
        );
    }

}
