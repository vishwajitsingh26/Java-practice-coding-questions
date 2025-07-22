package org.practice;

//https://leetcode.com/problems/first-unique-character-in-a-string/description/
public class FirstUniqueCharacterInAString {

    public static void main(String[] args) {

    }

    public static int firstUniqChar(String s) {

        int index = -1;
        for(char ch : s.toCharArray()) {
            if(s.indexOf(ch) == s.lastIndexOf(ch)) {
                return s.indexOf(ch);
            }
        }

        return index;
    }
}
