package org.practice;

import java.util.Arrays;

//https://leetcode.com/problems/array-partition/
public class ArrayPartition {
    public static void main(String[] args) {
        int minSum = arrayPairSum(new int[]{1, 2, 3, 4,5,6});
        System.out.println(minSum);

    }

    public static int arrayPairSum(int[] nums) {
        // Sort the array in ascending order
        Arrays.sort(nums);

        int sum = 0;

        // Pair adjacent elements and add the smaller value to the sum
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }

        return sum;
    }
}
