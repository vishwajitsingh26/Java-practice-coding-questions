package org.practice;

/**
 * <a href="https://leetcode.com/problems/two-sum/">...</a>
 **/

public class TwoSum {
    public static void main(String[] args) {

    }

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == diff) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
}
