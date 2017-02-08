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

		System.out.println("Sphere Data: ");
		displaySphere();
		System.out.println();

		System.out.println("Cone Data: ");
		displayCone();
		System.out.println();
	}

	//Display the volume and surface area of a rectangular solid
	public static void displayRectangularSolid() {
		double surfaceArea, length, width, height, volume;
		length = 10.5;
		width = 6.0;
		height = 4.5;

		volume = length * width * height;
		surfaceArea = (2 * length * height) + (2 * height * width) + (2 * length * width);
		System.out.println("Volume = " + volume);
		System.out.println("Surface Area = " + surfaceArea);
	}

	//Display the volume and surface area of a cylinder
	public static void displayCylinder() {
		double surfaceArea, radius, height, volume;
		radius = 9.0;
		height = 7.4;
		volume = Math.PI * Math.pow(radius, 2) * height;
		surfaceArea = (2 * Math.PI * radius * height) + (2 * Math.PI * Math.pow(radius, 2));

		System.out.println("Volume = " + volume);
		System.out.println("Surface Area = " + surfaceArea);
	
	}

	//Display the volume and surface area of a sphere
	public static void displaySphere() {
		double surfaceArea, radius, volume;
		radius = 14.7;
		volume = ((4 / 3.0) * Math.PI * Math.pow(radius, 3));
		surfaceArea = ((4) * Math.PI * Math.pow(radius, 2));

		System.out.println("Volume = " + volume);
		System.out.println("Surface Area = " + surfaceArea);
	}

	//Display the volume and surface area of a cone
	public static void displayCone() {

		double side, height, radius, volume, surfaceArea;
		height = 19.1;
		radius = 8.3;
		volume = (1 / 3.) * Math.PI * Math.pow(radius, 2) * height;
		side = Math.sqrt((height * height) + Math.pow(radius, 2));
		surfaceArea = (side * Math.PI * radius) + (Math.PI * Math.pow(radius, 2));

		System.out.println("Volume = " + volume);
		System.out.println("Surface Area = " + surfaceArea);
	}

}
