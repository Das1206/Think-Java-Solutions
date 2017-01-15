package Exercises;

public class untitled {

	public static boolean isAbcdearian(String s) {
		int index = 0;
		char c = 'a';
		while (index < s.length()) {
			if (c > s.charAt(index)) {
				return false;
			}

			c = s.charAt(index);
			index = index + 1;
		}
		return true;
	}

	public static void main(String[] args) {
		String s = "abcdefg";

		System.out.println(isAbcdearian(s));
	}
}