package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumOfRootToLeafBinaryNumbersTest {

    @Test
    public void defaultTest() {
        assertEquals(
                22,
                new SumOfRootToLeafBinaryNumbers(
                        new TreeNode(
                                1,
                                new TreeNode(
                                        0,
                                        new TreeNode(0),
                                        new TreeNode(1)
                                ),
                                new TreeNode(
                                        1,
                                        new TreeNode(0),
                                        new TreeNode(1)
                                )
                        )
                ).solution()
        );
    }

}
