package org.dsa.hashing.HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static List<List<String>> groupAngrams(String[] str) {
        List<List<String>> groupedAnagrams = new ArrayList<>();
        HashMap<String, List<String>> hashMap = new HashMap<> ();
        for (String current: str){
            char[] chars=current.toCharArray ();
            Arrays.sort(chars);
            String s = Arrays.toString (chars);
            if(!hashMap.containsKey (s)){
                hashMap.put (s,new ArrayList<> ());
            }
            hashMap.get(s).add (current);
        }
        groupedAnagrams.addAll (hashMap.values ());

        return groupedAnagrams;
    }

    public static void main(String[] args) {
        System.out.println (GroupAnagrams.groupAngrams (new String[]{"cat", "tac", "atc", "dog", "god"}));
    }
}
