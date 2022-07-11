
public class Starman implements Observer {
	
	@Override
	 public void update(Observable o, Object arg) {
		
		GalaxyWeather weather = (GalaxyWeather) o;
	
		
		if (weather.getIsSolarFlare()) {
			System.out.println("Sigh... no adventuring today");
		} else if (weather.getIsComets()) {
			System.out.println("I'll show those comets who's boss!");
		} 
		
		
	}

	public static void main(String[] args) {
		GalaxyWeather weather = new GalaxyWeather();
		Starman spacey = new Starman();
		weather.addObserver(spacey);
		weather.setIsComets(true);

	}

}
