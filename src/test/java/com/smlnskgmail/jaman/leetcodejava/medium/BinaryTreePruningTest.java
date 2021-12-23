package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

import static com.smlnskgmail.jaman.leetcodejava.support.TreeNode.areEqual;
import static org.junit.Assert.assertTrue;

public class BinaryTreePruningTest {

    @Test
    public void defaultTest() {
        TreeNode correct = new TreeNode(
                1,
                null,
                new TreeNode(
                        0,
                        null,
                        new TreeNode(1)
                )
        );
        TreeNode solution = new BinaryTreePruning(
                new TreeNode(
                        1,
                        null,
                        new TreeNode(
                                0,
                                new TreeNode(0),
                                new TreeNode(1)
                        )
                )
        ).solution();
        assertTrue(areEqual(correct, solution));
    }

}
