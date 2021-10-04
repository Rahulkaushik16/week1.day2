package week1.day2.assignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String str1 = "stops"; // Declare a String
		String str2 = "potss"; // Declare another String

		if (str1.length() == str2.length()) { // Check length of the strings are same then (Use A Condition)

			char[] charArray1 = str1.toCharArray(); // convert strings to char array
			char[] charArray2 = str2.toCharArray();

			Arrays.sort(charArray1); // sort the char array
			Arrays.sort(charArray2);

			boolean result = Arrays.equals(charArray1, charArray2); // Check both the arrays has same value

			if (result) {
				System.out.println(str1 + " and " + str2 + " are anagram");
			} else {
				System.out.println(str1 + " and " + str2 + " are not anagram");
			}
		} else {
			System.out.println(str1 + " and " + str2 + " are not anagram");
		}
	}

}
