package yang.fang.composite;

public class Circle implements Shape {

	@Override
	public void draw(String fillingColor) {
		System.out.println("Drawing the Circle with the color " + fillingColor);
	}

}
