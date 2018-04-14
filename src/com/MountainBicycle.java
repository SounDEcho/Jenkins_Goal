package com;

public class MountainBicycle extends Bicycle {
    
    public int seatHeight;

    public MountainBicycle(int startHeight, int startCadence,
                        int startSpeed, int startGear) {
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }   
        
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }   

    
    public void displayDetails()
    {
    	System.out.println("Specification of "+name+"'s Bike\n"+"SeatHeight:"+seatHeight+" Cadence:"+cadence+" Gear:"+gear+" Speed:"+speed);   	
    }
}