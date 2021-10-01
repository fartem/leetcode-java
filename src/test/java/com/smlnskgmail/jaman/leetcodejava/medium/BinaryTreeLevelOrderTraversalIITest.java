package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BinaryTreeLevelOrderTraversalIITest {

    @Test
    public void defaultTest() {
        assertEquals(
                Arrays.asList(
                        Arrays.asList(15, 7),
                        Arrays.asList(9, 20),
                        List.of(3)
                ),
                new BinaryTreeLevelOrderTraversalII(
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
