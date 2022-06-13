package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TriangleTest {

    @Test
    public void defaultTest() {
        assertEquals(
                11,
                new Triangle(
                        List.of(
                                List.of(2),
                                List.of(3, 4),
                                List.of(6, 5, 7),
                                List.of(4, 1, 8, 3)
                        )
                ).solution()
        );
    }

}
