import java.util.ArrayList;

public class StarmanOrganises {
	
	private ArrayList<RemoteControllable> spaceThings;
	
	StarmanOrganises() {
		spaceThings = new ArrayList<RemoteControllable>();
	}
	
	public void addControllable(Object o) {
		if (o instanceof RemoteControllable) {
			spaceThings.add((RemoteControllable) o);
		}
	}
	
	public void getAllStatusReports() {
		for (RemoteControllable spaceObjects: spaceThings) {
			System.out.println(spaceObjects.getStatusReport());
		}
	}

	public static void main(String[] args) {
		SpaceStation station = new SpaceStation("Mars");
		station.updateMission("Store food rations for hungry space travelers");

		Rover rover = new Rover();
		rover.setLocation(100.0, 42.0);
		rover.updateMission("Find water");

		StarmanOrganises organise = new StarmanOrganises();
		organise.addControllable(station);
		organise.addControllable(rover);
		organise.getAllStatusReports();

	}

}
