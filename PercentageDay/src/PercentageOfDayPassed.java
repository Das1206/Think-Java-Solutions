
public class PercentageOfDayPassed {

//Calculates the percentage of Day that has passed. Current time set to noon.
	public static void main(String[] args) {
			double hour, minute, second;
			hour = 2;
			minute = 0;
			second = 0;
			double totalSecondsInDay = (24 * 60 * 60);
			double fromMidnight = ( (hour * 60) * 60 ) + (minute * 60) + second; 
			double timePassed = (fromMidnight/totalSecondsInDay);
			System.out.printf("%.3f%% of the day has passed", timePassed);
			
		}
	
}


