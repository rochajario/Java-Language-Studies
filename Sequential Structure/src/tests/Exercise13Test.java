package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import exercises.Exercise13;

public class Exercise13Test {

	private Exercise13 exercise13;
	
	@Before
	public void prepare() 
	{
		int hoursWorked = 130;
		double hourlyEarning = 30;
		exercise13 = new Exercise13(hoursWorked, hourlyEarning);
	}
	
	@Test
	public void validateGrossSalary()
	{
		assertEquals(3900, this.exercise13.getGrossSalary(), 0.1);
	}
	
	@Test
	public void validateFederalIncomeTax()
	{
		assertEquals(429, this.exercise13.getFederalIncomeTax(), 0.1);
	}
	
	@Test
	public void validateSocialSecurity()
	{
		assertEquals(312, this.exercise13.getSocialSecurity(), 0.1);
	}
	
	@Test
	public void validateUnionDiscount()
	{
		assertEquals(195, this.exercise13.getUnionDiscount(), 0.1);
	}
	
	@Test
	public void validateNetSalary()
	{
		assertEquals(2964, this.exercise13.getNetSalary(), 0.1);
	}
	
	@Test
	public void toStringTest()
	{
		var textInfo = new String[] {
				"+ Gross Salary",
				"- FIT",
				"- SS",
				"- Union",
				"= Net Salary"
			};
		
		var result = this.exercise13.toString();
		
		for(int i = 0; i < textInfo.length; i++)
		{
			assertTrue(result.contains(textInfo[i]));
		}
	}
}
