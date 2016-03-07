package yang.fang.composite;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape {

	private List<Shape> shapes = new ArrayList<Shape>();

	@Override
	public void draw(String fillingColor) {
		for (Shape shape : shapes) {
			shape.draw(fillingColor);
		}
	}

	public void add(Shape e) {
		this.shapes.add(e);
	}

	public void remove(Shape e) {
		shapes.remove(e);
	}

	public void clear() {
		System.out.println("Clearing all the shapes from the drawing!");
		shapes.clear();
	}

}
