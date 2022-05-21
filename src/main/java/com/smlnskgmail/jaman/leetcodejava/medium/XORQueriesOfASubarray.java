package com.smlnskgmail.jaman.leetcodejava.medium;

// https://leetcode.com/problems/xor-queries-of-a-subarray/
public class XORQueriesOfASubarray {

    private final int[] arr;
    private final int[][] queries;

    public XORQueriesOfASubarray(int[] arr, int[][] queries) {
        this.arr = arr;
        this.queries = queries;
    }

    public int[] solution() {
        for (int i = 1; i < arr.length; i++) {
            arr[i] ^= arr[i - 1];
        }
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            result[i] = query[0] == 0 ? arr[query[1]] : arr[query[0] - 1] ^ arr[query[1]];
        }
        return result;
    }

}
