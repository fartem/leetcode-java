package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DecodeTheMessageTest {

    @Test
    public void defaultTest() {
        assertEquals(
                "this is a secret",
                new DecodeTheMessage(
                        "the quick brown fox jumps over the lazy dog",
                        "vkbs bs t suepuv"
                ).solution()
        );
    }

}
