package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCompressionTest {

    @Test
    public void defaultTest() {
        var input = new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        var stringCompression = new StringCompression(input);
        assertEquals(6, stringCompression.solution());

        var solution = new char[]{'a', '2', 'b', '2', 'c', '3'};
        for (int i = 0; i < 6; i++) {
            assertEquals(solution[i], input[i]);
        }
    }

}
