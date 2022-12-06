package exercises;

/*
 * 13- Make a Program that asks how much you earn per hour and the number of hours worked in the month. Calculate and show your total salary in that month, knowing that 11% is deducted for Income Tax, 8% for INSS and 5% for the union, make a program that gives us:

    gross salary.
    how much did he pay to the INSS.
    How much did you pay the union?
    the net salary.
    calculate the deductions and the net salary, according to the table below:

    + Gross Salary: BRL
    - FIT (11%): BRL
    - Social Security (8%): ​​BRL
    - Union (5%): BRL
    = Net Salary: BRL

    Note: Gross Salary - Discounts = Net Salary.
 */

public class Exercise13 {
	

	private double grossSalary;

	public Exercise13(int hoursWorked, double hourlyEarning) {
		this.grossSalary = hourlyEarning * hoursWorked;
	}
	
	public double getGrossSalary() 
	{
		return this.grossSalary;
	}
	
	public double getFederalIncomeTax() {
		return this.discountPercentage(0.11);
	}
	
	public double getSocialSecurity()
	{
		return this.discountPercentage(0.08);
	}
	
	public double getUnionDiscount()
	{
		return this.discountPercentage(0.05);
	}
	
	public double getNetSalary()
	{
		var discounts = this.getFederalIncomeTax() + this.getSocialSecurity() + this.getUnionDiscount();
		return this.grossSalary - discounts;
	}
	
	private double discountPercentage(double percentage) 
	{
		return this.grossSalary * percentage;
	}
	
	@Override
	public String toString()
	{
		return String.format(
				"+ Gross Salary	: R$ %f\n- FIT	: R$ %f\n- SS	: R$ %f\n- Union Discount	: R$ %f\n= Net Salary		: R$ %f",
				this.getGrossSalary(),
				this.getFederalIncomeTax(),
				this.getSocialSecurity(),
				this.getUnionDiscount(),
				this.getNetSalary());
	}
}
