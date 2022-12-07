package exercises.Question02;

/*
 * Question 2
 * Write a Date class whose instance (object) represents a date. 
 * This class must have the following methods:
 * - **parse**: Defines the date that a certain object (through parameter), 
 * 				this method verifies if the date is correct, 
 * 				if not, the date is set to `0000-01-01` (yyyy-mm-dd);
 * 
 * - **compare**: Receives as a parameter another object of Class date, compare with the current date and return:
 * 		- **0** if the dates are the same;
 * 		- **1** if the current date is greater than that of the parameter;
 * 		- **-1** if the parameter date is greater than the current one.
 * - **day**: Returns the day of the date;
 * - **month**: Returns the month of the date;
 * - **monthName**: Returns the month of the current date in words;
 * - **year**: Returns the year of the date;
 * - **isLeap**: Returns true if the year of the current date is a leap year and false otherwise.
 */

public class CustomDate {

	private String date;

	public CustomDate() {
		this.date = "0000-01-01";
	}

	public String getDate() {
		return this.date;
	}

	public void parse(String format) throws Exception {
		
		DateUtils.validateDateFormat(format);
		DateUtils.validateMonthInterval(format);
		DateUtils.validateFebruary(format);
		DateUtils.validateThirtyDaysMonth(format);
		DateUtils.validateThirtyOneDaysMonth(format);

		this.date = format;
	}

	public int year() {
		return DateUtils.getDatePortion(this.date, 0);
	}

	public int month() {
		return DateUtils.getDatePortion(this.date, 1);
	}

	public int day() {
		return DateUtils.getDatePortion(this.date, 2);
	}

	public String monthName() {
		switch (this.month()) {
		case 1:
			return "January";
		case 2:
			return "February";
		case 3:
			return "March";
		case 4:
			return "April";
		case 5:
			return "May";
		case 6:
			return "June";
		case 7:
			return "July";
		case 8:
			return "August";
		case 9:
			return "September";
		case 10:
			return "October";
		case 11:
			return "November";
		case 12:
			return "December";
		default:
			return "";
		}
	}

	public Boolean isLeap() {
		return DateUtils.isLeap(this.year());
	}
}
