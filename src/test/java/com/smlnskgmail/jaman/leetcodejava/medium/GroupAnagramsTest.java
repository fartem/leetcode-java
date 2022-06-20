package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class GroupAnagramsTest {

    @Test
    public void defaultTest() {
        assertEquals(
                List.of(List.of("eat", "tea", "ate"), List.of("bat"), List.of("tan", "nat")),
                new GroupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}).solution()
        );
    }

}
