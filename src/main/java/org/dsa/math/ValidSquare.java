package org.dsa.math;

import java.util.Arrays;

public class ValidSquare {
    public static boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        int[] distances = new int[]{
                distanceSquared(p1, p2),
                distanceSquared(p1, p3),
                distanceSquared(p1, p4),
                distanceSquared(p2, p3),
                distanceSquared(p2, p4),
                distanceSquared(p3, p4)
        };

        Arrays.sort(distances);

        // Check if there are 4 equal smallest distances and 2 larger equal distances
        return distances[0] > 0 && distances[0] == distances[1] && distances[1] == distances[2] &&
                distances[2] == distances[3] && distances[4] == distances[5] &&
                distances[4] == 2 * distances[0];
    }

    // Helper function to calculate the squared distance between two points
    private static int distanceSquared(int[] p1, int[] p2) {
        return (p1[0] - p2[0]) * (p1[0] - p2[0]) + (p1[1] - p2[1]) * (p1[1] - p2[1]);
    }

    public static void main(String[] args) {
        System.out.println(validSquare(new int[]{0,0}, new int[] {1,1}, new int[] {1,0}, new int[] {0,1}));
    }
}
