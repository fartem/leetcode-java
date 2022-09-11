package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ReorderDataInLogFilesTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new String[]{
                        "let1 art can",
                        "let3 art zero",
                        "let2 own kit dig",
                        "dig1 8 1 5 1",
                        "dig2 3 6"
                },
                new ReorderDataInLogFiles(
                        new String[]{
                                "dig1 8 1 5 1",
                                "let1 art can",
                                "dig2 3 6",
                                "let2 own kit dig",
                                "let3 art zero"
                        }
                ).solution()
        );
    }

}
