package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// https://leetcode.com/problems/design-authentication-manager/
public class DesignAuthenticationManager {

    private final int timeToLive;
    private final Map<String, Integer> auth = new HashMap<>();
    private final Set<String> tokens = new HashSet<>();

    public DesignAuthenticationManager(int timeToLive) {
        this.timeToLive = timeToLive;
    }

    public void generate(String tokenId, int currentTime) {
        auth.put(tokenId, currentTime + timeToLive);
        tokens.add(tokenId);
    }

    public void renew(String tokenId, int currentTime) {
        int time = auth.getOrDefault(tokenId, 0);
        if (time > currentTime) {
            generate(tokenId, currentTime);
            tokens.add(tokenId);
        }
    }

    public int countUnexpiredTokens(int currentTime) {
        int count = 0;
        for (String token : tokens) {
            if (auth.get(token) > currentTime) {
                count++;
            }
        }
        return count;
    }

}
