package run_pkg;

import com.CityBicycle;
import com.MountainBicycle;

public class RunClass {

	public static void main(String[] args) {
		
		CityBicycle Charlie = new CityBicycle("Blue",5,20,1);
		MountainBicycle Tango = new MountainBicycle(5, 3 , 40, 1);
		
		Charlie.setName("Charlie");
		Charlie.setColour("Pink");
		Charlie.setCadence(10);
		Charlie.displayDetails();
		
		System.out.println("\n\n");
		
		Tango.setName("Tango");
		Tango.setHeight(3);
		Tango.displayDetails();
	}

}