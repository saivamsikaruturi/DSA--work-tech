package org.dsa.intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertInterval {
    public static void main(String[] args) {
        int[][] input = {{1, 2}, {3, 5}, {6, 7}, {8, 10},{12,16}};
        System.out.println(Arrays.deepToString(insert(input,new int[]{4,8})));

    }

     static  int[][] insert(int[][] intervals, int[] newInterval){

        int i = 0;
        int n = intervals.length;
         List<int[]> list = new ArrayList<>();

         while(i< n && intervals[i][1]<newInterval[0]){
             list.add(intervals[i]);
             i++;
         }

         while (i < n && intervals[i][0] <= newInterval[1]){
             newInterval[0] = Math.min(intervals[i][0],newInterval[0]);
             newInterval[1] = Math.max(intervals[i][1],newInterval[1]);
             i++;
         }

          list.add(newInterval);

         while (i<n){
             list.add(intervals[i]);
             i++;
         }

          int[][] array = new int[list.size()][2];
          for(int j =0;j<list.size();j++){
               array[j] = list.get(j);
          }

          return array;
     }
}
