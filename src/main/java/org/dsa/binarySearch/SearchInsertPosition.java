package org.dsa.binarySearch;

public class SearchInsertPosition {
        public static int searchInsert(int[] nums, int target) {

            int left = 0;
            int right = nums.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2; // Calculate mid-point
                if (nums[mid] == target) {
                    return mid; // Target found
                } else if (nums[mid] < target) {
                    left = mid + 1; // Target is in the right half
                } else {
                    right = mid - 1; // Target is in the left half
                }
            }

            // If target is not found, `left` points to the insertion index
            return left;

        }

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1,3,5,6},2));
    }

}
