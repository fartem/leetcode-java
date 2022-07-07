package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PathSumIIITest {

    @Test
    public void defaultTest() {
        assertEquals(
                3,
                new PathSumIII(
                        new TreeNode(
                                10,
                                new TreeNode(
                                        5,
                                        new TreeNode(
                                                3,
                                                new TreeNode(3),
                                                new TreeNode(-2)
                                        ),
                                        new TreeNode(
                                                2,
                                                null,
                                                new TreeNode(1)
                                        )
                                ),
                                new TreeNode(
                                        -3,
                                        null,
                                        new TreeNode(11)
                                )
                        ),
                        8
                ).solution()
        );
    }

}
