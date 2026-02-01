package org.example.slidingwindow;

public class SlidingWindowProblem1 {
    private void slidingWindow(int [] nums){
        int n = nums.length;
        int k = 3;
        int sum=0;
        for (int i = 0; i < k; i++) {
            sum= sum+nums[i];
        }
        System.out.println(sum);
        for (int i = 1; i <= n-k; i++) {
            sum= sum-nums[i-1]+nums[i+k-1];
            System.out.println(sum);
        }

    }
    public static void main(String[] args) {
        SlidingWindowProblem1 obj = new SlidingWindowProblem1();

        // Test case 1
        int[] nums1 = {1, 2, 3, 4, 5};
        System.out.println("Test Case 1: [1, 2, 3, 4, 5]");
        obj.slidingWindow(nums1);

        // Test case 2
        int[] nums2 = {10, 20, 30, 40, 50, 60};
        System.out.println("\nTest Case 2: [10, 20, 30, 40, 50, 60]");
        obj.slidingWindow(nums2);

        // Test case 3
        int[] nums3 = {5, -1, 3, 7, 2};
        System.out.println("\nTest Case 3: [5, -1, 3, 7, 2]");
        obj.slidingWindow(nums3);
    }

}
