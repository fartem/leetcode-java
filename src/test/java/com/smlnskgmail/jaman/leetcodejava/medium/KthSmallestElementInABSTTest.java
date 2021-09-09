package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KthSmallestElementInABSTTest {

    @Test
    public void defaultTest() {
        assertEquals(
                1,
                new KthSmallestElementInABST(
                        new TreeNode(
                                3,
                                new TreeNode(
                                        1,
                                        null,
                                        new TreeNode(2)
                                ),
                                new TreeNode(4)
                        ),
                        1
                ).solution()
        );
    }

}
