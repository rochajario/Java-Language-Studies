package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import exercises.Exercise02;

public class Exercise02Test {

	private Exercise02 exercise2;
	
	public Exercise02Test() {
		this.exercise2 = new Exercise02();
	}

	@Test
	public void ValidateOutputPrint() {
		assertEquals("The number entered was [1].", this.exercise2.getInformedNumber(1));
	}

}
