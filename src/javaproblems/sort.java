package javaproblems;

public class sort {

	public static Integer binarySearch(int[] arr, int value) {
		Integer result = null;
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == value) {
				return value;
			} else if (arr[mid] < value) {
				low = mid + 1;
			} else if (arr[mid] > value) {
				high = mid - 1;
			}
		}

		return null;

	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int value = 10;
		Integer result = binarySearch(arr, value);
		if (result == null) {
			System.out.println("not exist");
		} else {
			System.out.println("exist");
		}
	}

}
