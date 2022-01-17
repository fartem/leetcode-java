package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RedistributeCharactersToMakeAllStringsEqualTest {

    @Test
    public void defaultTest() {
        assertTrue(
                new RedistributeCharactersToMakeAllStringsEqual(new String[] {"abc", "aabc", "bc"})
                        .solution());
    }
}
