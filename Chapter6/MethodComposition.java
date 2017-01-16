
/**
 * Calculate the area of a circle.
 * Radius is two points between a circle.
 * Area is pi * radius * radius
 * @author qmtru
 *
 */

public class MethodComposition {
	
	public static void main(String[] args){
		circleArea(1.0, 2.0, 4.0, 6.0);
	}
	
	public static double circleArea(double xc, double yc, double xp, double yp) {
		double radius = WritingMethods.distance(xc, yc, xp, yp);
		double area = ReturnValues.calculateArea(radius);
		System.out.println("The area of the circle is: " + area);
		return area;
		
	}

}
