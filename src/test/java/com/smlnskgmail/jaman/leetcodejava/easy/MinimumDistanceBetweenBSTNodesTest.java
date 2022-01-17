package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

public class MinimumDistanceBetweenBSTNodesTest {

    @Test
    public void defaultTest() {
        assertEquals(
                1,
                new MinimumDistanceBetweenBSTNodes(
                                new TreeNode(
                                        4,
                                        new TreeNode(2, new TreeNode(1), new TreeNode(3)),
                                        new TreeNode(6)))
                        .solution());
    }
}
