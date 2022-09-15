package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.*;

// https://leetcode.com/problems/find-original-array-from-doubled-array/
public class FindOriginalArrayFromDoubledArray {

    private final int[] input;

    public FindOriginalArrayFromDoubledArray(int[] input) {
        this.input = input;
    }

    public int[] solution() {
        List<Integer> result = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        Arrays.sort(input);
        for (int num : input) {
            if (!q.isEmpty() && num == q.peek()) {
                q.poll();
            } else {
                q.offer(num * 2);
                result.add(num);
            }
        }
        return q.isEmpty()
                ? result.stream().mapToInt(i -> i).toArray()
                : new int[]{};
    }

}
