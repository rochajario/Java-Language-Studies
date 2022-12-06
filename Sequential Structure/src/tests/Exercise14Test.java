package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import exercises.Exercise14.Exercise14;

public class Exercise14Test {

	@Test
	public void getMuchTintNeeded() {
		var exercise14 = new Exercise14();
		exercise14.setAreaToBePainted(12);
		assertEquals(2, exercise14.getLitersNeeded(), 0.1);
	}
}
