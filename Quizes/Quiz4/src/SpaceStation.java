
public class SpaceStation implements RemoteControllable {
	
	private String ssPlanet;
	private String ssMission;
	
	SpaceStation(String planet) {
		ssPlanet = planet;
	}
	
	public String getLocation() {
		return String.format("The space station floats around the planet %s", ssPlanet);
	}
	
	public String getStatusReport() {
		return getLocation() + String.format("\nThe station is on a mission to: %s", ssMission);
	}
	
	public void updateMission(String mission) {
		ssMission = mission;
	}
	
	public static void main(String[] args) {
		SpaceStation station = new SpaceStation("Mars");
		System.out.println(station instanceof RemoteControllable);
		station.updateMission("Store food rations for hungry space travelers");
		System.out.println(station.getStatusReport());
	}
}
