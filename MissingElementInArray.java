package week1.day2.assignments;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 7, 6, 8 }; // Initializing an Array

		int len = arr.length; // Find Length of an Array

		System.out.println("Length of an Array is : " + len);

		Arrays.sort(arr); // Sort the array

		for (int i = 1; i < arr.length; i++) { // loop through the array (start i from arr[0] till the length of the
												// array)

			for (int j = arr[i - 1] + 1; j <= arr[i] - 1; j++) { // check if the iterator variable is not equal to the
																	// array values respectively

				System.out.println("Missing Element in Array is : " + j); // print the number
			}

		}
	}
}
