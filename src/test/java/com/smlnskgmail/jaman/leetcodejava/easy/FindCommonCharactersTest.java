package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class FindCommonCharactersTest {

    @Test
    public void defaultTest() {
        assertEquals(
                Arrays.asList("e", "l", "l"),
                new FindCommonCharacters(
                        new String[]{"bella", "label", "roller"}
                ).solution()
        );
    }

}
