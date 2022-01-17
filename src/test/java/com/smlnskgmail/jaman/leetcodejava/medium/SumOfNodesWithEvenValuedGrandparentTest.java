package com.smlnskgmail.jaman.leetcodejava.medium;

import static org.junit.Assert.assertEquals;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

public class SumOfNodesWithEvenValuedGrandparentTest {

    @Test
    public void defaultTest() {
        assertEquals(
                18,
                new SumOfNodesWithEvenValuedGrandparent(
                                new TreeNode(
                                        6,
                                        new TreeNode(
                                                7,
                                                new TreeNode(2, new TreeNode(9), null),
                                                new TreeNode(7, new TreeNode(1), new TreeNode(4))),
                                        new TreeNode(
                                                8,
                                                new TreeNode(1),
                                                new TreeNode(3, null, new TreeNode(5)))))
                        .solution());
    }
}
