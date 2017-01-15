
public class RemainingSecondsInDay {
	public static void main(String[] args) {
			double hour, minute, second;
			hour = 12;
			minute = 0;
			second = 0;
			double tilMidnight = (24 * 60 * 60);
			double fromMidnight = ( (hour * 60) * 60 ) + (minute * 60) + second; 
			System.out.println(tilMidnight - fromMidnight);
			
		}

}

