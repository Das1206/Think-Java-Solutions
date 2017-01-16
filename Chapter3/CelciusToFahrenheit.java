/**
 * Exercise 3-2 of Think Java, 2016.
 * 
 * Convert a temperature in Celsius to Fahrenheit. 
 * @author Quan Truong
 *
 */

import java.util.*;

public class CelciusToFahrenheit {

	public static void main(String[] args) {
		double celsius, celsiusTofahrenheit;
		
		Scanner in = new Scanner(System.in);
		//Ask for user input
		System.out.println("Enter celsius to be converted to fahrenheit: ");
		celsius = in.nextDouble();
		
		//Convert celsius to fahrenheit
		celsiusTofahrenheit =  celsius * 9d/5d + 32; //d after the fraction forces compiler to see the number as doubles
		
		//Print to screen
		System.out.println(celsiusTofahrenheit);
		
		
		
		
		
	}
	
	

}
