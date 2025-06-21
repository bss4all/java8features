package com.bss.j8p.matrix;

public class MatrixAddition {

	public static void main(String[] args) {
		// addtion of two matrices
		int[][] matrix1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] matrix2 = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };
		int[][] result = addMatrices(matrix1, matrix2);
		System.out.println("Result of Matrix Addition:");
		for (int[] row : result) {
			for (int value : row) {
				System.out.print(value + " ");
			}
			System.out.println();
		}
		

	}

	private static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
		//print length of the matrices
		System.out.println("Matrix 1 Dimensions: " + matrix1.length + "x" + matrix1[0].length);
		System.out.println("Matrix 2 Dimensions: " + matrix2.length + "x" + matrix2[0].length);
		// Check if matrices are compatible for addition
		if (matrix1.length == 0 || matrix2.length == 0 || matrix1[0].length != matrix2[0].length) {
			throw new IllegalArgumentException("Matrices must have the same dimensions for addition.");
		}

		int rows = matrix1.length;
		int cols = matrix1[0].length;
		int[][] result = new int[rows][cols];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				result[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		return result;
	}

}
