import java.util.ArrayList;

public class SolarSystem {
	
	private ArrayList<Planet> solarSystem;
	
	SolarSystem() {
		solarSystem = new ArrayList<Planet>();
	}
	
	public void addPlanet(Planet planet) {
		solarSystem.add(planet);
	}
	
	public void printAllPlanets() {
		for (Planet p : solarSystem) {
			System.out.println(p.toString());
		}
	}
	
	public int getPlanetCount() {
		return solarSystem.size();
	}

	public static void main(String[] args) {
		Planet mercury = new Mercury();
		Planet venus = new Venus();
		Planet earth = new Earth();
		Planet saturn = new Saturn();

		SolarSystem solarsystem = new SolarSystem();
		solarsystem.addPlanet(mercury);
		solarsystem.addPlanet(venus);
		solarsystem.addPlanet(earth);
		solarsystem.addPlanet(saturn);

		solarsystem.printAllPlanets();
		System.out.println(solarsystem.getPlanetCount());

	}

}
