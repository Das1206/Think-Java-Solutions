/**
 * Exercise 2-3 #5 Calculate and display the percentage of the day that has passed. You might run 
 * into problems when computing percentages with integers, so consider using floating-point.
 * 
 * @author quan
 *
 */


public class percentageOfDayPassed {
	public static void main(String[] args) {
	percentageOfDayPassed(13, 0, 0);

	}
	
	/**
	 * Returns the percentage of the day that has passed. Takes hours in 24-hour format.
	 * 
	 * @param hour
	 * 				Insert the current hour in 24-hour format (2 PM is 14).
	 * @param minute
	 * 				Minutes of the day.
	 * @param seconds
	 * 				Insert the current number of seconds passed in the current minute.
	 * @return
	 * 			Returns the percentage of the day passed.
	 */
	public static double percentageOfDayPassed(double hour, double minute, double seconds) {
		
		double percentagePassed, totalSecsInDay;
		
		//Calculate the total amount of seconds in the day
		totalSecsInDay = (24 * 60 * 60);
		//Divides total amt of seconds passed in day and divides it by total seconds in day to return a percentage
		percentagePassed = ( ((hour * 60 * 60) + (minute * 60)) / totalSecsInDay);
		//Formats the percentage to 2 decimal points and displays percent of day passed to screen
		System.out.printf("%.2f%% of the day has passed", percentagePassed);
		
		return percentagePassed;	
		
	}

}
