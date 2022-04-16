package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

// https://leetcode.com/problems/reveal-cards-in-increasing-order
public class RevealCardsInIncreasingOrder {

    private final int[] input;

    public RevealCardsInIncreasingOrder(int[] input) {
        this.input = input;
    }

    public int[] solution() {
        int length = input.length;
        Deque<Integer> indices = new LinkedList<>();
        for (int i = 0; i < length; i++) {
            indices.add(i);
        }
        Arrays.sort(input);
        int[] result = new int[input.length];
        for (int card : input) {
            result[indices.pollFirst()] = card;
            if (!indices.isEmpty()) {
                indices.add(indices.pollFirst());
            }
        }
        return result;
    }

}
