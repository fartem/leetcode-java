package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class MajorityElementTest {

    @Test
    public void defaultTest() {
        assertEquals(
                3,
                new MajorityElement(
                        new int[]{3, 2, 3}
                ).solution()
        );
    }

}
