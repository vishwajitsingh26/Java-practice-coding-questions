package org.practice;

import java.util.Scanner;

import static org.practice.Palindrome.isPalindrome;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner scanner = new Scanner(System.in);
        boolean palindrome1 = isPalindrome(scanner.nextInt());
        System.out.println(palindrome1);


    }

}