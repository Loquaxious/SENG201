
public class Planet extends SolarSystem {
	
	private String planetName;
	private int planetOrder;
	private String planetTemp;
	
	Planet(String name, int order, String temperature) {
		planetName = name;
		planetOrder = order;
		planetTemp = temperature;
	}
	
	public String orderFromSun() {
		return String.format("%s is number %d from the Sun", planetName, planetOrder);
	}
	
	public String getName() { 
		return planetName;
	}
	
	public String getTemperature() { 
		return planetTemp;
	}
	
	public String toString() {
		return orderFromSun() + " and is " + getTemperature();
	}

	public static void main(String[] args) {
		Mercury mercury = new Mercury();
		System.out.println(mercury instanceof Planet);
		System.out.println(mercury);
		Earth earth = new Earth();
		System.out.println(earth instanceof Planet);
		System.out.println(earth);
		System.out.println(earth.home());

	}

}
