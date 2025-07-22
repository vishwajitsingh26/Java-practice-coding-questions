package org.practice;

import java.util.Arrays;
//https://leetcode.com/problems/remove-element/

public class RemoveElement {


    public static void main(String[] args) {
        int[] nums = {1,2,3,5,5,6,6,7};
        int val = 5;
        int k = removeElement(nums, val);
        System.out.println((Arrays.toString(nums)));
        System.out.println(k);
    }

    public static int removeElement(int[] nums, int val) {
        int k = 0; // Variable to track the count of elements not equal to val

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i]; // Move the element to the front
                k++; // Increment count
            }
        }

        return k;
    }
}
