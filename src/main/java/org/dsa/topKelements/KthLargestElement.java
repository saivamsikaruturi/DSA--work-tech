package org.dsa.topKelements;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthLargestElement {

    // Min-Heap to store the top k elements
    PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> (a - b));

    int size;

    // Constructor
    public KthLargestElement(int k, int[] nums) {
        size = k;

        // Add all elements to the heap
        for (int num : nums) {
            minHeap.add(num);
            // If heap size exceeds k, remove the smallest element
            if (minHeap.size() > size) {
                minHeap.poll();  // poll() removes the root, which is the smallest in the min-heap
            }
        }
    }

    // Add new element and return the kth largest
    public int add(int val) {
        minHeap.add(val);
        // If heap size exceeds k, remove the smallest element
        if (minHeap.size() > size) {
            minHeap.poll();  // poll() removes the root, which is the smallest in the min-heap
        }

        // Return the root of the heap, which is the kth largest element
        return minHeap.peek();
    }

    public static void main(String[] args) {
        KthLargestElement kthLargest = new KthLargestElement(3, new int[]{4, 5, 8, 2});

        // Add new elements and print the kth largest element
        System.out.println(kthLargest.add(3));  // Output: 4
        System.out.println(kthLargest.add(5));  // Output: 5
        System.out.println(kthLargest.add(10)); // Output: 5
        System.out.println(kthLargest.add(9));  // Output: 8
        System.out.println(kthLargest.add(4));  // Output: 8
    }
}
