package com.matrix.programs;

public class DiagnolMatrix {

	static void printMatrixDiagnal(int[][] arr, int row, int col) {
		int m, n;
		for (m = 0; m < row; m++) {
			int i = m, j = 0;
			while (i >= 0 && j < col) {
				System.out.print(arr[i][j] + " ");
				i--;
				j++;
			}

			System.out.println("");
		}

		for (n = 1; n < col; n++) {
			int i = row - 1, j = n;
			while (j < col && i >= 0) {
				System.out.print(arr[i][j] + " ");
				i--;
				j++;
			}

			System.out.println("");
		}

	}

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4, 5, 6 }, { 7, 8, 9, 10, 11, 12 }, { 13, 14, 15, 16, 17, 18 } };

		printMatrixDiagnal(arr, arr.length, arr[0].length);

	}

}
