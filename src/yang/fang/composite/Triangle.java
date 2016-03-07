package yang.fang.composite;

public class Triangle implements Shape {

	@Override
	public void draw(String fillingColor) {
		System.out.println("Drawing Triangle with the color " + fillingColor);
	}

}
