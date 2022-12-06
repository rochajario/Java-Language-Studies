package exercises;

/*
 * 11- Write a program that asks for 2 integers and a real number. 
 * 	   Calculate and show:
 * 		a) the product of twice the first and half of the second.
 * 		b) the sum of three times the first and the third.
 * 		c) the second raised to the cube.
 */

public class Exercise11 {

	private int firstNumber;
	private int secondNumber;

	public Exercise11(int firstNumber, int secondNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}
	
	public double operationA() 
	{
		return (2*this.firstNumber) + (this.secondNumber/2);
	}

	public double operationB() {
		return (3*this.firstNumber)+ this.secondNumber;
	}

	public double operationC() {
		return Math.pow(this.secondNumber, 3);
	}
}
