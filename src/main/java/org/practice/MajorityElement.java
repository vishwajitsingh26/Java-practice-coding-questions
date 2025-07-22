package org.practice;



//https://leetcode.com/problems/majority-element/description/
public class MajorityElement {
    public static void main(String[] args) {
        int i = majorityElement(new int[]{3, 2, 3});
        System.out.println(i);

    }

    public static int majorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                candidate = nums[i];
            }
            if (candidate == nums[i]) {
                count++;
            } else {
                count--;
            }

        }
        count = 0;
        for (int num : nums) {
            if (candidate == num) {
                count++;
            }

        }
        return count > nums.length / 2 ? candidate : -1;

    }
}
