package org.dsa.arrays.TwoPointers;

class RemoveOccurences {
    int removeOccurences(int[] A, int k) {
        int size = A.length;
        for(int i =0;i<A.length;i++){
            if(A[i]==k){
                size--;
            }
        }
        return size;
    }
}