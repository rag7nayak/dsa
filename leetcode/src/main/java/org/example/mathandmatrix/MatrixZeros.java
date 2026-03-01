package org.example.mathandmatrix;

import java.util.Arrays;

public class MatrixZeros {

    public void  setZeros(int[][] matrix){
        boolean cZero=false,rZero=false;
        int m= matrix.length,n= matrix[0].length;

        for (int i = 0; i < n; i++) {
          if(matrix[0][i]==0){
              rZero=true;
          }
        }
        for (int i = 0; i < m; i++) {
                if(matrix[i][0]==0){
                    cZero=true;
                }
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }

        if(rZero){
            for (int j = 0; j < n; j++) {
                matrix[0][j]=0;
            }
        }
        if (cZero){
            for (int i = 0; i < m; i++) {
                matrix[i][0]=0;
            }
        }
    }

    // 🔹 Helper to print matrix
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MatrixZeros obj = new MatrixZeros();

        int[][] m1 = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };
        obj.setZeros(m1);
        System.out.println("Test Case 1:");
        printMatrix(m1);
        // Expected:
        // [1,0,1]
        // [0,0,0]
        // [1,0,1]

        int[][] m2 = {
                {0, 1, 2, 0},
                {3, 4, 5, 2},
                {1, 3, 1, 5}
        };
        obj.setZeros(m2);
        System.out.println("Test Case 2:");
        printMatrix(m2);
        // Expected:
        // [0,0,0,0]
        // [0,4,5,0]
        // [0,3,1,0]

        int[][] m3 = {
                {1, 2},
                {3, 4}
        };
        obj.setZeros(m3);
        System.out.println("Test Case 3:");
        printMatrix(m3);
        // Expected:
        // [1,2]
        // [3,4] (no zeros, unchanged)

        int[][] m4 = {
                {0}
        };
        obj.setZeros(m4);
        System.out.println("Test Case 4:");
        printMatrix(m4);
        // Expected:
        // [0]
    }
}

