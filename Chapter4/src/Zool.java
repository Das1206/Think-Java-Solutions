/**
 * Exercise 4-2 of Think Java, 2016.
 * 
 * @author Quan Truong
 *
 */
public class Zool {

	/**
	 * Write a string that takes 3 parameters: An int, and 2 Strings.
	 * 
	 * @param n
	 * 			The int
	 * @param s
	 * 			Your first dog's name
	 * @param t
	 * 			The street you grew up on
	 */
	public static void zool(int n, String s, String t) {
		System.out.println(n);
		System.out.println(s);
		System.out.println(t);
	}
	
	public static void main(String[] args){
		zool(11, "Monty Python", "Secret Street");
		System.err.println("This is an error");
		
	}
}

