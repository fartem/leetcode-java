package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberOfGoodLeafNodesPairsTest {

    @Test
    public void defaultTest() {
        assertEquals(
                1,
                new NumberOfGoodLeafNodesPairs(
                        new TreeNode(
                                1,
                                new TreeNode(
                                        2,
                                        null,
                                        new TreeNode(4)
                                ),
                                new TreeNode(3)
                        ),
                        3
                ).solution()
        );
    }

}
