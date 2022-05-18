package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class RootEqualsSumOfChildrenTest {

    @Test
    public void defaultTest() {
        assertTrue(
                new RootEqualsSumOfChildren(
                        new TreeNode(
                                10,
                                new TreeNode(4),
                                new TreeNode(6)
                        )
                ).solution()
        );
    }

}
