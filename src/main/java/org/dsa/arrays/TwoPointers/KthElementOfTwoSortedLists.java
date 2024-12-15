package org.dsa.arrays.TwoPointers;

public class KthElementOfTwoSortedLists {
    int getKthElement(int[] firstArr, int[] secondArr, int k) {
        // add logic here
        int index1 = 0;
        int index2 = 0;

        while (index1 < firstArr.length && index2 < secondArr.length) {
            if (firstArr[index1] <= secondArr[index2]) {
                if (index1 + index2 == k - 1) {
                    return firstArr[index1];
                }
                index1++;
            } else {
                if (index1 + index2 == k - 1) {
                    return secondArr[index2];
                }
                index2++;
            }
        }

        // Handle the case when k is not reached in one of the lists
        while (index1 < firstArr.length) {
            if (index1 + index2 == k - 1) {
                return firstArr[index1];
            }
            index1++;
        }

        while (index2 < secondArr.length) {
            if (index1 + index2 == k - 1) {
                return secondArr[index2];
            }
            index2++;
        }

        return -1; // Return -1 if k is out of bounds
    }
}
