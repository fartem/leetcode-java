package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import java.util.Arrays;
import org.junit.Test;

public class BinaryTreePathsTest {

    @Test
    public void defaultTest() {
        assertEquals(
                Arrays.asList("1->2->5", "1->3"),
                new BinaryTreePaths(
                                new TreeNode(
                                        1, new TreeNode(2, null, new TreeNode(5)), new TreeNode(3)))
                        .solution());
    }
}
