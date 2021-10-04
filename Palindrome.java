package week1.day2.assignments;

public class Palindrome {

	public static void main(String[] args) {
		String str = "madam"; // Declare A String value as"madam"
		String reverse = ""; // Declare another String rev value as ""

		int strLength = str.length();

		for (int i = (strLength - 1); i >= 0; i--) { // Iterate over the String in reverse order
			reverse = reverse + str.charAt(i); // Add the char into rev
		}

		if (str.toLowerCase().equals(reverse.toLowerCase())) { // Compare the original String with the reversed String,
																// if it is same then print palinDrome
			System.out.println(str + " is a Palindrome");
		} else {
			System.out.println(str + " is not a Palindrome");
		}
	}

}
