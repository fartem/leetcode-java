package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumRootToLeafNumbersTest {

    @Test
    public void defaultTest() {
        assertEquals(
                25,
                new SumRootToLeafNumbers(
                        new TreeNode(
                                1,
                                new TreeNode(2),
                                new TreeNode(3)
                        )
                ).solution()
        );
    }

}
