/**
 * Programmer: Quan Truong 			CSC110AB <12 PM - 12:50 PM>
 * Assignment: Lab03				Due: Feb. 6, 2017
 * 
 * This program displays the volume and surface area of the 
 * following geometric objects: rectangular solid, a cylinder, a sphere, and a cone.
 *
 */

public class Lab03 {

	public static void main(String[] args) {
		System.out.println("Rectangular Solid Data: ");
		displayRectangularSolid();
		System.out.println();

		System.out.println("Cylinder Data: ");
		displayCylinder();
		System.out.println();

		System.out.println("Display Sphere Data: ");
		displaySphere();
		System.out.println();

		System.out.println("Display Cone Data: ");
		displayCone();
		System.out.println();

	}

	//Displays the volume and surface area of a rectangular solid
	public static void displayRectangularSolid() {
		double length, width, height, volume, surfaceArea;
		length = 10.5;
		width = 6.0;
		height = 4.5;

		volume = length * width * height;
		surfaceArea = (2 * length * height) + (2 * height * width) + (2 * length * width);
		System.out.println("Volume: ");
		System.out.println(volume);
		System.out.println("Surface area: ");
		System.out.println(surfaceArea);

	}

	//Displays the volume and surface area of a cylinder
	public static void displayCylinder() {
		double radius, height, volume, surfaceArea;

		radius = 9.0;
		height = 7.4;

		volume = Math.PI * Math.pow(radius, 2) * height;
		surfaceArea = (2 * Math.PI * radius * height) + (2 * Math.PI * Math.pow(radius, 2));

		System.out.println("Volume: ");
		System.out.println(volume);
		System.out.println("Surface Area: ");
		System.out.println(surfaceArea);

	}

	//Displays the volume and surface area of a sphere
	public static void displaySphere() {
		double radius, volume, surfaceArea;
		radius = 14.7;
		volume = ((4 / 3.0) * Math.PI * Math.pow(radius, 3));
		surfaceArea = ((4) * Math.PI * Math.pow(radius, 2));

		System.out.println("Volume: ");
		System.out.println(volume);

		System.out.println("Surface Area: ");
		System.out.println(surfaceArea);
	}

	//Displays the volume and surface area of a cone
	public static void displayCone() {

		double height, radius, volume, surfaceArea, side;
		height = 19.1;
		radius = 8.3;
		volume = (1 / 3.) * Math.PI * Math.pow(radius, 2) * height;
		side = Math.sqrt((height * height) + (radius * radius));
		surfaceArea = (side * Math.PI * radius) + (Math.PI * Math.pow(radius, 2));

		System.out.println("Volume: ");
		System.out.println(volume);
		
		System.out.println("Surface Area: ");
		System.out.println(surfaceArea);

	}

}
