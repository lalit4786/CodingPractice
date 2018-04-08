package com.array.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayComplement {

	static String getRelativeComplement(Integer[] arr1, Integer[] arr2) {
		List<Integer> arr_l1 = new ArrayList<Integer>();
		List<Integer> arr_l2 = new ArrayList<Integer>();

		arr_l1.addAll(Arrays.asList(arr1));
		arr_l2.addAll(Arrays.asList(arr2));

		arr_l1.removeAll(arr_l2);

		return arr_l1.toString();
	}

	public static void main(String[] args) {
		Integer[] arr1 = { 3, 6, 10, 12, 15 };
		Integer[] arr2 = { 1, 3, 5, 10, 16 };

		System.out.println(getRelativeComplement(arr1, arr2));
	}

}
