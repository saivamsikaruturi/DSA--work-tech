package org.dsa.arrays.TwoPointers;

public class KDiffPairs {
    int getDiffPairs (int[] A, int k) {
        int j = 1;
        int i = 0;
        int res = 0;
        while(i < A.length && j < A.length){


            if (i != j && A[i] != A[j]) {
                int diff = A[j]-A[i];
                if (diff == k) {
                    res++;
                    i++;
                    j++;
                } else if (diff > k) {
                    j++;
                } else {
                    i--;
                }
            }

        }


        return res;



    }
}
