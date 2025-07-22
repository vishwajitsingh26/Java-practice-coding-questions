package org.practice;

import java.util.HashMap;
import java.util.Map;

public class AnagramChecker {

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        boolean result = areAnagrams(str1, str2);
        System.out.println("Are the two strings anagrams? " + result);
    }

    private static boolean areAnagrams(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() != str2.length()) {
            return false;
        }

        Map<Character, Integer> frequecnyMap = new java.util.HashMap<>();
        for (char c : str1.toCharArray()) {
            frequecnyMap.put(c, frequecnyMap.getOrDefault(c, 0) + 1);
        }

        for (char c : str2.toCharArray()) {
            if (!frequecnyMap.containsKey(c)) return false;
            frequecnyMap.put(c, frequecnyMap.get(c) - 1);
            if (frequecnyMap.get(c) < 0) return false;
        }
        return true;
    }

    public  static boolean isAnagram(String str1, String str2) {
        if(str1==null || str2==null || str1.length()!=str2.length()){
            return false;
        }
        Map<Character,Integer> frequencyMap = new HashMap<>();

        for(char c : str1.toCharArray()){
            frequencyMap.put(c,frequencyMap.getOrDefault(c,0)+1);
        }
        for(char c :str2.toCharArray()){
            if(!frequencyMap.containsKey(c)) return false;
            frequencyMap.put(c,frequencyMap.get(c)-1);
            if(frequencyMap.get(c)<0) return false;
        }
        return true;
    }
}
