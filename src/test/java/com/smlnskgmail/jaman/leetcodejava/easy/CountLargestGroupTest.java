package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountLargestGroupTest {

    @Test
    public void defaultTest() {
        assertEquals(
                4,
                new CountLargestGroup(13).solution()
        );
    }

}
