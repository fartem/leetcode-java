package com.smlnskgmail.jaman.leetcodejava.medium;

import static org.junit.Assert.assertEquals;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

public class KthSmallestElementInABSTTest {

    @Test
    public void defaultTest() {
        assertEquals(
                1,
                new KthSmallestElementInABST(
                                new TreeNode(
                                        3, new TreeNode(1, null, new TreeNode(2)), new TreeNode(4)),
                                1)
                        .solution());
    }
}
