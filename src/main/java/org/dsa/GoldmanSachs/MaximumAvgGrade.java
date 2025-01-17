package org.dsa.GoldmanSachs;

import java.util.HashMap;
import java.util.Map;

public class MaximumAvgGrade {

    public static void main(String[] args) {
        String[][] input = {
                {"Rachel", "100"},
                {"Phoebe", "80"},
                {"Monica", "95"},
                {"Rachel", "50"},
                {"Phoebe", "60"}
        };

        double result = findMaxAverageGrade(input);
        System.out.println("Maximum Average Grade: " + result);
    }

    public static double findMaxAverageGrade(String[][] input) {
        // Map to store the sum and count of grades for each student
        Map<String, int[]> studentGrades = new HashMap<>();

        double maxAverage = 0;

        // Populate the map and calculate the max average on the fly
        for (String[] entry : input) {
            String student = entry[0];
            int grade = Integer.parseInt(entry[1]);

            // If the student is not in the map, initialize their sum and count
            if (!studentGrades.containsKey(student)) {
                studentGrades.put(student, new int[2]); // [sum, count]
            }

            // Update the sum and count for the student
            int[] gradeData = studentGrades.get(student);
            gradeData[0] += grade; // Update sum
            gradeData[1] += 1;    // Update count


        }

        for (Map.Entry<String, int[]> entry : studentGrades.entrySet()) {
            int[] gradeData = entry.getValue();
            double average = (double) gradeData[0] / gradeData[1];
            if (average > maxAverage) {
                maxAverage = average;
            }
        }

        return maxAverage;
    }
}
