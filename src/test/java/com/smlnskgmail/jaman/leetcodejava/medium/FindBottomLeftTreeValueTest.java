package com.smlnskgmail.jaman.leetcodejava.medium;

import static org.junit.Assert.assertEquals;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

public class FindBottomLeftTreeValueTest {

    @Test
    public void defaultTest() {
        assertEquals(
                1,
                new FindBottomLeftTreeValue(new TreeNode(2, new TreeNode(1), new TreeNode(2)))
                        .solution());
    }
}
