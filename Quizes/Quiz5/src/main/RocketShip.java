package main;
public class RocketShip {

    int MAX_FUEL_LEVEL = 100;

    int fuelLevel;
    int currentHeight;

    public RocketShip(int fuelLevel) {
        this.fuelLevel = fuelLevel;
        this.currentHeight = 0;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public int getCurrentHeight() {
        return currentHeight;
    }

    public void fuelUp(int fuelAmount) {
        if(fuelAmount > 0) {
        	fuelLevel += fuelAmount;
        } else {
        	throw new IllegalArgumentException("Fuel amount must be postive for fueling up");
        }
    	
    }

    public void takeOff() {
    	if (fuelLevel >= 20) {
            fuelLevel -= 20;
            currentHeight += 20;
    	} else {
    		throw new InsufficientFuelException("Not enough fuel!");
    	}

    }

    public void goHigher() {
        fuelLevel -= 10;
        currentHeight += 50;
    }

    public void goLower() {
        currentHeight -= 50;
    }

    public void land() {
        if (currentHeight > 20) {
        	throw new LandingException("Too high to land!");
        } else {
        	currentHeight = 0;
        }
    }
    
    public void testFlight() {
    	try {
    		takeOff();
        	goHigher();
        	goLower();
        	land();
    	} catch (InsufficientFuelException e) {
    		System.out.println(e.getMessage());
    	} finally {
    		System.out.println("Cleaning up launch pad");
    	}
    }
    
    public static void main(String[] args) {
    	RocketShip testRocketShip = new RocketShip(0);
    	try {
    	    testRocketShip.testFlight();
    	    System.out.println(testRocketShip.getCurrentHeight());
    	} catch (InsufficientFuelException e) {
    	    System.out.println("Oops! You didn't catch the exception");
    	}
    }
}
