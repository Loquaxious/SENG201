
public class LiftoffWatch {
	private double temperature;
	private String weather;
	private double wind;
	
	public void setTemp(double temp ) {
		temperature = temp;
	}
	
	public void setWeather(String state) {
		weather = state;
	}
	
	public void setWind(double speed) {
		wind = speed;
	}
	
	public boolean canWeLaunch() {
		if (temperature >= 16.5 && temperature <= 34.0) {
			if (weather == "Rainy") {
				return false;
			} else if (weather == "Sunny" && wind < 60.0) {
				return true;
			} else if (weather == "Cloudy" && wind < 45.0) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		LiftoffWatch launch = new LiftoffWatch();

		launch.setTemp(27.0);
		launch.setWeather("Sunny");
		launch.setWind(53);
		System.out.println(launch.canWeLaunch());

	}

}
