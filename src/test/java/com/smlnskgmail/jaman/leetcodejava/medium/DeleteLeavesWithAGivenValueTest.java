package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

import static com.smlnskgmail.jaman.leetcodejava.support.TreeNode.areEqual;
import static org.junit.Assert.assertTrue;

public class DeleteLeavesWithAGivenValueTest {

    @Test
    public void defaultTest() {
        TreeNode correct = new TreeNode(
                1,
                null,
                new TreeNode(
                        3,
                        null,
                        new TreeNode(4)
                )
        );
        TreeNode solution = new DeleteLeavesWithAGivenValue(
                new TreeNode(
                        1,
                        new TreeNode(
                                2,
                                new TreeNode(2),
                                null
                        ),
                        new TreeNode(
                                3,
                                new TreeNode(2),
                                new TreeNode(4)
                        )
                ),
                2
        ).solution();
        assertTrue(areEqual(correct, solution));
    }

}
