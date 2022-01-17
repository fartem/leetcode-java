package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import org.junit.Test;

public class CountItemsMatchingARuleTest {

    @Test
    public void defaultTest() {
        assertEquals(
                1,
                new CountItemsMatchingARule(
                                Arrays.asList(
                                        Arrays.asList("phone", "Blue", "pixel"),
                                        Arrays.asList("computer", "silver", "lenovo"),
                                        Arrays.asList("phone", "gold", "iphone")),
                                "color",
                                "silver")
                        .solution());
    }
}
