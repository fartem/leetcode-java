package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TwoSumIVInputIsABSTTest {

    @Test
    public void defaultTest() {
        assertTrue(
                new TwoSumIVInputIsABST(
                        new TreeNode(
                                5,
                                new TreeNode(
                                        3,
                                        new TreeNode(2),
                                        new TreeNode(4)
                                ),
                                new TreeNode(
                                        6,
                                        null,
                                        new TreeNode(7)
                                )
                        ),
                        9
                ).solution()
        );
    }

}
