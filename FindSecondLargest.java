package week1.day2.assignments;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = { 3, 2, 11, 4, 6, 7 };
		int len = data.length;
		System.out.println("Length of the given Array is : " + len);
		Arrays.sort(data);
		// Display the array
		System.out.println("Sorted Array : ");
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
		// Choose the second largest number using the appropriate index
		System.out.println("*************");
		System.out.println("The second largest element is : " + data[len - 2]);

	}

}
