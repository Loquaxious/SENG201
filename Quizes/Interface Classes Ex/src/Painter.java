import java.util.ArrayList;

public class Painter {
	
	private ArrayList<Paintable> paintableObjects;
	
	public Painter() {
		paintableObjects = new ArrayList<Paintable>();
	}
	
	public void add(Paintable toPaint) {
		paintableObjects.add(toPaint);
	}
	
	public void paintAllObjects() {
		for (Paintable object: paintableObjects) {
			System.out.println(object);
		}
	}
	
	public static void main(String[] args) {
		Painter p = new Painter();
		
		Circle c = new Circle(5);
		Square s = new Square(7);
		Rectangle r = new Rectangle(6,8);
		
		p.add(c);
		p.add(s);
		p.add(r);
		
		p.paintAllObjects();
	}
}
