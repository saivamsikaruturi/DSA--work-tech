package org.dsa.arrays.slidingwindow.fixedSize;

public class MaximumAverageSubArray {
    public static double findMaxAverage(int[] nums, int k) {
        double max = Double.NEGATIVE_INFINITY;
        int i=0;
        int j=0;
        int sum = 0;
        while(j<nums.length){
            sum += nums[j];
            if(j-i+1==k){
                double avg = (double) sum / k; // Calculate the average
                max = Math.max(max, avg); // Update max if the current avg is larger
                sum -= nums[i]; // Remove the element going out of the window
                i++;
            }
            j++;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(findMaxAverage(new int[]{1,12,-5,-6,50,3},4));
    }
}
