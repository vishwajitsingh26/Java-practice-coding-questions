package org.practice;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/word-pattern/description/
public class WordPattern {
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog dog dog dog";
        System.out.println(wordPattern(pattern, s));

    }

    public static boolean wordPattern(String pattern, String s) {
        Map<Character, String> characterWordMap = new HashMap<>();

        String[] words = s.split(" ");
        char[] charArray = pattern.toCharArray();

        if (words.length!=charArray.length)
            return false;

        for (int i = 0; i < charArray.length; i++) {
            Character character = charArray[i];
            String word = words[i];
            if (!characterWordMap.containsKey(character) && !characterWordMap.containsValue(word)) {
                characterWordMap.put(character, word);
            }
            if (!word.equalsIgnoreCase(characterWordMap.get(character))) {
                return false;
            }
        }
        return true;
    }
}
