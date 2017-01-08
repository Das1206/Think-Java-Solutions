
/**
 * Calculates the the distance between two points. 
 * @author qmtru
 *
 */

public class WritingMethods {

	public static void main(String[] args) {
		distance(1.0,2.0,4.0,6.0);
		System.out.println(Math.sqrt((3*3)+(4*4))) ;
	}
	
	/**
	 * The function of this problem is ((x2-x1)^(2)) + ((y2-y1)^(2))^(1/2)
	 * @param x1 second x distance
	 * @param y1 second y distance
	 * @param x2 first x distance
	 * @param y2 first y distance
	 * @return
	 */
	public static double distance(double x1, double y1, double x2, double y2) {
		double dx = x2-x1;
		double dy = y2-y1;
		double dsquared = (dx * dx) + (dy * dy);
		double result = Math.sqrt(dsquared);
		return result;
	}
}
