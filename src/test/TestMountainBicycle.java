package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.MountainBicycle;

public class TestMountainBicycle {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testApplyBrake() {
		MountainBicycle Tango = new MountainBicycle(5, 3 , 40, 1);
		Tango.applyBrake(10);
		assertEquals(30, Tango.speed);
	}

	@Test
	public void testSpeedUp() {
		MountainBicycle Tango = new MountainBicycle(5, 3 , 40, 1);
		Tango.speedUp(10);
		assertEquals(50, Tango.speed);
	}

}
