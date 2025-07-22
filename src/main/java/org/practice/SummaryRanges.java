package org.practice;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/summary-ranges/description/
public class SummaryRanges {
    public static void main(String[] args) {

    }

    public static List<String> summaryRanges(int[] nums) {
        List<String> summary = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int start = nums[i];
            while (i + 1 < nums.length && nums[i + 1] - nums[i] == 1) {
                i++;
            }
            int end = nums[i];
            if (start == end) {
                summary.add(String.valueOf(start));
            } else {
                summary.add(start + "->" + end);
            }
        }

        return summary;
    }
}


