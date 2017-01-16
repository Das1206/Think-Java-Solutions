
/**
 * Exercise 6-6 of Think Java, 2016.
 * 
 * 1. Draw a stack diagram showing the state of the program just before the last invocation of prod completes.
 * 
 * Note: Hey, stack diagrams might be a bit difficult to draw by hand. 
 * You can do it with a computer (don't you just love technology?)! 
 * If you're using the Eclipse IDE, you can set a breakpoint! 
 * Follow these instructions: stackoverflow.com/questions/4733835/how-to-use-breakpoints-in-eclipse
 * 
 * 2. What is the output of this program?
 *  24
 *  
 *  3. Explain in a few words what prod does (without getting into the details of how it works).
 *  
 *  Subtracts one from n until m == n
 *  
 *  
 *  4. Rewrite prod without the temporary variable recurse and result. Hint: You need only one line for the else branch.
 *  
 * @author Quan Truong
 *
 */
public class Exercise06 {

	public static void main(String[] args) {
	System.out.println(prod(1, 4));	

	}
	
	public static int prod(int m, int n) {
		if (m == n) {
			return n;
		} else { 
			
			int recurse = prod(m, n-1);
			int result = n * recurse;
			return result;
			
			//4. Reduce else statement to one line
			//return n * prod(m, n-1);  
		}
	}
	

}
