package org.dsa.intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        List<int[]> result = new ArrayList<>();
        Arrays.sort(intervals, Comparator.comparingInt(i->i[0]));
        int[] newInterval = intervals[0];
        result.add(newInterval);

        for(int[] interval : intervals){
            if(interval[0] <= newInterval[1]){
                newInterval[1] = Math.max(newInterval[1],interval[1]);
            }
            else{
                newInterval = interval;
                result.add(newInterval);
            }
        }

        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        char[] result = Arrays.deepToString(merge(intervals)).toCharArray();

        // Print each character in the character array
        for (char c : result) {
            System.out.print(c); // Print characters in a single line
        }
        System.out.println();
    }
}
