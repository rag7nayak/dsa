package org.example.search;

public class FindFirstAndLast {
    private static int[] searchRange(int[] nums,int target){
        int leftPosition= fineLeft(nums,target);
        int rightPosition= fineRight(nums,target);

        return new int[]{leftPosition,rightPosition};
    }

    private static int fineLeft(int[] nums, int target){
        int start= 0;
        int end= nums.length-1;
        int ans=-1;
        while (start<=end){
            int mid = (start+end)/2;

            if(nums[mid]<target){
                start= mid+1;
            } else if (nums[mid]>target) {
                end=mid-1;
            }else {
                ans=mid;
                end=mid-1;
            }
        }
        return ans;
    }
    private static int fineRight(int[] nums, int target){
        int start= 0;
        int end= nums.length-1;
        int ans=-1;
        while (start<=end){
            int mid = (start+end)/2;

            if(nums[mid]<target){
                start= mid+1;
            } else if (nums[mid]>target) {
                end=mid-1;
            }else {
                ans=mid;
                start=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};

        // Test case 1: target exists multiple times
        int[] result1 = searchRange(nums, 8);
        System.out.println("Target 8 -> [" + result1[0] + "," + result1[1] + "]"); // Expected: [3,4]

        // Test case 2: target does not exist
        int[] result2 = searchRange(nums, 6);
        System.out.println("Target 6 -> [" + result2[0] + "," + result2[1] + "]"); // Expected: [-1,-1]

        // Test case 3: target exists once
        int[] result3 = searchRange(nums, 10);
        System.out.println("Target 10 -> [" + result3[0] + "," + result3[1] + "]"); // Expected: [5,5]

        // Test case 4: target at beginning
        int[] result4 = searchRange(nums, 5);
        System.out.println("Target 5 -> [" + result4[0] + "," + result4[1] + "]"); // Expected: [0,0]
    }

}
