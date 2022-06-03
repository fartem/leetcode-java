package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class VerifyPreorderSerializationOfABinaryTreeTest {

    @Test
    public void defaultTest() {
        assertTrue(
                new VerifyPreorderSerializationOfABinaryTree(
                        "9,3,4,#,#,1,#,#,2,#,6,#,#"
                ).solution()
        );
    }

}
