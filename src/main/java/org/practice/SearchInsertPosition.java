package org.practice;

//https://leetcode.com/problems/search-insert-position/

public class SearchInsertPosition {
    public static void main(String[] args) {

    }

    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>target){
                return i;
            }
            if (nums[i] == target) {
                return i;
            } else if (i + 1 < nums.length && nums[i + 1] > target) {
                return i + 1;
            }
        }
        return nums.length;
    }
}
