package com.smlnskgmail.jaman.leetcodejava.easy;

public class SumOfEvenNumbersAfterQueries {

    private final int[] nums;
    private final int[][] queries;

    public SumOfEvenNumbersAfterQueries(int[] nums, int[][] queries) {
        this.nums = nums;
        this.queries = queries;
    }

    public int[] solution() {
        int[] result = new int[nums.length];
        int pointer = 0;
        int sum = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        for (int[] query : queries) {
            int index = query[1];
            int num = nums[index];
            if (num % 2 == 0) {
                sum -= num;
            }
            nums[index] = num + query[0];
            num = nums[index];
            if (num % 2 == 0) {
                sum += num;
            }
            result[pointer++] = sum;
        }
        return result;
    }

}
