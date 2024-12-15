package org.dsa.arrays.TwoPointers;

public class MergeTwoSortedArrays {
    int[] mergeSortedArrays(int[] A, int[] B) {
        int m = A.length;
        int n = B.length;
        int[] resultedArray = new int[m+n];
        int i =0,j=0,k=0;
        while( i< A.length && j< B.length){
            if(A[i] < B[j]){
                resultedArray[k] = A[i];
                i++;
                k++;
            }
            else{
                resultedArray[k] = B[j];
                j++;
                k++;
            }
        }
        while(i< A.length){
            resultedArray[k]= A[i];
            i++;
            k++;
        }

        while(j< B.length){
            resultedArray[k]=B[j];
            j++;
            k++;
        }
        return resultedArray;
    }
}
