package tests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import exercises.Exercise01;

public class Exercise01Test {
	private Exercise01 exercise1;

	public Exercise01Test() {
		this.exercise1 = new Exercise01();
	}

	@Test
	public void validateClassOutput() {
		assertEquals("Hello World!", this.exercise1.toString());
	}

}
