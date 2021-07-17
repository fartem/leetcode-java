package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class RedistributeCharactersToMakeAllStringsEqualTest {

    @Test
    public void defaultTest() {
        assertTrue(
                new RedistributeCharactersToMakeAllStringsEqual(
                        new String[]{"abc", "aabc", "bc"}
                ).solution()
        );
    }

}
