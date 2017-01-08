import java.util.Scanner;

/**
 * Converts centimeters to feet and inches
 * @author qmtru
 *
 */

public class InToCm32 {
	public static void main(String[] args) {
		int inches, feet, remainder;
		double cm;
		final double CM_PER_IN = 2.54;
		final int INCH_PER_FT = 12;
		Scanner in = new Scanner(System.in);
		
		//prompt user to get the value
		System.out.println("How many cm?");
		cm = in.nextDouble();
		
		//convert and output result
		inches = (int) (cm / CM_PER_IN);
		feet = inches / INCH_PER_FT;
		System.out.print(feet);
		
	}
}

