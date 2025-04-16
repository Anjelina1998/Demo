package javaproblems;

import java.util.Arrays;

public class Bubblesort {
	public static void arraySorting(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			boolean swap=true;
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int c = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = c;
				}
				swap=false;
			}
			if(swap=false) {
				return;
			}
		}
		
	}

	public static void main(String[] args) {
		int[] arr = { 2, 4, 6, 3, 5 };
		 arraySorting(arr);
		 System.out.println(Arrays.toString(arr));
	}

}
