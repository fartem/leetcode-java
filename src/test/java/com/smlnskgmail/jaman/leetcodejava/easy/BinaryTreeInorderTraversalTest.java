package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class BinaryTreeInorderTraversalTest {

    @Test
    public void defaultTest() {
        assertEquals(
                Arrays.asList(
                        1, 3, 2
                ),
                new BinaryTreeInorderTraversal(
                        new TreeNode(
                                1,
                                null,
                                new TreeNode(
                                        2,
                                        new TreeNode(3),
                                        null
                                )
                        )
                ).solution()
        );
    }

}
