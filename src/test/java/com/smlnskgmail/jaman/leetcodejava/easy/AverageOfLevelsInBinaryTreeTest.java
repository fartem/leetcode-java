package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import java.util.Arrays;
import org.junit.Test;

public class AverageOfLevelsInBinaryTreeTest {

    @Test
    public void defaultTest() {
        assertEquals(
                Arrays.asList(3.00000, 14.50000, 11.00000),
                new AverageOfLevelsInBinaryTree(
                                new TreeNode(
                                        3,
                                        new TreeNode(9),
                                        new TreeNode(20, new TreeNode(15), new TreeNode(7))))
                        .solution());
    }
}
