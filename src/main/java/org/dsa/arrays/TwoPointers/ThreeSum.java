package org.dsa.arrays.TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    static List<List<Integer>> getThreeSum(int[] A) {

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(A);

        for (int i = 0; i < A.length - 2; i++) {
            int j = i + 1;
            int k = A.length - 1;

            while (j < k) {
                int sum = A[i] + A[j] + A[k];
                if (sum == 0) {
                    List<Integer> triplet = Arrays.asList(A[i], A[j], A[k]);
                    result.add(triplet);

                    // Move j and k to the next distinct elements
                    while (j < k && A[j] == triplet.get(1)) {
                        j++;
                    }
                    while (j < k && A[k] == triplet.get(2)) {
                        k--;
                    }
                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }

            // Skip duplicates of the first element
            while (i < A.length - 2 && A[i] == A[i + 1]) {
                i++;
            }
        }

        return result;

    }

    public static void main(String[] args) {
        System.out.println(getThreeSum(new int[]{-1,0,1,2,-1,-4}));
    }

}
