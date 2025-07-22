package org.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/max-consecutive-ones/
public class MaxConsecutiveOnes {
    public static void main(String[] args) {

    }


    public static int findMaxConsecutiveOnes(int[] nums) {
       int maxConsecutiveOnes = 0;
       int count = 0;
        for (int num : nums) {
            if (num == 1) {
                count++;
            } else {
                count = 0;
            }
            if (count > maxConsecutiveOnes) {
                maxConsecutiveOnes = count;
            }

        }

        return maxConsecutiveOnes;
    }
}
