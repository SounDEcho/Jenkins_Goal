package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.CityBicycle;

class TestCityBicycle {

	@BeforeEach
	void setUp() throws Exception {
	}

	
	@Test
	void testSetGear() {
		CityBicycle Charlie = new CityBicycle("Blue",5,20,1);
		Charlie.setGear(5);
		assertEquals(Charlie.gear, 5);
	}
	
	@Test
	void testspeedUp() {
		CityBicycle Charlie = new CityBicycle("Blue",5,20,1);
		Charlie.speedUp(5);
		assertEquals(Charlie.speed, 25);
	}

}
