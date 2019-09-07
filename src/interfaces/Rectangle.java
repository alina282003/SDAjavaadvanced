package interfaces;

public class Rectangle implements Shape {

	private int length;
	private int width;

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public void calculateSurface() {
		System.out.println("Surface of rectangle is: " + (length * width));
	}

	@Override
	public void calculatePerimeter() {
		System.out.println("Permiter of rectangle is: " + (2 * (length + width)));
	}

	@Override
	public String toString() {
		return "The Rectangle with length: " + length + " and width: " + width;
	}

}
