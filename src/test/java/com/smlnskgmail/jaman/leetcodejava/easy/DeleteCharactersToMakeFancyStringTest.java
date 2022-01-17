package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DeleteCharactersToMakeFancyStringTest {

    @Test
    public void defaultTest() {
        assertEquals("leetcode", new DeleteCharactersToMakeFancyString("leeetcode").solution());
    }
}
