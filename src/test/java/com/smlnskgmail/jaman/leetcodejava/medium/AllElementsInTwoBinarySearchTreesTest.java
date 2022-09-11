package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class AllElementsInTwoBinarySearchTreesTest {

    @Test
    public void defaultTest() {
        assertEquals(
                Arrays.asList(0, 1, 1, 2, 3, 4),
                new AllElementsInTwoBinarySearchTrees(
                        new TreeNode(
                                2,
                                new TreeNode(1),
                                new TreeNode(4)
                        ),
                        new TreeNode(
                                1,
                                new TreeNode(0),
                                new TreeNode(3)
                        )
                ).solution()
        );
    }

}
