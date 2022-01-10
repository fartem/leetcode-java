package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AddOneRowToTreeTest {

    @Test
    public void defaultTest() {
        assertTrue(
                TreeNode.areEqual(
                        new AddOneRowToTree(
                                new TreeNode(
                                        4,
                                        new TreeNode(
                                                2,
                                                new TreeNode(3),
                                                new TreeNode(1)
                                        ),
                                        new TreeNode(
                                                6,
                                                null,
                                                new TreeNode(5)
                                        )
                                ),
                                1,
                                2
                        ).solution(),
                        new TreeNode(
                                4,
                                new TreeNode(
                                        1,
                                        new TreeNode(
                                                2,
                                                new TreeNode(3),
                                                new TreeNode(1)
                                        ),
                                        null
                                ),
                                new TreeNode(
                                        1,
                                        null,
                                        new TreeNode(
                                                6,
                                                null,
                                                new TreeNode(5)
                                        )
                                )
                        )
                )
        );
    }

}
