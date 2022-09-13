package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MergeTwoBinaryTreesTest {

    @Test
    public void defaultTest() {
        TreeNode root1 = new TreeNode(
                1,
                new TreeNode(
                        3,
                        new TreeNode(5),
                        null
                ),
                new TreeNode(2)
        );
        TreeNode root2 = new TreeNode(
                2,
                new TreeNode(
                        1,
                        null,
                        new TreeNode(4)
                ),
                new TreeNode(
                        3,
                        null,
                        new TreeNode(7)
                )
        );
        TreeNode correct = new TreeNode(
                3,
                new TreeNode(
                        4,
                        new TreeNode(5),
                        new TreeNode(4)
                ),
                new TreeNode(
                        5,
                        null,
                        new TreeNode(7)
                )
        );
        TreeNode solution = new MergeTwoBinaryTrees(root1, root2).solution();
        assertTrue(TreeNode.areEqual(correct, solution));
    }

}
