/**
 * Find area of a circle. Use functional decomposition to break large task into several simple methods.
 * @author qmtru
 *
 */
public class CircleAreaAllTogether {

	public static double distance(double x1, double y1, double x2, double y2) {
		//Calculate the distance between two points (radius)
		double dx = x2 - x1;
		double dy = y2 - y1;
		double dsquared = (dx * dx) + (dy * dy);
		double result = Math.sqrt(dsquared);
		return result;
	}
	
	//Note: Overloaded method. calculateArea already exists.
	public static double calculateArea(double radius){
		//Find the area of the circle
		return Math.PI * (radius * radius);
	}
	//Note: Overloaded method. calculateArea already exists.
	public static double calculateArea(double xb, double yb, double xc, double yc) {
		return calculateArea(distance(xb, yb, xc, yc));
	}
	public static void main(String[] args) {
		double areaOfCircle = calculateArea(1.0,2.0,4.0,6.0);
		System.out.println("The area of the circle is " + areaOfCircle);

	}

}
