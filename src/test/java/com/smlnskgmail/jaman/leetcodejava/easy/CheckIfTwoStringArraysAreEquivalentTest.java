package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import java.beans.Transient;

import static org.junit.Assert.*;

public class CheckIfTwoStringArraysAreEquivalentTest {

    @Test
    public void defaultTest() {
        assertTrue(
                new CheckIfTwoStringArraysAreEquivalent(
                        new String[]{"ab", "c"},
                        new String[]{"a", "bc"}
                ).solution()
        );
    }

}
