package org.practice;

import org.apache.commons.math3.stat.regression.SimpleRegression;

import java.util.stream.IntStream;

public class NumberPrediction {
    public static void main(String[] args) {
        // Data
        double[] sequence = {2.97,1.61,1.45,1.6,2.59,1.49,
                1.25,
                1.14,
                1.4,
                3.06,
                6.41,1.19, 2.77, 1.47, 1.63, 3.12, 47.02, 4.65, 1.7, 1.4, 2.2, 1.83, 1.88, 8.08,
                1.13, 3.41, 2.15, 3.58, 2.43, 1.95, 1.98, 1.18, 2.11, 1.16, 3.66, 2.72, 21.51,
                1.24, 1.18, 1.33, 6.92, 8.48, 7.11, 3.43, 1.67, 3.88, 1.43, 22.35, 3.59, 1.28,
                7.99, 9.73, 2.05, 1.13, 1.64, 2.15, 1.39, 1.94, 2.7, 3.19, 1.2, 1.12, 1.47,
                14.66, 2.02, 10.95, 4.8, 18.81, 1.17, 6, 155.21, 1, 1.8, 1.98, 1.03, 1.4, 2.67,
                1.29, 2.38, 1.48, 2.31, 3.91, 11.64, 2.11, 3.6, 1.38, 1.57, 1.7, 5.22, 1.24,
                32.93, 4.08, 3.52, 24.84, 1, 1.76, 1.5, 41.56, 2.71, 2.9, 4.47, 3.55, 2.87,
                1.64, 1.71, 1.25, 4.05, 1.39, 6.57, 2.75, 5.53, 9.31, 2.55, 1.89, 1.73, 3.32,
                2.66, 1.03, 2.41, 1.91
        };

        // Calculate differences
        double[] differences = new double[sequence.length - 1];
        for (int i = 0; i < sequence.length - 1; i++) {
            differences[i] = sequence[i + 1] - sequence[i];
        }

        // Average difference
        double averageDiff = java.util.Arrays.stream(differences, 0, differences.length)
                .average()
                .orElse(0);

        // Predict next number (difference-based)
        double nextNumberDiff = sequence[sequence.length - 1] + averageDiff;

        // Regression-based prediction
        SimpleRegression regression = new SimpleRegression();
        for (int i = 0; i < sequence.length; i++) {
            regression.addData(i, sequence[i]);
        }
        double nextNumberRegression = regression.predict(sequence.length);

        // Results
        System.out.println("Next number (difference-based): " + nextNumberDiff);
        System.out.println("Next number (regression-based): " + nextNumberRegression);
    }
}
