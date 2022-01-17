package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class KeyboardRowTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new String[] {"Alaska", "Dad"},
                new KeyboardRow(new String[] {"Hello", "Alaska", "Dad", "Peace"}).solution());
    }
}
