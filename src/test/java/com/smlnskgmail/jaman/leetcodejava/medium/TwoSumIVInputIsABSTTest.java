package com.smlnskgmail.jaman.leetcodejava.medium;

import static org.junit.Assert.assertTrue;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

public class TwoSumIVInputIsABSTTest {

    @Test
    public void defaultTest() {
        assertTrue(
                new TwoSumIVInputIsABST(
                                new TreeNode(
                                        5,
                                        new TreeNode(3, new TreeNode(2), new TreeNode(4)),
                                        new TreeNode(6, null, new TreeNode(7))),
                                9)
                        .solution());
    }
}
