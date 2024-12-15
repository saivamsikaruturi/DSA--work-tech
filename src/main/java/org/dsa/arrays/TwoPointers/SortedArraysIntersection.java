package org.dsa.arrays.TwoPointers;

import java.util.ArrayList;
import java.util.List;

public class SortedArraysIntersection {
    List<Integer> intersection (int[] A, int[] B) {
        List<Integer> list = new ArrayList<>();
        int i=0;
        int j=0;
        while(i<A.length && j<B.length){
            if(A[i]==B[j]){
                list.add(A[i]);
                i++;
                j++;
            }
            else if(A[i]<B[j]){
                i++;
            }
            else{
                j++;
            }
        }
        return list;
    }
}
