
/**
 * Exercise 6-4 from Think Java, version 2016.
 * The purpose of this program is to pattern match the multadd method to properly calculate the two formulas given.
 * In the expSum program, you must use the multadd method to pass the function into expSum. 
 * 
 * I have numbered this program 1-5 to coordinate with the book's steps.
 * 
 * Note: For people learning Java, I would suggest looking into each math tool used in this book.
 * Math.exp() is used for Euler's number and not exponent.
 * Math.log() is used for Natural log, not common base-10 log, which is Math.log10.
 * @author Quan Truong
 *
 */
public class SixDashFour1 {
	//1. Create a new program called Multadd.java
	//2. Begin by creating the multadd method
	
	
	/** 
	 * The method takes 3 parameters. It multiples a times b and adds c.
	 * @param a A double value.
	 * @param b A double value.
	 * @param c A double value.
	 * @return Calculates a*b+c and returns a double value.
	 */
	public static double multadd(double a, double b, double c){
		return a*b+c;
	}
	
	

	
	public static void main(String[] args) {
		//3.Write a main method that tests multadd by invoking it with a few simple parameters, like 1.0, 2.0, 3.0.
		System.out.println(multadd(1.0,2.0,3.0)); //equals 5
		
		//4. Also in main, use multadd to compute the following values: Sin(PI/4) * 1 + ( Cos(PI/4)/2 )
		double a = Math.sin(Math.PI/4.0);
		double b = 1.0;
		double c = Math.cos(Math.PI/4.0)/2;
		//Print the result of the above equation
		System.out.println(multadd(a,b,c));

		//Note: Math.log is for natural log
		double log10 = Math.log(10);
		double log20 = Math.log(20);
		double timesOne = 1.0;
		//Use method composition to display the value of a*b + c, where a is log10, where b is timesOne, and c is log20
		System.out.println("Math.log(10) * 1.0 + Math.log(20) = " + multadd(log10,timesOne,log20));
		
		//Passing the value 5 into expSum
//		System.out.println("5 * (Math.exp(-5)) + Math.sqrt(1-Math.exp(-5)) = " + expSum(5) );
		
		System.out.println("We can then pass the above value into expSum by using the multadd method inside expSum like so: ");
		
		//Passing the value of multadd(log10,timesOne,log20) into expSum (the value is 5.298317366548037)
		System.out.println("expSum(multadd(log10,timesOne,log20) equals: "
				+ "" + expSum(multadd(log10, timesOne, log20)));	
	}
	
	public static double expSum(double x) {
		/**
		 * 5. Write a method called expSum that takes a double as a parameter and that uses multadd to calculate 
		 * The formula is:  x(e)^(-x) + ( ( (1-e^(-x) ) ^ (1/2) ) 
		 * 
		 * @param x is the value to be passed into expSum. Use expSum(multadd(a,b,c)) in main to pass a parameter inside.
		 * @return
		 */
		
		double a1, b2, c3;
		a1 = x;
		//The Math.exp is for Euler's function, not exponents.
		b2 = Math.exp(-x);
		c3 = Math.sqrt(1-b2);
		return multadd(a1,b2,c3);
	}
}
