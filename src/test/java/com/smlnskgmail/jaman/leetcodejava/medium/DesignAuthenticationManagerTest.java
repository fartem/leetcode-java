package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DesignAuthenticationManagerTest {

    @Test
    public void defaultTest() {
        var designAuthenticationManager = new DesignAuthenticationManager(5);
        designAuthenticationManager.renew("aaa", 1);
        designAuthenticationManager.generate("aaa", 2);
        assertEquals(1, designAuthenticationManager.countUnexpiredTokens(6));
        designAuthenticationManager.generate("bbb", 7);
        designAuthenticationManager.renew("aaa", 8);
        designAuthenticationManager.renew("bbb", 10);
        assertEquals(0, designAuthenticationManager.countUnexpiredTokens(15));
    }

}
