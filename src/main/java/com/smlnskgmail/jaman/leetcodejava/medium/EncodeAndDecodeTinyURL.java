package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

// https://leetcode.com/problems/encode-and-decode-tinyurl/
public class EncodeAndDecodeTinyURL {

    private static final String SYMBOLS = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    private final Map<String, String> urls = new HashMap<>();

    public String encode(String longUrl) {
        String shortUrl = generateShortUrl();
        while (urls.containsKey(shortUrl)) {
            shortUrl = generateShortUrl();
        }
        urls.put(shortUrl, longUrl);
        return shortUrl;
    }

    private String generateShortUrl() {
        var shortUrl = new StringBuilder();
        var random = new Random();
        for (int i = 0; i < 6; i++) {
            shortUrl.append(SYMBOLS.charAt(random.nextInt(SYMBOLS.length())));
        }
        return shortUrl.toString();
    }

    public String decode(String shortUrl) {
        return urls.get(shortUrl);
    }

}
