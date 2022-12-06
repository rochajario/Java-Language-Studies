package exercises.Exercise14;

import java.util.ArrayList;
import java.util.List;

/*
 14- Make a Program for a paint store. 
 	 The program should ask for the size in square meters of the area 
 	 to be painted. Consider that the coverage of the paint is 1 liter 
 	 for every 6 square meters and that the paint is sold in 18 liter cans, 
 	 which cost R$80.00, or in 3.6 liter cans, which cost R$25.00 .

    - Inform the user of the quantities of ink to be purchased and 
      the respective prices in 3 situations:
    
    	a) buy only 18 liter cans;
    	b) buy only 3.6 liter gallons;
    	c) mix cans and gallons, so that less paint is wasted. 
    	   Add 10% slack and always round up, consider full cans.
 */

public class Exercise14 {
	private final int TINT_METERS_COVERAGE = 6;
	private double areaToBePainted;
	private double litersNeeded;
	
	public double getAreaToBePainted() {
		return areaToBePainted;
	}
	
	public void setAreaToBePainted(double areaToBePainted) {
		this.areaToBePainted = areaToBePainted;
		this.litersNeeded = areaToBePainted/TINT_METERS_COVERAGE;
	}
	
	public double getLitersNeeded() {
		return litersNeeded;
	}
	
	public List<Tint> getAsGallons()
	{
		var literReference = 18;
		var amountNeeded = Math.round(this.getAreaToBePainted()*(literReference  % TINT_METERS_COVERAGE));
		
		List<Tint> result = new ArrayList<Tint>();
		for(int i= 0; i< amountNeeded; i++ )
		{
			result.add(new Gallon());
		}
		return result;
	}
	
	public List<Tint> getAsCans()
	{
		var literReference = 3.6;
		var amountNeeded = Math.round(this.getAreaToBePainted()*(literReference  % TINT_METERS_COVERAGE));
		
		List<Tint> result = new ArrayList<Tint>();
		for(int i= 0; i< amountNeeded; i++ )
		{
			result.add(new Can());
		}
		return result;
	}
}
