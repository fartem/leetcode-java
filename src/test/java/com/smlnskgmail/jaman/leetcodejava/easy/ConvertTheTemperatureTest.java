package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ConvertTheTemperatureTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new double[]{309.65000, 97.70000},
                new ConvertTheTemperature(36.50).solution(),
                0
        );
    }

}
