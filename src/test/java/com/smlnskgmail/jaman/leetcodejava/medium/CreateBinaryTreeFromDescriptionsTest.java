package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CreateBinaryTreeFromDescriptionsTest {

    @Test
    public void defaultTest() {
        assertTrue(
                TreeNode.areEqual(
                        new CreateBinaryTreeFromDescriptions(
                                new int[][]{{20, 15, 1}, {20, 17, 0}, {50, 20, 1}, {50, 80, 0}, {80, 19, 1}}
                        ).solution(),
                        new TreeNode(
                                50,
                                new TreeNode(
                                        20,
                                        new TreeNode(15),
                                        new TreeNode(17)
                                ),
                                new TreeNode(
                                        80,
                                        new TreeNode(19),
                                        null
                                )
                        )
                )
        );
    }

}
