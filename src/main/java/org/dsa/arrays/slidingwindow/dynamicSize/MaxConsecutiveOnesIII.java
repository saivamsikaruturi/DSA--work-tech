package org.dsa.arrays.slidingwindow.dynamicSize;

public class MaxConsecutiveOnesIII {

     static int getLongestOnes(int[] array,int k){
             int maxOnes = 0;
             int flipped = 0;
             int start = 0;
             int end = 0;
            while(end<array.length){

                 if(array[end]==0){
                     flipped++;
                 }

                 while(flipped > k){
                     if(array[start]==0) {
                         flipped--;
                     }
                     start++;

                 }
                maxOnes = Math.max(maxOnes,end-start+1);
                 end++;
             }
            return maxOnes;
     }
    public static void main(String[] args) {
        System.out.println(getLongestOnes(new int[]{1,1,1,0,0,0,1,1,1,1,0},2));
    }
}
