package com;

public class CityBicycle extends Bicycle{
	
	public String colour;
	
	public CityBicycle(String defaultColour,int startCadence, int startSpeed, int startGear)
	{
		super(startCadence,startSpeed,startGear);
		colour = defaultColour;
	}
	
    public void setColour(String newValue) 
    {
        colour = newValue;
    }
    
    public void displayDetails()
    {
    	System.out.println("Specification of "+name+"'s Bike\n"+"Color:"+colour+" Cadence:"+cadence+" Gear:"+gear+" Speed:"+speed);   	
    }
}
