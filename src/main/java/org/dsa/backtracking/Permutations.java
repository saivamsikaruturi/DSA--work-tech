package org.dsa.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> list = new ArrayList<>();

        List<Integer> tempList = new ArrayList<>();

        backTrack(list,tempList,nums);

        return list;

    }


    static void backTrack(List<List<Integer>> list , List<Integer> tempList, int[] nums){
        if(tempList.size()==nums.length){
            list.add(new ArrayList<>(tempList));
            return;
        }

        for(int num : nums){
            if(tempList.contains(num)) continue;
            tempList.add(num);
            backTrack(list,tempList,nums);
            tempList.remove(tempList.size()-1);
        }
    }

    public static void main(String[] args) {
       permute(new int[]{1,2,3}).stream().forEach(System.out::println);
    }
}
