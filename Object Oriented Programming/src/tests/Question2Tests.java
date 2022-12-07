package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import exercises.Question02.CustomDate;

public class Question2Tests {

	private CustomDate date;

	@Before
	public void prepareCustomDate() {
		this.date = new CustomDate();
	}

	@Test
	public void constructorTest() {
		assertEquals("0000-01-01", this.date.getDate());
	}

	@Test
	public void parseRejectsInvalidFormat() {
		var format = "Lorem Ipsum sit amet dolor";
		var thrown = assertThrows(Exception.class, () -> this.date.parse(format));
		assertEquals("Invalid Date Format", thrown.getMessage());
	}

	@Test
	public void parseAcceptsValidFormat() throws Exception {
		var format = "2022-10-10";
		this.date.parse(format);
		assertEquals(format, this.date.getDate());
	}

	@Test
	public void getYear() throws Exception {
		this.date.parse("2022-05-18");
		assertEquals(2022, this.date.year());
	}

	@Test
	public void getMonth() throws Exception {
		this.date.parse("2022-05-18");
		assertEquals(5, this.date.month());
	}

	@Test
	public void getDay() {
		assertEquals(1, this.date.day());
	}

	@Test
	public void getMonthName() {
		assertEquals("January", this.date.monthName());
	}

	@Test
	public void notLeapYear() throws Exception {
		this.date.parse("2021-05-18");
		assertFalse(this.date.isLeap());
	}

	@Test
	public void leapYear() throws Exception {
		this.date.parse("2020-05-18");
		assertTrue(this.date.isLeap());
	}
}
