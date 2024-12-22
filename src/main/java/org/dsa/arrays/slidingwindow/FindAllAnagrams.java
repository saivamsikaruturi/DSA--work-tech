package org.dsa.arrays.slidingwindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagrams {

     static int[] getIndexOfAnagrams(String s , String t){

         int[] freq = new int[26];
         int[] wFreq = new int[26];
         List<Integer> list = new ArrayList<>();
         for(int i =0;i<t.length();i++){
             freq[t.charAt(i)-'a']++;
         }

         int j=0,i=0;
        while(j<s.length()){

             wFreq[s.charAt(j)-'a']++;
            if(j-i+1==t.length()){
                if(checkFrequencies(wFreq,freq)){
                    list.add(i);
                }
                wFreq[s.charAt(i)-'a']--;
                i++;
            }

            j++;
        }

         int[] array = new int[list.size()];
        for(int k =0;k<array.length;k++){
            array[k] = list.get(k);
        }

        return  array;

     }

    private static boolean checkFrequencies(int[] freq1, int[] freq2) {
        for (int i = 0; i < 26; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] result = getIndexOfAnagrams("cbaebabacd","abc");
        System.out.println(Arrays.toString(result));
     }
}
