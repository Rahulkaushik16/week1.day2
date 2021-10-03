package week1.day2.assignments;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };
		int len = arr.length; // get the length of the array
		System.out.println("Length of the given Array is : " + len);
		int count = 0; // declare an int variable named count
		System.out.println("****************");
		System.out.println("Total Number of Duplicates found in an Array : ");
		// Searches for duplicate element
		for (int i = 0; i < arr.length - 1; i++) { // iterate from 0 to the array length-1 (outer loop starts here)
			for (int j = i + 1; j < arr.length; j++) { // iterate from i to the length of the array by adding 1 to it
														// (inner loop
														// starts here)
				if (arr[i] == arr[j]) { // compare both the loop variables & check they're equal
					count++; // increase the count if both the arrays are equal
					break;
				}

			}

		}
		System.out.println(count); // Out of the inner loop, check and print the first array variable if count is
									// more than 0

		System.out.println("*****************");

		System.out.println("Duplicate elements in given array: ");
		// Print the duplicate elements
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[j]);
				}

			}
		}
	}
}
