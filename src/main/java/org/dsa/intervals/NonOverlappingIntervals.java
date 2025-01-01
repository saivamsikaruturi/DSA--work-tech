package org.dsa.intervals;

import java.util.Arrays;
import java.util.Comparator;

public class NonOverlappingIntervals {

      static int getOverlappingIntervalCount(int[][] intervals ){
          if (intervals.length == 0) return 0;

          // Sort intervals based on the end time
          Arrays.sort(intervals, Comparator.comparingInt(i->i[1]));

          int count = 0;
          int[] prev = intervals[0];

          // Start from the second interval and compare with the previous interval
          for (int i = 1; i < intervals.length; i++) {
              int[] current = intervals[i];

              // If there's an overlap (current start is less than previous end)
              if (current[0] < prev[1]) {
                  count++; // Increment count for an overlap
              } else {
                  prev = current; // Update prev to current when there's no overlap
              }
          }

          return count;
      }

    public static void main(String[] args) {
        int[][] intervals = {{1,2},{2,3},{3,4},{1,3}};
       int res =getOverlappingIntervalCount(intervals);
        System.out.println(res);
    }
}
