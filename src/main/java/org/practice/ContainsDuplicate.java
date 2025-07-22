package org.practice;

import java.util.Arrays;
import java.util.stream.IntStream;

//https://leetcode.com/problems/contains-duplicate/
public class ContainsDuplicate {
    public static void main(String[] args) {

    }

    public static boolean containsDuplicate(int[] nums) {
        IntStream distinct = Arrays.stream(nums).distinct();
        long count = distinct.count();
        return count < nums.length;


    }
}
