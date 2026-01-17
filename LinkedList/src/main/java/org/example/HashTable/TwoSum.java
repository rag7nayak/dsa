package org.example.HashTable;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    private static int[] twoSum(int[] nums,int target){
        Map<Integer,Integer> map= new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
             int diff= target-nums[i];
             if(map.containsKey(diff)){
                 return new int[]{map.get(diff), i};
             }else {
                 map.put(diff,i);
             }
        }
        return null;
    }

    // Test case
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        if (result != null) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
            System.out.println("Values: " + nums[result[0]] + ", " + nums[result[1]]);
        } else {
            System.out.println("No solution found.");
        }
    }

}
