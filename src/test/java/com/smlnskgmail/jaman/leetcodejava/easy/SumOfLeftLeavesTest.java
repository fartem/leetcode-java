package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

public class SumOfLeftLeavesTest {

    @Test
    public void defaultTest() {
        assertEquals(
                24,
                new SumOfLeftLeaves(
                                new TreeNode(
                                        3,
                                        new TreeNode(9),
                                        new TreeNode(20, new TreeNode(15), new TreeNode(7))))
                        .solution());
    }
}
