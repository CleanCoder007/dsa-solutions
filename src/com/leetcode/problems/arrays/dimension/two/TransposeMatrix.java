package com.leetcode.problems.arrays.dimension.two;

import com.utils.DataPrinter;

/*
* https://leetcode.com/problems/transpose-matrix/description/
*Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
*Output: [[1,4,7],[2,5,8],[3,6,9]]
* Given a 2D integer array matrix, return the transpose of matrix
* */
public class TransposeMatrix {

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] transposedMatrix = sol.transpose(matrix);
        DataPrinter.printTwoDimensionalArray(matrix);
        DataPrinter.printTwoDimensionalArray(transposedMatrix);
    }
}

class Solution {
    public int[][] transpose(int[][] matrix) {

        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] output = new int[columns][rows] ;

        for(int i = 0; i < rows ; i++) {
            for(int j = 0; j < columns; j ++){
                output[j][i] = matrix[i][j];
            }
        }
        return output;
    }
}
