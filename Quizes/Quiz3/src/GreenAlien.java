
public class GreenAlien {
	private String name;
	private int eyeCount;
	private String favouriteCandy;
	
	public GreenAlien() {
		name = "Kloup";
		eyeCount = 6;
		favouriteCandy = "Lollypops";
	}
	
	public GreenAlien (String tempName, int tempEye, String tempCandy) {
		name = tempName;
		eyeCount = tempEye;
		favouriteCandy = tempCandy;
	}
	
	public String toString() {
		return String.format("This Alien is called %s and has %d eyes. Gross. It seems to enjoy eating %s",
                name, eyeCount, favouriteCandy);
	}
	
	public String getName() {
		return name;
	}
	
	public int getEye() {
		return eyeCount;
	}
	
	public String getCandy() {
		return favouriteCandy;
	}
	
	public boolean equals(GreenAlien other) {
		if (this.name == other.getName() && this.eyeCount == other.getEye() && 
				this.favouriteCandy == other.getCandy()) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		GreenAlien alien = new GreenAlien();
		System.out.println(alien);
	}

}
