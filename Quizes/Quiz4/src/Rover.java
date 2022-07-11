
public class Rover implements RemoteControllable {
	
	private double rvrLatitude;
	private double rvrLongitude;
	private String rvrMission;

	
	public void setLocation(double latitude, double longitude) {
		rvrLatitude = latitude;
		rvrLongitude = longitude;
	}
	
	public String getLocation() {
		return String.format("The rover is located %.1f, %.1f on the planet.", rvrLatitude, rvrLongitude);
	}
	
	public String getStatusReport() {
		return getLocation() + "\nThe rover is driving to: " + rvrMission;
	}
	
	public void updateMission(String mission) {
		rvrMission = mission;
	}
	
	public static void main(String[] args) {
		Rover rover = new Rover();
		System.out.println(rover instanceof RemoteControllable);
		rover.setLocation(100.0, 42.0);
		rover.updateMission("Find water");
		System.out.println(rover.getStatusReport());
	}
}
