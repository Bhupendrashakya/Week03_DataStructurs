package sampleproblemsofstackandqueue;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMaximum {
    // Function to find the maximum element in each sliding window of size k
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length < k) {
            throw new IllegalArgumentException("Invalid input");
        }

        int n = nums.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            // Remove elements out of the current window
            if (!deque.isEmpty() && deque.peekFirst() == i - k) {
                deque.pollFirst();
            }

            // Remove elements that are less than the current element from the deque
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }

            // Add the current element index to the deque
            deque.offerLast(i);

            // Add the maximum element of the current window to the result
            if (i >= k - 1) {
                result[i - k + 1] = nums[deque.peekFirst()];
            }
        }

        return result;
    }

    // Main function to test the maxSlidingWindow method
    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] result = maxSlidingWindow(nums, k);

        System.out.println("Array: " + Arrays.toString(nums));
        System.out.println("Window size: " + k);
        System.out.println("Maximums in each sliding window: " + Arrays.toString(result));
    }
}
