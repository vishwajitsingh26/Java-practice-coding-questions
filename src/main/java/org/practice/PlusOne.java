package org.practice;

import java.util.Arrays;
//https://leetcode.com/problems/plus-one/description/

public class PlusOne {
    public static void main(String[] args) {
//        int[] dig = {9};
//        int[] ints = plusOne(dig);

        String s = 50 + 40 + "hello" + 20 + 30;
        System.out.println(s);
    }

    public static int[] plusOne(int[] digits) {
        int length = digits.length;
        for (int i = length - 1; i >= 0; i--) {
            digits[i]++;
            if (digits[i] <= 9) {
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        int[] result = new int[length + 1];
        result[0] = 1;
        return result;
    }
}
