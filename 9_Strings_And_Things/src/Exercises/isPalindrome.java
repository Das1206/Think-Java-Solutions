package Exercises;

public class isPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "xy";

		System.out.println(isPal(name));

		char[] guess = name.toCharArray();

		System.out.println(guess.length - 1);

		System.out.println(isPalindrome(guess));

	}

	/**
	 * Write a recursive method to check for a palindrome
	 */

	public static boolean isPal(String s) {
		// if it's 1 or 2 letters, return true.
		if (s.length() == 0 || s.length() == 1) {
			return true;
		}
		
		
		
		//s.charAt(s.length() -1 ) is used for last letter of char[] 

		
		
		// if the first letter is equal to the last, then perform recursion to shrink and check rest of string 1 char at a time
		if (s.charAt(0) == s.charAt(s.length() - 1)) {
			return isPal(s.substring(1, s.length() - 1));
		}

		return false;
	}

	/**
	 * Method is not recursive. It's not calling itself.
	 * 
	 * @param s
	 * @return
	 */
	public static boolean isPalindrome(char[] s) {
		// counter that moves upwards
		int up = 0;
		// counter that moves downwards
		int down = s.length - 1;

		while (up > down) {
			if (s[up] != s[down]) {
				return false;
			}
			++up;
			--down;

		}
		return true;

	}

}
