package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class BinaryTreeZigzagLevelOrderTraversalTest {

    @Test
    public void defaultTest() {
        assertEquals(
                Arrays.asList(
                        Collections.singletonList(3),
                        Arrays.asList(20, 9),
                        Arrays.asList(15, 7)
                ),
                new BinaryTreeZigzagLevelOrderTraversal(
                        new TreeNode(
                                3,
                                new TreeNode(9),
                                new TreeNode(
                                        20,
                                        new TreeNode(15),
                                        new TreeNode(7)
                                )
                        )
                ).solution()
        );
    }

}
