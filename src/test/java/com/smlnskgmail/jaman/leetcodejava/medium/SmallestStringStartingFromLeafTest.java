package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SmallestStringStartingFromLeafTest {

    @Test
    public void defaultTest() {
        assertEquals(
                "dba",
                new SmallestStringStartingFromLeaf(
                        new TreeNode(
                                0,
                                new TreeNode(
                                        1,
                                        new TreeNode(3),
                                        new TreeNode(4)
                                ),
                                new TreeNode(
                                        2,
                                        new TreeNode(3),
                                        new TreeNode(4)
                                )
                        )
                ).solution()
        );
        assertEquals(
                "ba",
                new SmallestStringStartingFromLeaf(
                        new TreeNode(
                                0,
                                null,
                                new TreeNode(1)
                        )
                ).solution()
        );
    }

}
