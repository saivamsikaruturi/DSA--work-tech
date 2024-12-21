package org.dsa.arrays.TwoPointers;

public class RemoveDuplicatesFromArray {

         static int getUniqueArray(int[] array){

             int j = 1;
             for(int i = 1;i<array.length;i++){
                 if(array[i]!=array[i-1]){
                     array[j] = array[i];
                     j++;
                 }
             }
             return j;
         }

    public static void main(String[] args) {
             int[] array = {0,0,1,1,1,2,2,3,3,4};
            int ans = getUniqueArray(array);
            for(int i =0;i<ans;i++){
                System.out.println(array[i]);
            }

    }
}
