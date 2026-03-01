package org.example.twopointermethod;

public class TwoSum {
    public int[] twoSum(int[] nums, int target){
        int n= nums.length-1;
        int f=0,s=n;
        int ans[] = new int[2];
        while (f<s){
          int sum= nums[f]+nums[s];
          if(sum<target){
              f++;
          } else if (sum>target) {
              s--;
          }else {
              ans[0]=f+1;
              ans[1]=s+1;
              break;
          }
        }
        return ans;
    }

    public static void main(String[] args) {
        TwoSum obj = new TwoSum();

        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] res1 = obj.twoSum(nums1, target1);
        System.out.println("Input: [2,7,11,15], target=9 → [" + res1[0] + "," + res1[1] + "]");
        // Expected: [1,2]

        int[] nums2 = {2, 3, 4};
        int target2 = 6;
        int[] res2 = obj.twoSum(nums2, target2);
        System.out.println("Input: [2,3,4], target=6 → [" + res2[0] + "," + res2[1] + "]");
        // Expected: [1,3]

        int[] nums3 = {-1, 0};
        int target3 = -1;
        int[] res3 = obj.twoSum(nums3, target3);
        System.out.println("Input: [-1,0], target=-1 → [" + res3[0] + "," + res3[1] + "]");
        // Expected: [1,2]
    }


}
