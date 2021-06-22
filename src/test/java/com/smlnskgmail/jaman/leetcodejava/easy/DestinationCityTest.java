package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class DestinationCityTest {

    @Test
    public void defaultTest() {
        assertEquals(
                "Sao Paulo",
                new DestinationCity(
                        Arrays.asList(
                                Arrays.asList("London", "New York"),
                                Arrays.asList("New York", "Lima"),
                                Arrays.asList("Lima", "Sao Paulo")
                        )
                ).solution()
        );
    }

}
