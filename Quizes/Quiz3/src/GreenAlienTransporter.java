import java.util.ArrayList;

public class GreenAlienTransporter {
	private String transName;
	private int[] transporter;
	private ArrayList<GreenAlien> passengers;
	
	public GreenAlienTransporter(String name) {
		transName = name;
		transporter = new int[] {100, 100, 100, 100};
		passengers = new ArrayList<GreenAlien>();
	}
	
	public boolean replaceCell(int cellNum) {
		if (cellNum >= 1 && cellNum <= 4) {
			transporter[cellNum-1] = 100; 
			return true;
		} else {
			return false;
		}
	}
	
	public boolean travel(int lightYears) {
		for (int i = 0; i < lightYears; i++) {
			if (transporter[0] > 0) {
				transporter[0] -= 10;
			} else if (transporter[1] > 0) {
				transporter[1] -= 10;
			} else if (transporter[2] > 0) {
				transporter[2] -= 10;
			} else if (transporter[3] > 0) {
				transporter[3] -= 10;
			} else {
				return false;
			}
		}
		return true;
	}
	
	public int getCharge(int cellNum) {
		if (cellNum >= 1 && cellNum <= 4) {
			return transporter[cellNum-1];
		} else {
			return -1;
		}
	}
	
	public boolean addPassenger(GreenAlien alien) {
		if (passengers.contains(alien)) {
			return false;
		} else {
			passengers.add(alien);
			return true;
		}
	}
	
	public boolean removePassenger(GreenAlien alien) {
		if (passengers.contains(alien)) {
			passengers.remove(alien);
			return true;
		} else {
			return false;
		}
	}
	
	public String getPassengerNames() {
		String returnString = "";
		for (GreenAlien passenger: passengers) {
			returnString += (passenger.getName() + ", ");
		}
		return returnString.substring(0,returnString.length()-2);
	}
	
	public int countEyes() {
		int eyeCount = 0;
		for (GreenAlien passenger: passengers) {
			eyeCount += passenger.getEye();
		}
		return eyeCount;
	}
	
	public ArrayList<String> shoppingList() {
		ArrayList<String> candyList = new ArrayList<String>();
		
		for (GreenAlien passenger: passengers) {
			candyList.add(passenger.getCandy());
		}
		return candyList;
	}
	
	public String toString() {
		return String.format("The passengers on %s are:\n%s\n" + 
	"The number of eyes on this transporter is: %d", transName, getPassengerNames(), countEyes());
	}

	public static void main(String[] args) {
		GreenAlienTransporter transporter = new GreenAlienTransporter("Fun Club"); 
        
		GreenAlien kloup = new GreenAlien("Yyest", 2, "Biscuits");                 
		GreenAlien gwerp = new GreenAlien("Lmona", 99, "Marshmellows");            
		GreenAlien blarg = new GreenAlien("Troll", 5, "Pop Rocks");                
		GreenAlien lesap = new GreenAlien("Nemoa", 3, "Marshmellows");             
		GreenAlien hugso = new GreenAlien("Hugso", 8, "Pop Rocks");                
		                                                                           
		transporter.addPassenger(kloup);                                           
		System.out.println(transporter.addPassenger(kloup));                       
		transporter.removePassenger(kloup);                                        
		System.out.println(transporter.addPassenger(kloup));                       
		transporter.addPassenger(gwerp);                                           
		transporter.addPassenger(blarg);                                           
		transporter.addPassenger(lesap);                                           
		transporter.addPassenger(hugso);                                           
		                                                                           
		System.out.println(transporter);   

	}

}
