package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CompleteBinaryTreeInserterTest {

    @Test
    public void defaultTest() {
        var completeBinaryTreeInserter = new CompleteBinaryTreeInserter(
                new TreeNode(
                        1,
                        new TreeNode(2),
                        null
                )
        );
        assertEquals(1, completeBinaryTreeInserter.insert(3));
        assertEquals(2, completeBinaryTreeInserter.insert(4));
        assertTrue(
                TreeNode.areEqual(
                        new TreeNode(
                                1,
                                new TreeNode(
                                        2,
                                        new TreeNode(4),
                                        null
                                ),
                                new TreeNode(3)
                        ),
                        completeBinaryTreeInserter.getRoot()
                )
        );
    }

}
