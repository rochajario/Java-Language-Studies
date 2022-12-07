package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import exercises.Question01.Student;

public class Question01Tests {

	@Test
	public void average()
	{
		var student = new Student(2, 3.5, 9);
		assertEquals(6.7, student.average(), 0.1);
	}
	
	@Test
	public void finalExam()
	{
		var student = new Student(2, 3.5, 9);
		assertEquals(3.3, student.finalExam(), 0.1);
	}
}
