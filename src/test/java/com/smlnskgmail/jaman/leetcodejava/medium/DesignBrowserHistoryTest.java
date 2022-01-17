package com.smlnskgmail.jaman.leetcodejava.medium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DesignBrowserHistoryTest {

    @Test
    public void defaultTest() {
        DesignBrowserHistory designBrowserHistory = new DesignBrowserHistory("leetcode.com");
        designBrowserHistory.visit("google.com");
        designBrowserHistory.visit("facebook.com");
        designBrowserHistory.visit("youtube.com");
        assertEquals("facebook.com", designBrowserHistory.back(1));
        assertEquals("google.com", designBrowserHistory.back(1));
        assertEquals("facebook.com", designBrowserHistory.forward(1));
        designBrowserHistory.visit(
                "linkedin.com"); // You are in "facebook.com". Visit "linkedin.com"
        assertEquals("linkedin.com", designBrowserHistory.forward(2));
        assertEquals("google.com", designBrowserHistory.back(2));
        assertEquals("leetcode.com", designBrowserHistory.back(7));
    }
}
