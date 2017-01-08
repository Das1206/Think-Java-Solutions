package Exercises;

/**
 * Page 128 THink Java 2016
 * @author Quan Truong
 */

import javax.swing.plaf.synth.SynthSeparatorUI;

import StringTraversal.StringTraversal;

public class Recurse {

	public static void main(String[] args) {
		String stringy = "Quan Minh";
		/*
		 * System.out.println(rest(stringy));
		 * 
		 * System.out.println(first(stringy));
		 * 
		 * System.out.println(middle(stringy));
		 * 
		 * System.out.println(length(stringy));
		 */
		
		//print a string
		printString(stringy);
		
		//print string backwards
		printBackwards(stringy);
		
		reverseString(stringy);

	}
	
	/**
	 * 5. reverseString 
	 * takes a string as a parameter and that returns a new string as a return value.
	 * The new string should contain the same letters as the parameter, but in reverse order.
	 * 
	 */

	public static String reverseString(String s) {
		char newString;

		 
		 for (int i = s.length() - 1; i >= 0; i--) {
			  newString = s.charAt(i);
			  System.out.print(newString);
		 }
		 
		 
		
		
		
		return s;
	}
	/**
	 * 4. Using only these methods, write a method called printBackward that does the same 
	 * thing as printString but that displays the string backward (again, one character per line).
	 */
	
	public static void printBackwards(String s) {
		for (int i = length(s) -1; i >= 0; i--) {
			char r = s.charAt(i);
			System.out.println(r);
		}
	}
	
	
	
	/**
	 * 3. Using only the below methods, create a method that will print every line of a string
	 * line-by-line.
	 * @param s
	 * 			The string to be printed.
	 */
	public static void printString(String s) {

		for (int i = 1; i <= length(s); i++) {
			for (char letter : s.toCharArray()) {
				System.out.println(letter);
				// increase i so that it runs out before this loop is done
				i++;
			}
		}

	}
	
	

	/**
	 * Returns the first character of the given string.
	 * 
	 * @param s
	 *            The string to be dissected of the first char
	 * @return The first char of the String s
	 */
	public static char first(String s) {
		return s.charAt(0);
	}

	/**
	 * Returns the rest of the string after the first index
	 * 
	 * @param s
	 *            The string
	 * @return The rest of the string after the first index
	 */
	public static String rest(String s) {
		return s.substring(1);
	}

	/**
	 * Returns the string starting from s[0] to s[s.length() -1 ]
	 * 
	 * @param s
	 * @return
	 */
	public static String middle(String s) {
		return s.substring(1, s.length() - 1);

	}

	/**
	 * Returns the length of the given String.
	 * 
	 * @param s
	 *            The string.
	 * @return Returns the length of the given string as an integer.
	 */
	public static int length(String s) {
		return s.length();
	}

}
