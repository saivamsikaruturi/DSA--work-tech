package org.dsa.binarySearch;

public class SearchInRotatedSortedArray {
        public static int search(int[] nums, int target) {
            int leftIdx = 0;
            int rightIdx = nums.length - 1;
            while(leftIdx <= rightIdx)

            {
                int midIdx = (leftIdx + rightIdx)/ 2;
                if(nums[midIdx] == target)
                    return midIdx;
                else if(nums[midIdx] >= nums[leftIdx])
                {
                    if(target <= nums[midIdx] && target >=nums[leftIdx])
                        rightIdx = midIdx-1;
                    else
                        leftIdx = midIdx+1;
                }
                else{
                    if(target >= nums[midIdx] && target<=nums[rightIdx])
                        leftIdx = midIdx+1;
                    else
                        rightIdx = midIdx-1;
                }
            }
            return -1;
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
