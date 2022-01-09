package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MostFrequentSubtreeSumTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new int[]{2, -3, 4},
                new MostFrequentSubtreeSum(
                        new TreeNode(
                                5,
                                new TreeNode(2),
                                new TreeNode(-3)
                        )
                ).solution()
        );
    }

}
