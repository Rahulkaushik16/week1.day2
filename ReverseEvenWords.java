package week1.day2.assignments;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test = "I am a software tester     "; // Declare the input as Follow
		String[] test1 = test.split(" "); // split the words and have it in an array

		StringBuilder result = new StringBuilder();
		for (int i = 0; i < test1.length; i++) { // Traverse through each word (using loop)
			if (i % 2 != 0) { // find the odd index within the loop (use mod operator)
				char[] word = test1[i].toCharArray();
				String reverseWord = "";
				for (int j = word.length; j > 0; j--) { // print the even position words in reverse order using another
														// loop (nested loop)
					reverseWord += String.valueOf(word[j - 1]);
				}
				result.append(reverseWord).append(" ");
			} else {
				result.append(test1[i]).append(" ");
			}
		}

		System.out.println(result.toString().trim()); // Convert words to character array if the position is even else
														// print the word as it is(concatenate space at the end)
	}
}
