package org.example.HashTable;

import java.util.HashMap;
import java.util.Map;

public class LongestConsecutive {
    private static int longestConsecutive(int[] nums){
        Map<Integer,Boolean> map= new HashMap<>();
        for (int num:nums) {
           map.put(num,true);
        }
        int ans=0;
        for (int num:nums) {
            if (map.containsKey(num-1)){
                continue;
            }
            int nextNum= num+1;
            int count =1;
            while (map.containsKey(nextNum)){
                nextNum++;
                count++;
            }
            if(count>ans){
                ans=count;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        // Test case 1: Example input
        int[] nums1 = {100, 4, 200, 1, 3, 2};
        System.out.println("Longest consecutive length: " + longestConsecutive(nums1));
        // Expected: 4 (sequence is [1,2,3,4])

        // Test case 2: Another input
        int[] nums2 = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        System.out.println("Longest consecutive length: " + longestConsecutive(nums2));
        // Expected: 9 (sequence is [0,1,2,3,4,5,6,7,8])

        // Test case 3: No consecutive sequence
        int[] nums3 = {10, 30, 50};
        System.out.println("Longest consecutive length: " + longestConsecutive(nums3));
        // Expected: 1 (each number stands alone)

        // Test case 4: Empty array
        int[] nums4 = {};
        System.out.println("Longest consecutive length: " + longestConsecutive(nums4));
        // Expected: 0
    }

}
