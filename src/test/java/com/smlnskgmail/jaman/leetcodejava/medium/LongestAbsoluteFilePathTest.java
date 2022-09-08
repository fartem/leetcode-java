package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestAbsoluteFilePathTest {

    @Test
    public void defaultTest() {
        assertEquals(
                20,
                new LongestAbsoluteFilePath(
                        "dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext"
                ).solution()
        );
    }

}
