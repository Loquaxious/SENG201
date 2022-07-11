
public class StarmanSummits {
	
	double currentHeight = 0;
	int attempts = 0;
	
	void climbMountain(double height, double dash, double slide) {
		while (currentHeight < height) {
			currentHeight += dash;
			
			if (currentHeight < height) {
				currentHeight -= slide;
				attempts++;
			} else {
				attempts++;
				break;
			}
				
		}
		System.out.println("Starman needs to dash "+ attempts +" "
				+ "times before he reaches the top of the mountain");
	}

	public static void main(String[] args) {
		StarmanSummits starman = new StarmanSummits();
		starman.climbMountain(21287.4, 16.4, 4.3);

	}

}
