package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import java.util.Arrays;
import org.junit.Test;

public class BinaryTreeInorderTraversalTest {

    @Test
    public void defaultTest() {
        assertEquals(
                Arrays.asList(1, 3, 2),
                new BinaryTreeInorderTraversal(
                                new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null)))
                        .solution());
    }
}
