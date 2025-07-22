package org.practice;

import java.util.Arrays;

//https://leetcode.com/problems/merge-sorted-array/description/
public class MergeSortedArray {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 0, 0, 0};
        merge(ints, 3, new int[]{2, 5, 6}, 3);
        System.out.println(Arrays.toString(ints));

    }

    static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0)
            nums1 = nums2;

        if (m == 1) {
            if (n > 0) {
                for (int i = m; i < nums1.length; i++) {
                    for (int k : nums2) {
                        nums1[i] = k;
                        break;
                    }
                }
            }
        }

        if (m > 1) {
            for (int i = m; i < nums1.length; i++) {
                for (int k : nums2) {
                    nums1[i] = k;
                    break;
                }
            }
        }

        Arrays.sort(nums1);


    }
}
