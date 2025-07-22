package org.practice;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

//https://leetcode.com/problems/missing-number/description/
public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        int i = missingNumber(nums);
        System.out.println(i);
    }

    public static int missingNumber(int[] nums) {
        if (nums.length == 1) {
            if (nums[0] == 0) {
                return 1;
            }
            return 0;
        }

        int expectedSum = (nums.length) * ((nums.length) + 1) / 2;

        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }
}
