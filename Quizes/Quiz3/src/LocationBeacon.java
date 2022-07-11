
public class LocationBeacon {
	
	private int hours = 0;
	private int minutes = 0;
	private int distance = 0;
	
	void heartBeat(int startHour, int startMinute, int startDistance, int speed, int duration) {
		hours = startHour;
		minutes = startMinute;
		distance = startDistance;
		
		for (int time = 0; time < duration ; time+=10) {
			
			minutes+=10;
			distance += (speed/6);
			
			if (minutes >= 60) {
				hours++;
				minutes -= 60;
			}
			if (hours >= 24) {
				hours -= 24;
			}
			
			
			System.out.println("["+ hours +":"+ minutes +"] Starman is "+ distance +"km "
					+ "away from Earth");
		}
	}

	public static void main(String[] args) {
		LocationBeacon beacon = new LocationBeacon();	
		beacon.heartBeat(14, 31, 300000, 60000, 60);

	}

}
