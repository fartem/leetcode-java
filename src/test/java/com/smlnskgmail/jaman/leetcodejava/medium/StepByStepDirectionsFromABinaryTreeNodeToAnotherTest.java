package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StepByStepDirectionsFromABinaryTreeNodeToAnotherTest {

    @Test
    public void defaultTest() {
        assertEquals(
                "UURL",
                new StepByStepDirectionsFromABinaryTreeNodeToAnother(
                        new TreeNode(
                                5,
                                new TreeNode(
                                        1,
                                        new TreeNode(3),
                                        null
                                ),
                                new TreeNode(
                                        2,
                                        new TreeNode(6),
                                        new TreeNode(4)
                                )
                        ),
                        3,
                        6
                ).solution()
        );
    }

}
