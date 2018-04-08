package com.array.programs;

public class LeftRotateArray {

	private static int[] approachOne(int arr[], int d, int size) {
		int temp_arry[] = new int[size];

		for (int i = 0; i < d; i++) {
			temp_arry[size - d + i] = arr[i];
		}

		for (int j = d; j < size; j++) {
			temp_arry[j - d] = arr[j];
		}

		return temp_arry;
	}
	
	private static int[] approachTwo(int arr[], int d, int size) {
		int temp_arry[] = new int[size];

		System.arraycopy(arr, 0, temp_arry, size-d, d);
		System.arraycopy(arr, d, temp_arry, 0, size-d);
		
		return temp_arry;
	}

	public static void main(String[] args) {

		int arr[] = new int[5];
		for (int i = 0; i < 5; i++)
			arr[i] = i;

		arr = approachOne(arr, 3, 5);

		for (int i = 0; i < 5; i++)
			System.out.print(arr[i] + " ");
		
		System.out.println();
		
		arr = approachTwo(arr, 3, 5);
		
		for (int i = 0; i < 5; i++)
			System.out.print(arr[i] + " ");

	}

}
