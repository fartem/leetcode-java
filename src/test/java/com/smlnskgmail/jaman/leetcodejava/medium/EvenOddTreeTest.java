package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class EvenOddTreeTest {

    @Test
    public void defaultTest() {
        assertTrue(
                new EvenOddTree(
                        new TreeNode(
                                1,
                                new TreeNode(
                                        10,
                                        new TreeNode(
                                                3,
                                                new TreeNode(12),
                                                new TreeNode(8)
                                        ),
                                        null
                                ),
                                new TreeNode(
                                        4,
                                        new TreeNode(
                                                7,
                                                new TreeNode(6),
                                                null
                                        ),
                                        new TreeNode(
                                                9,
                                                null,
                                                new TreeNode(2)
                                        )
                                )
                        )
                ).solution()
        );
    }

}
