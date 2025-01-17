package org.dsa.GoldmanSachs;

import java.util.*;

public class IntervalOrdering {

    public static void main(String[] args) {
        int[][] intervals = {
                {5, 7}, {15, 29}, {7, 9}, {1, 5}, {12, 15}, {29, 34}, {9, 12}
        };

        // Get the ordered intervals
        List<int[]> result = orderIntervals(intervals);
        // Print the result
        for (int[] interval : result) {
            System.out.print("(" + interval[0] + ", " + interval[1] + ") ");
        }
    }

    private static List<int[]> orderIntervals(int[][] intervals) {

        // populate the hash map and hash set
        Map<Integer,Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for(int[] interval : intervals){
            map.put(interval[0],interval[1]);
            set.add(interval[1]);
        }

        int start = 0;
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(!set.contains(entry.getKey())){
                start = entry.getKey();
            }
        }
        System.out.println("start:"+start);
        List<int[]> result = new ArrayList<>();

        while(map.containsKey(start)){
            result.add(new int[]{start,map.get(start)});
            start = map.get(start);
        }
        return result;
    }
}
