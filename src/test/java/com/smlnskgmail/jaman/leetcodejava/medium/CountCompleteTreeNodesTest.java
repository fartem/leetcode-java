package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountCompleteTreeNodesTest {

    @Test
    public void defaultTest() {
        assertEquals(
                6,
                new CountCompleteTreeNodes(
                        new TreeNode(
                                1,
                                new TreeNode(
                                        2,
                                        new TreeNode(4),
                                        new TreeNode(5)
                                ),
                                new TreeNode(
                                        3,
                                        new TreeNode(6),
                                        null
                                )
                        )
                ).solution()
        );
    }

}
