package exercises;

/*
 * 9- Make a Program that asks for the temperature in degrees Fahrenheit, 
 * 	  transforms it and shows the temperature in degrees Celsius.
 * 	  C = 5 * ((F-32) / 9).
 */

public class Exercise09 {

	public static double getCelsiusOutOfFahrenheit(double fahrenheit) {
		return 5*((fahrenheit-32)/9);
	}
}
