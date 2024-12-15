package org.dsa.arrays.slidingwindow;

import java.util.ArrayList;
import java.util.List;

public class KSubStringVowels {
    int[] kSubstringVowels (String s, int k) {
        // add your logic here
        int i = 0;
        int j =0;
        List<Integer> list = new ArrayList<>();
        int count = 0;
        while(j<s.length()){

            if(s.charAt(j)=='a' || s.charAt(j) == 'e' ||
                    s.charAt(j) == 'i' || s.charAt(j) == 'o'
                    || s.charAt(j) == 'u'){
                count++;
            }

            if(j-i+1==k){
                list.add(count);
                if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                    count--;
                }
                i++;

            }
            j++;

        }


        return  list.stream().mapToInt(Integer::intValue).toArray();
    }
}
