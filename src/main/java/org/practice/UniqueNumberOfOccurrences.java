package org.practice;

import java.util.*;

//https://leetcode.com/problems/unique-number-of-occurrences/description/?envType=daily-question&envId=2024-01-17
public class UniqueNumberOfOccurrences {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 1, 1, 3};
        boolean uniqueOccurrences = uniqueOccurrences(arr);

    }

//    public static boolean uniqueOccurrences(int[] arr) {
//        Map<Integer, Integer> numberFrequencyMap = new HashMap<>();
//
//        for (int currentInt : arr) {
//            int currentFrequency = 1;
//            if (numberFrequencyMap.containsKey(currentInt)) {
//                int frequency = numberFrequencyMap.get(currentInt);
//                frequency++;
//                numberFrequencyMap.put(currentInt, frequency);
//            } else {
//                numberFrequencyMap.put(currentInt, currentFrequency);
//            }
//
//        }
//        Set<Integer> uniqueFrequency = new HashSet<>();
//        for (Integer i : numberFrequencyMap.values()
//        ) {
//            if (!uniqueFrequency.add(i)) {
//                return false;
//            }
//        }
//        return true;
//    }

    public static boolean uniqueOccurrences(int[] arr) {

        Map<Integer, Integer> numFrequencyMap = new HashMap<>();
        for (int currentInt : arr) {
            numFrequencyMap.put(currentInt, numFrequencyMap.getOrDefault(currentInt, 0) + 1);
        }

        Set<Integer> uniqueFrequency = new HashSet<>();
        for (Integer frequency : numFrequencyMap.values()) {
            if (!uniqueFrequency.add(frequency)) {
                return false;
            }
        }
        return true;


    }
}
