package org.dsa.arrays.MooresVotingAlgo;

public class MajorityElement {
     static int getMajorityElement(int[] array){

         int count = 0;
         int majority = -1;
         for(int i =0;i<array.length;i++){
             if(count == 0){
                 majority = array[i];
             }

             if(majority!=array[i])
             {
                 count--;
             }

             if(majority==array[i]){
                 count++;
             }
         }

         return majority;
     }

    public static void main(String[] args) {
        System.out.println(getMajorityElement( new int[]{2,2,1,1,1,2,2}));
    }
}
