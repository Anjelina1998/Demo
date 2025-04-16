package javaproblems;

public class LIinearSearch {
	
	

	public static Integer linearsearching(int [] arr,int a) {
		Integer result =null;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == a) {
				result=a;
				break;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int arr[] = { 12, 23, 13, 56, 45, 46 };

		
		
		Integer result=linearsearching(arr,32);
		if(result==null) {
			System.out.println("not present");
			
		}
		else {
			System.out.println("present");
		}

	}

}
