package org.practice;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/single-number/description/
public class SingleNumber {
    public static void main(String[] args) {

    }

    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> numberFrequencyMap = new HashMap<>();

        for (int currentInt : nums) {
            int currentFrequency = 1;
            if (numberFrequencyMap.containsKey(currentInt)) {
                int frequency = numberFrequencyMap.get(currentInt);
                frequency++;
                numberFrequencyMap.put(currentInt, frequency);
            } else {
                numberFrequencyMap.put(currentInt, currentFrequency);
            }

        }
        for (Map.Entry<Integer, Integer> entry : numberFrequencyMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return 0;
    }
}
