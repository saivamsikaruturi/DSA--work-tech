package org.dsa.binarySearch;

public class MinimumInRotatedSortedArray {
    public static int findMin(int[] nums) {
        int low =0;
        int high = nums.length-1;
        int ans = Integer.MAX_VALUE;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[low]<=nums[mid]){
                ans = Math.min(ans,nums[low]);
                low = mid+1;
            }
            else{
                high = mid-1;
                ans = Math.min(ans,nums[mid]);
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        System.out.println(findMin(new int[]{7,2,3,4}));
    }
}
