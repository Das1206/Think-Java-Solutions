/**
 * Exercise 2-3.4 of Think Java, 2016.
 * 
 * @author Quan Truong
 *
 */

/**
 * 3. Make the program calculate and display the number of seconds since midnight.
 * 
 * Simply take the total amount of time passed today, convert it to seconds with the calculation below, and you have your answer!
 */

public class SecondsSinceMidnight {
	
	public static void main(String[] args) {
		int hour, minute, second, timePassedSinceMidnight;
		hour = 14;
		minute = 0;
		second = 0;
		
		//converts the total amount of time passed to seconds
		timePassedSinceMidnight = ( (hour * 60) * 60 ) + (minute * 60) + second; 
		System.out.println(timePassedSinceMidnight);
		
	}

}
