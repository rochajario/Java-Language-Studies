package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import exercises.Exercise11;

public class Exercise11Test {

	private Exercise11 exercise11;
	
	public Exercise11Test()
	{
		int firstNumber = 2;
		int secondNumber = 4;
		
		this.exercise11 = new Exercise11(firstNumber, secondNumber);
	}
	
	@Test
	public void operationA() 
	{
		assertEquals(6, this.exercise11.operationA(), 0.01);
	}
	
	@Test
	public void operationB()
	{
		assertEquals(10, this.exercise11.operationB(), 0.01);
	}
	
	@Test
	public void operationC()
	{
		assertEquals(64, this.exercise11.operationC(), 0.01);
	}
}
