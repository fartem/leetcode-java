package com.smlnskgmail.jaman.leetcodejava.hard;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinaryTreeCamerasTest {

    @Test
    public void defaultTest() {
        assertEquals(
                1,
                new BinaryTreeCameras(
                        new TreeNode(
                                0,
                                new TreeNode(
                                        0,
                                        new TreeNode(0),
                                        new TreeNode(0)
                                ),
                                null
                        )
                ).solution()
        );
    }

}
