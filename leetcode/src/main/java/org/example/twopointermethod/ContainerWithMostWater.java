package org.example.twopointermethod;

public class ContainerWithMostWater {
    public int maxArea(int[] height){
        int left=0,right= height.length-1;
        int ans=0;

        while (left<right){
            int width= right-left;
            int heightOfRectangle= Math.min(height[left],height[right]);
            int area= width*heightOfRectangle;
            ans = Math.max(ans,area);

            if(height[left]<height[right]){
                left++;
            }else {
                right--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        ContainerWithMostWater obj = new ContainerWithMostWater();

        int[] h1 = {1,8,6,2,5,4,8,3,7};
        System.out.println("Input: [1,8,6,2,5,4,8,3,7] → " + obj.maxArea(h1));
        // Expected: 49 (between lines at index 1 and 8)

        int[] h2 = {1,1};
        System.out.println("Input: [1,1] → " + obj.maxArea(h2));
        // Expected: 1

        int[] h3 = {4,3,2,1,4};
        System.out.println("Input: [4,3,2,1,4] → " + obj.maxArea(h3));
        // Expected: 16 (between lines at index 0 and 4)

        int[] h4 = {1,2,1};
        System.out.println("Input: [1,2,1] → " + obj.maxArea(h4));
        // Expected: 2

        int[] h5 = {2,3,10,5,7,8,9};
        System.out.println("Input: [2,3,10,5,7,8,9] → " + obj.maxArea(h5));
        // Expected: 36 (between lines at index 2 and 6)
    }

}
