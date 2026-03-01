package org.example.intervals;

public class SearchInsert {
    private static int searchInsert(int[] nums,int target){
       int start= 0, end= nums.length-1;

       while (start<=end){
           int mid = (start+end)/2;
           if(nums[mid]==target){
               return mid;
           }else if(nums[mid]>target){
               end= mid-1;
           }else {
               start=mid+1;
           }
       }
       return start;
    }

    public static void main(String[] args) {
        SearchInsert obj = new SearchInsert();
        int[] nums = {1, 3, 5, 6};

        System.out.println(obj.searchInsert(nums, 5)); // Output: 2
        System.out.println(obj.searchInsert(nums, 2)); // Output: 1
        System.out.println(obj.searchInsert(nums, 7)); // Output: 4
        System.out.println(obj.searchInsert(nums, 0)); // Output: 0
    }
}

