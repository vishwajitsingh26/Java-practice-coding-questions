package org.practice;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
public class FindNumbersWithEvenNumberOfDigits {

    public static void main(String[] args) {
        

    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (evenDigits(num)) {
                count++;
            }
        }
        return count;

    }

    private static boolean evenDigits(int num) {
        return numberOfDigits(num) % 2 == 0;
    }

    private static int numberOfDigits(int num) {
        return (int) Math.log10(num) + 1;
    }
}
