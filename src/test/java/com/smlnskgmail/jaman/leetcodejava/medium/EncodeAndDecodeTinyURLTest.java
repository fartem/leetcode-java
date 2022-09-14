package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class EncodeAndDecodeTinyURLTest {

    @Test
    public void defaultTest() {
        var encodeAndDecodeTinyURL = new EncodeAndDecodeTinyURL();
        var url = "https://leetcode.com/problems/design-tinyurl";
        var encodedUrl = encodeAndDecodeTinyURL.encode(url);

        assertNotEquals(url, encodeAndDecodeTinyURL.encode(url));
        assertEquals(url, encodeAndDecodeTinyURL.decode(encodedUrl));
    }

}
