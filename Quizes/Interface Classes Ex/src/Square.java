
public class Square implements Paintable {
	private int sideLength;
	
	
	public Square(int inSideLength) {
		sideLength = inSideLength;
	}
	
	public void paint() {
		System.out.println(String.format("Painted a Square with a side length of: %d", sideLength));
	}
	
	public void updateSideLength(int aSideLength) {
		sideLength = aSideLength;
	}
}
