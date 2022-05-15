package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class CamelcaseMatchingTest {

    @Test
    public void defaultTest() {
        assertEquals(
                new CamelcaseMatching(
                        new String[]{"FooBar", "FooBarTest", "FootBall", "FrameBuffer", "ForceFeedBack"},
                        "FB"
                ).solution(),
                Arrays.asList(true, false, true, true, false)
        );
    }

}
