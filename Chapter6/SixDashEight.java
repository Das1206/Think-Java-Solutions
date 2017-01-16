
 /**
 * Write the Ackerman function in Java.
 * Note: Using big numbers will cause a stack overflow. 
 * Numbers used for testing: (3,5).
 * Check result on WolframAlpha using "ackerman(m,n)"
 * @author Quan Truong
 *
 */


public class SixDashEight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Ack(3,5));
	}
	
	/**
	 * 
	 * @param m first integer of Ackerman function
	 * @param n second integer of Ackerman function
	 * @return Integer value that represents the result of Ackerman's function.
	 */
	
	public static int Ack(int m, int n) {
		int ackValue = 0;
		if (m==0) {
			ackValue = n+1;
		} else if (m > 0 && n == 0) {
			ackValue = Ack(m-1,1);
		} else if (m >0 && n > 0) {
			ackValue = Ack(m-1, Ack(m, n-1));
		}
		return ackValue;
	}

}
