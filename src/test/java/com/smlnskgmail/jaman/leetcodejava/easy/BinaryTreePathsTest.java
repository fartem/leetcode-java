package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class BinaryTreePathsTest {

    @Test
    public void defaultTest() {
        assertEquals(
                Arrays.asList("1->2->5", "1->3"),
                new BinaryTreePaths(
                        new TreeNode(
                                1,
                                new TreeNode(
                                        2,
                                        null,
                                        new TreeNode(5)
                                ),
                                new TreeNode(3)
                        )
                ).solution()
        );
    }

}
