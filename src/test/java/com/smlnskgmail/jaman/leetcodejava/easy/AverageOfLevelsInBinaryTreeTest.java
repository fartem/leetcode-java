package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class AverageOfLevelsInBinaryTreeTest {

    @Test
    public void defaultTest() {
        assertEquals(
                Arrays.asList(3.00000, 14.50000, 11.00000),
                new AverageOfLevelsInBinaryTree(
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
