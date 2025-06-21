package com.bss.j8p.matrix;

public class Toeplitz {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 1, 2, 3 }, { 9, 5, 1, 2 } };
		System.out.println(isToeplitzMatrix(matrix));
	}

	private static char[] isToeplitzMatrix(int[][] matrix) {
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
			return new char[] { 'F' }; // False
		}

		int rows = matrix.length;
		int cols = matrix[0].length;

		for (int i = 0; i < rows - 1; i++) {
			for (int j = 0; j < cols - 1; j++) {
				if (matrix[i][j] != matrix[i + 1][j + 1]) {
					return new char[] { 'F' }; // False
				}
			}
		}

		return new char[] { 'T' }; // True
	}

}
