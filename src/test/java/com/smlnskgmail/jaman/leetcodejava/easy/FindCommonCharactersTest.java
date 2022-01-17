package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import org.junit.Test;

public class FindCommonCharactersTest {

    @Test
    public void defaultTest() {
        assertEquals(
                Arrays.asList("e", "l", "l"),
                new FindCommonCharacters(new String[] {"bella", "label", "roller"}).solution());
    }
}
