
public class Circle implements Paintable{
	
	private int radius;
	
	public Circle(int inRadius) {
		radius = inRadius;
	}
	
	public void updateRadius(int newRadius) {
		radius = newRadius;
	}
	
	public void paint() {
		System.out.println(String.format("Painted a circle with a radius of: %d", radius));
	}
	
	public String toString() {
		return String.format("Painted a circle with a radius of: %d", radius);
	}
}
