package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RangeSumOfBSTTest {

    @Test
    public void defaultTest() {
        TreeNode head = new TreeNode(
                10,
                new TreeNode(
                        5,
                        new TreeNode(3),
                        new TreeNode(7)
                ),
                new TreeNode(
                        15,
                        null,
                        new TreeNode(18)
                )
        );
        assertEquals(
                32,
                new RangeSumOfBST(
                        head,
                        7,
                        15
                ).solution()
        );
    }

}
