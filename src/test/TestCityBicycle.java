package test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.CityBicycle;

public class TestCityBicycle {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testSetCadence() {
		CityBicycle Charlie = new CityBicycle("Blue",5,20,1);
		Charlie.setCadence(10);
		assertEquals(10, Charlie.cadence);
	}

	@Test
	public void testSetGear() {
		CityBicycle Charlie = new CityBicycle("Blue",5,20,1);
		Charlie.setGear(5);
		assertEquals(5, Charlie.gear);
	}

}
