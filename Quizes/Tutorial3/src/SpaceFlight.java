import java.util.stream.Stream;

public class SpaceFlight {
	
	private double velo;
	private double acceleration;
	
	SpaceFlight(double initialVelocity, double driveAcceleration) {
		this.velo = initialVelocity;
		this.acceleration = driveAcceleration;
	}
	
	double distanceAtTime(int time) {
		return (velo*time) + (0.5*(acceleration*(time * time)));
	}
	
	Stream<Double> simulateDistance(int skipSeconds, int modelDuration) {
		return Stream.iterate(0, i -> i + 1)
						.skip(skipSeconds)
						.limit(modelDuration)
						.map(this::distanceAtTime); 
	}

	public static void main(String[] args) {
		SpaceFlight flight = new SpaceFlight(0, 1);
		flight.simulateDistance(0, 10).forEach(x -> System.out.println(String.format("%.2fm", x)));

	}

}
