package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.MountainBicycle;

class TestMountainBicycle {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testSetHeight() {
		MountainBicycle Tango = new MountainBicycle(5, 3 , 40, 1);
		Tango.setHeight(9);
		assertEquals(Tango.seatHeight,9);
	}

	@Test
	void testSetGear() {
		MountainBicycle Tango = new MountainBicycle(5, 3 , 40, 1);
		Tango.setGear(5);
		assertEquals(Tango.gear, 5);
	}
	
	@Test
	void testspeedUp() {
		MountainBicycle Tango = new MountainBicycle(5, 3 , 40, 1);
		Tango.speedUp(5);
		assertEquals(Tango.speed, 45);
	}
	
}
