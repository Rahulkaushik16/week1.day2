package week1.day2.assignments;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String test = "changeme"; // Declare String Input
		StringBuffer updatedString = new StringBuffer();

		char[] character = test.toCharArray(); // Convert the String to character array

		for (int i = 0; i < character.length; i++) { // Traverse through each character (using loop)
			char c = character[i];
			if (i % 2 != 0) { // find the odd index within the loop (use mod operator)
				c = Character.toUpperCase(c);
			}
			updatedString.append(c);
		}

		System.out.println("Modified string is: " + updatedString.toString()); // within the loop, change the character
																				// to uppercase, if the index is odd
																				// else don't change
	}

}
