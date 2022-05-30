package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class BinaryTreeRightSideViewTest {

    @Test
    public void defaultTest() {
        assertEquals(
                List.of(1, 3, 4),
                new BinaryTreeRightSideView(
                        new TreeNode(
                                1,
                                new TreeNode(
                                        2,
                                        null,
                                        new TreeNode(5)
                                ),
                                new TreeNode(
                                        3,
                                        null,
                                        new TreeNode(4)
                                )
                        )
                ).solution()
        );
    }

}
