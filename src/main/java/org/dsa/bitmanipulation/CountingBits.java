package org.dsa.bitmanipulation;

import java.util.Arrays;

public class CountingBits {

     static  int[] getCountBits(int n){
         int[] array = new int[n+1];
         Arrays.fill(array,0);
         for(int i =1;i<n+1;i++){
             if(i%2==0)
                 array[i]=array[i/2];
             else
                 array[i]=array[i/2]+1;

         }
         return array;
     }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getCountBits(5)));
    }
}
