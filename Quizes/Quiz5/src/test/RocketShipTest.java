package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import main.RocketShip;


class RocketShipTest {

	@Test
	public void fuelUpTest() {
	    RocketShip testRocketShip = new RocketShip(50);
	    testRocketShip.fuelUp(30);
	    assertEquals(80, testRocketShip.getFuelLevel());
	}
	
	@Test
	public void takeOffTest() {
		RocketShip testRocket = new RocketShip(50);
		testRocket.takeOff();
		assertEquals(30, testRocket.getFuelLevel());
		assertEquals(20, testRocket.getCurrentHeight());
	}
	

}
