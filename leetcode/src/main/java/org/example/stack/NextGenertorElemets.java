package org.example.stack;
import java.util.Arrays;
import java.util.Stack;

public class NextGenertorElemets {
public static int[] nextGeneratorElements(int[] nums){
    Stack<Integer> stack= new Stack<>();
    stack.push(0);
    int answer[] = new int[nums.length];

    for (int i = 1; i < nums.length; i++) {
        while (stack.size() > 0 && nums[stack.peek()]<nums[i]){
            answer[stack.peek()] = nums[i];
            stack.pop();
        }
        stack.push(i);
    }
    for (int i = 0; i < nums.length; i++) {
         while (stack.size()>0 && nums[stack.peek()]<nums[i]){
             answer[stack.peek()]= nums[i];
             stack.pop();
         }
    }
    while (stack.size()>0){
        answer[stack.peek()] = -1;
        stack.pop();
    }
return  answer;
}

    public static void main(String[] args) {
        int[] nums1 = {4, 5, 2, 25};
        int[] result1 = nextGeneratorElements(nums1);
        System.out.println("Input: " + Arrays.toString(nums1));
        System.out.println("Next Greater Elements: " + Arrays.toString(result1));
        // Expected: [5, 25, 25, -1]

        int[] nums2 = {13, 7, 6, 12};
        int[] result2 = nextGeneratorElements(nums2);
        System.out.println("Input: " + Arrays.toString(nums2));
        System.out.println("Next Greater Elements: " + Arrays.toString(result2));
        // Expected: [-1, 12, 12, -1]

        int[] nums3 = {1, 2, 3, 4};
        int[] result3 = nextGeneratorElements(nums3);
        System.out.println("Input: " + Arrays.toString(nums3));
        System.out.println("Next Greater Elements: " + Arrays.toString(result3));
        // Expected: [2, 3, 4, -1]

        int[] nums4 = {4, 3, 2, 1};
        int[] result4 = nextGeneratorElements(nums4);
        System.out.println("Input: " + Arrays.toString(nums4));
        System.out.println("Next Greater Elements: " + Arrays.toString(result4));
        // Expected: [-1, -1, -1, -1]
    }

}
