package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimplifyPathTest {

    @Test
    public void defaultTest() {
        assertEquals("/home", new SimplifyPath("/home/").solution());
    }

}
