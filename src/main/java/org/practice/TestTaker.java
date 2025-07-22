package org.practice;

import java.util.ArrayList;
import java.util.List;

public class TestTaker {


    public static void main(String[] args) {
        String[] students = {
                "Madeline Choi 5 5 6",
                "Ethan Wyatt 8 9 10",
                "Liam Johnson 7 4 3",
                "Olivia Brown 6 6",
                "Noah Davis 10 10 11 9" // The mark 11 will be ignored as it's out of range
        };
        System.out.println(calculateAverageMarks(students));

    }
    public static String newList(String[] students) {

        return calculateAverageMarks(students);
    }

    public static String calculateAverageMarks(String[] studentData) {
        List<String> results = new ArrayList<>();

        for (String data : studentData) {
            String[] parts = data.split("\\s+"); // Splits by any whitespace
            if (parts.length < 3) continue; // Ensures there's at least a name and two marks

            String studentName = parts[0] + " " + parts[1];
            List<Integer> marks = new ArrayList<>();

            for (int i = 2; i < parts.length; i++) {
                try {
                    int mark = Integer.parseInt(parts[i]);
                    if (mark >= 1 && mark <= 10) {
                        marks.add(mark);
                    }
                } catch (NumberFormatException e) {
                    // Ignore invalid marks
                }
            }

            if (!marks.isEmpty()) {
                int sum = 0;
                for (int mark : marks) {
                    sum += mark;
                }
                int average = sum / marks.size();
                results.add(studentName + "-" + average);
            }
        }

        return String.join(";", results) + ";";
    }
}
