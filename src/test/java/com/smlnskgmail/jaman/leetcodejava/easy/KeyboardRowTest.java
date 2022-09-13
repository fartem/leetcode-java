package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class KeyboardRowTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new String[]{"Alaska", "Dad"},
                new KeyboardRow(new String[]{"Hello", "Alaska", "Dad", "Peace"}).solution()
        );
    }

}
