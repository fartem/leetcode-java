package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddBinaryTest {

    @Test
    public void defaultTest() {
//        assertEquals(
//                "100",
//                new AddBinary(
//                        "11",
//                        "1"
//                ).solution()
//        );
        assertEquals(
                "11110",
                new AddBinary(
                        "1111",
                        "1111"
                ).solution()
        );
    }

}
