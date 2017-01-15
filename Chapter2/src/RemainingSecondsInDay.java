/**
 * Exercise 2-3.3 of Think Java, 2016.
 * 
 * 3. Make the program calculate and display the number of seconds since midnight.
 * 
 *
 * @author Quan Truong
 *
 */


public class RemainingSecondsInDay {

	public static void main(String[] args) {
			int hour, minute, second, to24Hour;
			hour = 14;
			minute = 34;
			second = 50;
			
			//Part 2 asks to convert 24 hours time (indicated by 14 above which means 2 pm) to 12 hour time. 
			//This can be accomplished using a modulo, which divides by 12 and returns the remainder. 14 % 12 = 2, hence the result is 2 (PM)
			to24Hour = hour % 12;
			
			System.out.println("14 % 12 = " + to24Hour + ". This represents 2 P.M.");
			
			
			//Take the the total seconds of the day minus the time until midnight and you get the remaining seconds in the day!
			int totalSecsOfDay = (24 * 60 * 60);
			int fromMidnight = ( (hour * 60) * 60 ) + (minute * 60) + second; 
			System.out.println(totalSecsOfDay - fromMidnight);
			
		}

}

