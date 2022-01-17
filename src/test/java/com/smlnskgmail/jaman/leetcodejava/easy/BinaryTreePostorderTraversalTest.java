package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import java.util.Arrays;
import org.junit.Test;

public class BinaryTreePostorderTraversalTest {

    @Test
    public void defaultTest() {
        assertEquals(
                Arrays.asList(3, 2, 1),
                new BinaryTreePostorderTraversal(
                                new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null)))
                        .solution());
    }
}
