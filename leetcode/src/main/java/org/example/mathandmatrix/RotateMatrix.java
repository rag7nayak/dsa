package org.example.mathandmatrix;

import java.util.Arrays;

public class RotateMatrix {

    public void rotate(int[][] matrix){
        int n= matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp= matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        for (int row = 0; row < n; row++) {
            int left=0,right=n-1;
            while (left<right){
                int temp= matrix[row][right];
                matrix[row][right]=matrix[row][left];
                matrix[row][left]=temp;
                left++;
                right--;
            }
        }
    }

    // Helper to print matrix
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();
    }

    // 🔹 Test cases
    public static void main(String[] args) {
        RotateMatrix obj = new RotateMatrix();

        int[][] m1 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        obj.rotate(m1);
        System.out.println("Rotated 3x3:");
        printMatrix(m1);
        // Expected:
        // [7,4,1]
        // [8,5,2]
        // [9,6,3]

        int[][] m2 = {
                {5,1},
                {2,4}
        };
        obj.rotate(m2);
        System.out.println("Rotated 2x2:");
        printMatrix(m2);
        // Expected:
        // [2,5]
        // [4,1]
    }
}
