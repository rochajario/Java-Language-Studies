package exercises;

/*
 * 6- Write a program that asks for the radius of a circle, calculates and displays its area.
 */

public class Exercise06 {
	static final double PI = 3.14d;
	
	public static double getCircleArea(double radius) {
		return PI * Math.pow(radius, 2);
	}
}
