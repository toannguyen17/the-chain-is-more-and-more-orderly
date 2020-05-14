package app;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		// Prompt the user to enter a string
		System.out.print("Enter a string: ");
		String string = input.nextLine();
		String temp  = "";

		String check = String.valueOf(string.charAt(0));
		temp += check;

		for (int i = 1; i < string.length(); i++){
			char value        = string.charAt(i);
			String stringChar = String.valueOf(value);

			if (check.compareTo(stringChar) < 0)
				temp += stringChar;
			else
				break;

			check = stringChar;
		}
		System.out.println(temp);
	}
	/*********************************************************************************
	 * 	Analyze the time complexity of your program:                                  *
	 * 	1 single loop * 5 simple statements = 5;                                      *
	 *                                                                                *
	 * 	T(n) = O(n) Linear time;                                                      *
	 *********************************************************************************/
}
