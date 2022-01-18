package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class RecoverBinarySearchTreeTest {

    @Test
    public void defaultTest() {
        TreeNode solution = new TreeNode(
                1,
                new TreeNode(
                        3,
                        null,
                        new TreeNode(2)
                ),
                null
        );
        new RecoverBinarySearchTree(solution).solution();
        assertTrue(
                TreeNode.areEqual(
                        new TreeNode(
                                3,
                                new TreeNode(
                                        1,
                                        null,
                                        new TreeNode(2)
                                ),
                                null
                        ),
                        solution
                )
        );
    }

}
