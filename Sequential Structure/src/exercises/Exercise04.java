package exercises;

/*
 * 4- Make a program that asks for the 4 bimonthly grades and shows the average.
 */

public class Exercise04 {

	public static double getGradesAverage(double[] grades) {
		double result =  0;
		for(int i = 0; i < grades.length; i++)
		{
			result += grades[i];
		}
		return result/grades.length;
	}

}
