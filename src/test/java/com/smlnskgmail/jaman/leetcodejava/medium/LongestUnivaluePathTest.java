package com.smlnskgmail.jaman.leetcodejava.medium;

import static org.junit.Assert.assertEquals;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

public class LongestUnivaluePathTest {

    @Test
    public void defaultTest() {
        assertEquals(
                2,
                new LongestUnivaluePath(
                                new TreeNode(
                                        5,
                                        new TreeNode(4, new TreeNode(1), new TreeNode(1)),
                                        new TreeNode(5, null, new TreeNode(5))))
                        .solution());
    }
}
