package org.practice;

public class Palindrome {

    public static void main(String[] args) {
        boolean palindrome = isPalindrome(121);
        System.out.println(palindrome);
    }

    public static boolean isPalindrome(int x) {


        int input = x, reverseNumber = 0;
        if (x == 0) return false;

        while (x > 0) {
            int lastElement = x % 10;
            reverseNumber = reverseNumber * 10 + lastElement;
            x = x / 10;

        }
        return input == reverseNumber;
    }
}
