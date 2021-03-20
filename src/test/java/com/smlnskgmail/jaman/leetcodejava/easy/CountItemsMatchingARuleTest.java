package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class CountItemsMatchingARuleTest {

    @Test
    public void defaultTest() {
        assertEquals(
                1,
                new CountItemsMatchingARule(
                        Arrays.asList(
                                Arrays.asList(
                                        "phone", "Blue", "pixel"
                                ),
                                Arrays.asList(
                                        "computer", "silver", "lenovo"
                                ),
                                Arrays.asList(
                                        "phone", "gold", "iphone"
                                )
                        ),
                        "color",
                        "silver"
                ).solution()
        );
    }

}
