package org.example.twopointermethod;

import java.util.Arrays;

public class TrappingRainWater {
    public int trap(int[] height){

        int n= height.length;
        if(n==0){
            return 0;
        }
        int ans=0;
        int[] left= new int[n];
        int[] right= new int[n];

        left[0]=height[0];
        System.out.println(Arrays.toString(height));
        for (int i = 1; i < n; i++) {
          left[i]= Math.max(left[i-1],height[i]);
        }
       System.out.println(Arrays.toString(left));

        right[n-1]=height[n-1];

        for (int i = n-2; i >=0; i--) {
           right[i]= Math.max(right[i+1],height[i]);
        }

        System.out.println(Arrays.toString(right));
        for (int i = 0; i < n; i++) {
            ans+=(Math.min(left[i],right[i]))-height[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        TrappingRainWater obj = new TrappingRainWater();

        int[] h1 = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("Input: [0,1,0,2,1,0,1,3,2,1,2,1] → " + obj.trap(h1));
        // Expected: 6

        int[] h2 = {4,2,0,3,2,5};
        System.out.println("Input: [4,2,0,3,2,5] → " + obj.trap(h2));
        // Expected: 9

        int[] h3 = {1,0,2,1,0,1,3};
        System.out.println("Input: [1,0,2,1,0,1,3] → " + obj.trap(h3));
        // Expected: 6

        int[] h4 = {2,0,2};
        System.out.println("Input: [2,0,2] → " + obj.trap(h4));
        // Expected: 2

        int[] h5 = {};
        System.out.println("Input: [] → " + obj.trap(h5));
        // Expected: 0
    }

}
