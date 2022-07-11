
public class SpaceStation {
	
	void dock() {
		System.out.println("Starman floats toward the space station and enters "
				+ "through the airlock");
	}
	
	void dock(String vehicle) {
		System.out.println("Starman enters the large airlock, piloting " + vehicle);
	}
	
	void dock(String vehicle, String songName) {
		System.out.println("Starman enters the large airlock, piloting " + vehicle + "\n" 
				+ "... and the station cranks up " + songName + " on the entertainment system");
	}

	public static void main(String[] args) {
		SpaceStation station = new SpaceStation();
		station.dock();
		station.dock("Red Tesla Roadster");
		station.dock("Red Tesla Roadster", "Space Oddity");

	}

}
