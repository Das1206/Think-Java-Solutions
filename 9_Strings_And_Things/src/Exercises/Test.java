package Exercises;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {

		String alphabet = "ajsdaooiqweiojqwoiej";
		// 99
		char a = 'a';
		// 98
		char b = 'b';
		// 97
		char c = 'c';

		System.out.println(Arrays.toString(letterHist(alphabet)));

	}

	public static int[] letterHist1(String x) {
		int[] hist = new int[26];

		for (int i = 0; i < x.length(); i++) {
			char curChar = x.toLowerCase().charAt(i);

			//is there an easier way of checking from a to z?
			if ('a' <= curChar && curChar <= 'z') {
				hist[curChar - 'a']++;
			}
		}

		return hist;
	}

	public static int[] letterHist(String s) {
		int[] hist = new int[26];

		for (int i = 0; i < s.length(); i++) {
			char curChar = s.toLowerCase().charAt(i);

			if ('a' <= curChar && curChar <= 'z') {
				// the char minus a will equal the proper index. for instance if
				// ('b' - 'a') it will equal 2.
				hist[curChar - 'a']++;
			}
		}

		return hist;
	}

}
