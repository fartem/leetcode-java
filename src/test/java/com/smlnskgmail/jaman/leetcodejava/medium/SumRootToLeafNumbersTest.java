package com.smlnskgmail.jaman.leetcodejava.medium;

import static org.junit.Assert.assertEquals;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

public class SumRootToLeafNumbersTest {

    @Test
    public void defaultTest() {
        assertEquals(
                25,
                new SumRootToLeafNumbers(new TreeNode(1, new TreeNode(2), new TreeNode(3)))
                        .solution());
    }
}
