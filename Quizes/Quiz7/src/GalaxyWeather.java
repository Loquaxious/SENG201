
public class GalaxyWeather extends Observable {
	
	private boolean isSolarFlare = false;
	private boolean isSpaceStorm = false;
	private boolean isComets = false;
	
	public boolean getIsSolarFlare() {
		return this.isSolarFlare;
	}
	
	public void setIsSolarFlare(boolean bool) {
		if (bool != this.isSolarFlare) {
			setChanged();
			this.isSpaceStorm = bool;
			notifyObservers();
		}
	}
	
	public boolean getIsSpaceStorm() {
		return this.isSpaceStorm;
	}
	
	public void setIsSpaceStorm(boolean bool) {
		if (bool != this.isSpaceStorm) {
			setChanged();
			this.isSpaceStorm = bool;
			notifyObservers();
		}
	}
	
	public boolean getIsComets() {
		return this.isComets;
	}
	
	public void setIsComets(boolean bool) {
		if (bool != this.isComets) {
			setChanged();
			this.isSpaceStorm = bool;
			notifyObservers();
		}
		
	}
	
	
	
	public static void main(String[] args) {		
		GalaxyWeather weather = new GalaxyWeather();
		System.out.println(weather.getIsComets());
		
		GalaxyWeather weather2 = new GalaxyWeather();
		SpaceMan spacey = new SpaceMan();
		weather2.addObserver(spacey);
		weather2.setIsSolarFlare(true);
		
		

	}

}
