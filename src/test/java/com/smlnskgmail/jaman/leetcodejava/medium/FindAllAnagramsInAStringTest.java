package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FindAllAnagramsInAStringTest {

    @Test
    public void defaultTest() {
        assertEquals(
                List.of(0, 6),
                new FindAllAnagramsInAString(
                        "cbaebabacd",
                        "abc"
                ).solution()
        );
    }

}
