package org.practice;

import java.util.*;

//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
public class FindAllNumbersDisappearedInAnArray {
    public static void main(String[] args) {

    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                result.add(i);
            }
        }
        return result;
    }



}
