package exercises.Exercise12;

/*
 * 12-  Having as input data the height (h) of a person, 
 * 		build an algorithm that calculates his ideal weight, using the following formulas:
 * 	    a) For men: (72.7*h) - 58
 *    	b) For women: (62.1*h) - 44.7
 */

public class Exercise12 {

	public static double getIdealWeight(double height, Genre genre) {
		return genre == Genre.Man ? (72.7*height)-58 :(62.1*height) - 44.7;
	}
}
