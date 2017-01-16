/**
 * Exercise 5-4 of Think Java, 2016. 
 * 
 * Note: To all you math heads, Fermat was notoroiously wrong in his proof.
 * 
 * @author Quan Truong
 *
 */
public class FermatsLastTheorem {

	public static void main(String[] args) {
		
		checkFermat(4, 2, 3, 1);
	}
	
	public static boolean checkFermat(int a, int b, int c, int n) {
		//if n is not equal to 2 and a^n+b^n = c^n 
		if ( n != 2 && ( (Math.pow(a, n)) + Math.pow(b, n) ) == Math.pow(c, n)) {
			System.out.println("Holy smokes, Fermat was wrong!");
			return false;
		} else {
			System.out.println("Fermat was right!");
			return true;
		}

		
		
	}

}
