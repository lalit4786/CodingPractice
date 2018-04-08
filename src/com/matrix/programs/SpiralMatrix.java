package com.matrix.programs;

public class SpiralMatrix {
	
	static void printMatrixSpiral(int[][] arr, int row, int col) {
		int k, i = 0, j = 0;

		while (i < row && j < col) {
			for (k = j; k < col; k++)
				System.out.print(arr[i][k] + " ");

			i++;

			for (k = i; k < row; k++)
				System.out.print(arr[k][col - 1] + " ");

			col--;

			if (i < row) {
				for (k = col - 1; k >= j; k--)
					System.out.print(arr[row - 1][k] + " ");
				row--;
			}

			if (j < col) {
				for (k = row - 1; k >= i; k--)
					System.out.print(arr[k][j] + " ");
			}

			j++;
		}
	}

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4, 5, 6 }, { 7, 8, 9, 10, 11, 12 }, { 13, 14, 15, 16, 17, 18 } };

		
		printMatrixSpiral(arr,arr.length,arr[0].length);
	}

}
