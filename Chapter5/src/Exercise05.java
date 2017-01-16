/**
 * Exercise 5-5 of Think Java, 2016.
 * 
 * @author Quan Truong
 *
 */
public class Exercise05 {

	/**
	 * Method below uses recursion to keep calling itself until a condition is
	 * met. In this case, when n == 0 (no more bottles of beer on the wall) the recursion stops.
	 * 
	 * @author Quan Truong
	 *
	 */
	
	public static void countdown(int n) {
		if (n == 0) {
			System.out.println("No bottles of beer on the wall!");
		} else {
			System.out.println(n + " bottles of beer on the wall");

			// calls itself again here
			countdown(n - 1);
		}
	}

	public static void main(String[] args) {
		countdown(100);
	}
}
