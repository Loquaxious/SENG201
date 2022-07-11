import java.util.*;

public class StarmansBoss {
	
	public int getCollectiveAge(Collection<Astronaut> o) {
		int sum = 0;
		for(Astronaut astronaut: o) {
			sum += astronaut.getAge();
		}
		
		return sum;
	}

	public static void main(String[] args) {
		Astronaut spaceman = new Astronaut("Spaceman", 20, "Hash browns", "0001 to Mars");
		Astronaut spacegirl = new Astronaut("Spacegirl", 21, "Pizza", "0002 to the Moon");
		Astronaut spacedog = new Astronaut("Spacedog", 7, "Hash browns", "0001 to Mars");

		List<Astronaut> astronautList = List.of(spaceman, spacegirl, spacedog);

		StarmansBoss boss = new StarmansBoss();
		System.out.println(boss.getCollectiveAge(astronautList));

	}

}
