package week1.day2.assignments;

public class FindTypes {

	public static void main(String[] args) {
		// Here is the input
		String test = "$$ Welcome to 2nd Class of Automation $$ ";

		// Here is what the count you need to find
		int letter = 0, space = 0, num = 0, specialChar = 0;

		char[] charArray = test.toCharArray(); // Convert the String to character array

		for (int i = 0; i < charArray.length; i++) { // Traverse through each character (using loop)
			char ch = test.charAt(i);
			if (Character.isLetter(ch)) { // Character.isLetter
				letter++;
			} else if (Character.isDigit(ch)) { // Character.isDigit
				num++;
			} else if (Character.isSpaceChar(ch)) { // Character.isSpaceChar
				space++;
			} else { // else -> consider as special character
				specialChar++;
			}

		}
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);

	}
}
