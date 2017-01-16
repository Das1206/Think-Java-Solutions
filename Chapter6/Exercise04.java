/**
 * Exercise 5-4 of Think Java, 2016.
 *
 * @author Quan Truong
 *
 */
public class Exercise04 {

	public static void main(String[] args) {

	//Write a main method that tests multadd by invoking it with a few simple parameters, like 1.0, 2.0, 3.0.
	multadd(1.0,2.0,3.0);
	
	
	
	//use multadd to calculate the following equation: sin(PI/4) + cos(PI/4)/2
	double a1 = Math.sin(Math.PI/4);
	//use 1.0/2.0 to create the dividend of 2
	double a2 = 1.0/2.0;
	double a3 = Math.cos(Math.PI/4);
	System.out.println(multadd(a1, a2, a3));
	
	
	//test expSum
	expSum(3);
	}
	
	/**
	 * 2. Write a method called multadd that takes three double parameters and that returns a * b + c
	 * @param a
	 * 			Double value.
	 * @param b
	 * 			Double value.
	 * @param c
	 * 			Double value.
	 * @return
	 * 			Double value, the sum of a * b + c
	 */
	public static double multadd(double a, double b, double c) {
		
		return a * b + c;
	}
	
	/**
	 * 5. Write a method called expSum that takes a double as a parameter and that uses multadd to calculate : x( (e)^(-x) ) + (1-e)^(1/2)
	 * 
	 * @param x 
	 * 			Double value.
	 * @return
	 * 			Double value. 
	 */
	public static double expSum(double x) {
		double a1 = x;
		double a2 = Math.exp(-x);
		double a3 = Math.sqrt(1 - a2);
		double ans = multadd(a1, a2, a3);
		System.out.println(ans);
		return ans;
	}

}
