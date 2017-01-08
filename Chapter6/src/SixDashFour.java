/**
 * Exercise 6.5 in ThinkJava, 2016 version
 * The trick to solving this is recognizing the mathematical function used by multadd, which is a*b+c. 
 * Find which parts of each equation need to be assigned to each variable (a,b,c) in order to output the correct answer.
 * Helps to have a calculator handy.
 * @author qmtru
 *
 */
public class SixDashFour {

	public static void main(String[] args) {
		
		//Calculate Sine(PI/4) + cos(pi/4)/2 using multadd. Used (1/2) as b1 in order to create a common denominator. Correct solution.
		double a1 = Math.cos(Math.PI/4.0);
		double b1 = 1.0/2.0;
		double c1 = Math.sin(Math.PI/4.0);
		System.out.print("sin(pi/4) + cos(pi/4)/2 = ");
		double result1 = multadd (a1, b1, c1);
		System.out.println(result1); 
		
		//Find natural log. Note: Math.log is for natural log, and not common log (which is base 10). 
		//I suggest reading documentation on any mathematical functions moving forward. Solution below is correct.
		double a2 = 1.0;
		double b2 = Math.log(10);
		double c2 = Math.log(20);
		double result2 = multadd(a2,b2,c2);
		System.out.println("Natural log 10 + Natural log 20 = " + result2);
		
		System.out.println(expSum(5));
	}
	
	public static double multadd(double a, double b, double c) {
		double result = a * b + c;
		return result;
	}
	
	
	//This is an equation that uses Euler's number. Note: Math.exp is used to raise Euler's number to an exponent. 
	public static double expSum(double x) {
		double a = x;
		double b = Math.exp(-x);
		double c = Math.sqrt(1.0 - b);
		double result = multadd(a, b, c);
		return result;
	}
	
	

}
