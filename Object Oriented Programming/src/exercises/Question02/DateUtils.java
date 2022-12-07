package exercises.Question02;

import java.util.Arrays;

public class DateUtils {
	
	public static void validateThirtyDaysMonth(String format) throws Exception {
		int[] thirtyDaysMonths = {1,3,5,6,8,10,12};
		
		var month = getDatePortion(format,1);
		int day = getDatePortion(format,2);
		
		if(Arrays.asList(thirtyDaysMonths).contains(month) && day >30) {
			throw new Exception("Day must be in 1-30 interval");
		}
	}
	
	public static void validateFebruary(String format) throws Exception {
		
		int year = getDatePortion(format,0);
		int month = getDatePortion(format,1);
		int day = getDatePortion(format,2);
		
		if(month != 2) {
			return;
		}
		
		if(isLeap(year) && day > 29) {
			throw new Exception("Day must be in 1-29 interval");
		}
		
		if(day >28) {
			throw new Exception("Day must be in 1-28 interval");
		}
	}
	
	public static void validateThirtyOneDaysMonth(String format) throws Exception {
		int[] thirtyOneDaysMonths = {4,7,9,11};
		
		int month = getDatePortion(format,1);
		int day = getDatePortion(format,2);
		
		if(Arrays.asList(thirtyOneDaysMonths).contains(month) && day >31) {
			throw new Exception("Day must be in 1-31 interval");
		}
	}

	public static void validateMonthInterval(String format) throws Exception {
		if (getDatePortion(format, 1) < 1 || (getDatePortion(format, 1) > 12)) {
			throw new Exception("Month must be in 1-12 interval");
		}
	}

	public static void validateDateFormat(String format) throws Exception {
		if (!format.matches("[0-9]{4}-[0-1][0-9]-[0-3][0-9]")) {
			throw new Exception("Invalid Date Format");
		}
	}
	
	public static Boolean isLeap(int year)
	{
		var divisibleByFour = year % 4 == 0;
		var notDivisibleByHundred = year % 100 != 0;
		var divisibleByFourHundred = year % 400 == 0;

		return divisibleByFour && notDivisibleByHundred || !notDivisibleByHundred && divisibleByFourHundred;
	}

	public static int getDatePortion(String date, int portion) {
		return Integer.parseInt(date.split("-")[portion]);
	}
}
