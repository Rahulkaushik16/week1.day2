package week1.day2.assignments;

public class CharOccurence {

	public static void main(String[] args) {
		String str = "Welcome to Chennai";
		int count = 0; // declare and initialize a variable count to store the number of occurrences
		char[] charArray = str.toCharArray(); // convert the string into char array
		for (int i = 0; i < charArray.length; i++) { // traverse from 0 till the array length
			if (charArray[i] == 'e') { // Check the char array has the particular char in it
				count++; // if is has increment the count
				// count=count+1;
			}

		}
		System.out.println(count); // print the count out of the loop
	}

}
