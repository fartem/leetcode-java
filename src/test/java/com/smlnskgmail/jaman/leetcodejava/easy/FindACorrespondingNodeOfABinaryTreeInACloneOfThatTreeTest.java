package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindACorrespondingNodeOfABinaryTreeInACloneOfThatTreeTest {

    @Test
    public void defaultTest() {
        TreeNode correct = new TreeNode(
                3,
                new TreeNode(6),
                new TreeNode(10)
        );
        TreeNode target = new TreeNode(
                3,
                new TreeNode(6),
                new TreeNode(10)
        );
        TreeNode solution = new FindACorrespondingNodeOfABinaryTreeInACloneOfThatTree(
                new TreeNode(
                        7,
                        new TreeNode(4),
                        target
                ),
                new TreeNode(
                        7,
                        new TreeNode(4),
                        correct
                ),
                target
        ).solution();
        assertEquals(correct, solution);
    }

}
