package com.smlnskgmail.jaman.leetcodejava.medium;

import static org.junit.Assert.assertEquals;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

public class MaximumDifferenceBetweenNodeAndAncestorTest {

    @Test
    public void defaultTest() {
        assertEquals(
                7,
                new MaximumDifferenceBetweenNodeAndAncestor(
                                new TreeNode(
                                        8,
                                        new TreeNode(
                                                3,
                                                new TreeNode(1),
                                                new TreeNode(6, new TreeNode(4), new TreeNode(7))),
                                        new TreeNode(
                                                10,
                                                null,
                                                new TreeNode(14, new TreeNode(13), null))))
                        .solution());
    }
}
