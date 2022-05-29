package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RearrangeCharactersToMakeTargetStringTest {

    @Test
    public void defaultTest() {
        assertEquals(
                2,
                new RearrangeCharactersToMakeTargetString(
                        "ilovecodingonleetcode",
                        "code"
                ).solution()
        );
    }

}
