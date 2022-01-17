package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertTrue;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

public class SymmetricTreeTest {

    @Test
    public void defaultTest() {
        assertTrue(
                new SymmetricTree(
                                new TreeNode(
                                        1,
                                        new TreeNode(2, new TreeNode(3), new TreeNode(4)),
                                        new TreeNode(2, new TreeNode(4), new TreeNode(3))))
                        .solution());
    }
}
