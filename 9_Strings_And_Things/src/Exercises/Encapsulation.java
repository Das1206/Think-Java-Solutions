package Exercises;


/**
 * Exercise 9-3 Think Java 2016.
 * @author quanxh
 *
 */
public class Encapsulation {

	public static void main(String[] args) {

		String s = "((3+7)*2)";
		String name = "Quan Minh Truong";
		
		
		System.out.println(openAndClose(name, 'Q', 'g'));
		openAndClose(s, '(', ')');

	}
	
	
	/**
	 * Made to ensure that a string has opening and closing parantheses.
	 * @param s
	 * 			The string
	 * @param open
	 * 				Opening char literal
	 * @param close
	 * 				Closing char literal
	 * @return
	 * 			Return the count. Return should be 0 if opening and closing parentheses are equally found in s
	 */
	public static int openAndClose(String s, char open, char close) {
		
		int count = 0;
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if (c == open) {
				count++;
			} else if (c == close) {
				count--;
			}
		}
		
		return count;
	}

}
