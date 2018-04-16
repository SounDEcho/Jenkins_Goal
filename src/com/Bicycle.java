package com;

public class Bicycle {
	public String name="No data available";
    public int cadence;
    public int gear;
    public int speed;

    public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }
    
    public void setCadence(int newValue) {
        cadence = newValue;
    }
        
    public void setGear(int newValue) {
        gear = newValue;
    }
        
    public void applyBrake(int decrement) {
        speed += decrement;
    }
        
    public void speedUp(int increment) {
        speed += increment;
    }
    public void setName(String name) {
    	this.name=name;
    }
}
