package org.example.HashTable;

public class FirstMissingPositive {
    public static int firstMissingPositive(int[] nums){
        int  n=nums.length;
        for (int i = 0; i < n; i++) {
            int ele = nums[i];
            while (nums[i]>=1 && nums[i]<=n && nums[ele-1] != ele){
                int temp= nums[ele-1];
                nums[ele-1]=nums[i];
                nums[i]=temp;
                ele=nums[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if(nums[i] != i+1){
                return i+1;
            }
        }
        return n+1;
    }
    public static void main(String[] args) {
        System.out.println(firstMissingPositive(new int[]{3,4,-1,1})); // Expected 2
        System.out.println(firstMissingPositive(new int[]{1,2,0}));    // Expected 3
        System.out.println(firstMissingPositive(new int[]{7,8,9,11})); // Expected 1
        System.out.println(firstMissingPositive(new int[]{1,2,3}));    // Expected 4
    }

}
