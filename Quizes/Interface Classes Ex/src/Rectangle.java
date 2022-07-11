
public class Rectangle implements Paintable {
	private int width;
	private int height;
	
	public Rectangle(int inWidth, int inHeight) {
		width = inWidth;
		height = inHeight;
	}
	
	public void paint() {
		System.out.println(String.format("Painted a rectangle with a width and height of: %d, %d ", width, height));
	}
	
	public void updateWidth(int aWidth) {
		width = aWidth;
	}
	
	public void updateHeight(int aHeight) {
		height = aHeight;
	}
}
