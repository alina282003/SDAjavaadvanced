package interfaces;

public class Circle implements Shape {

	private int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public void calculateSurface() {
		System.out.println("Surface of circle is: " + (Math.PI * radius * radius));
	}

	@Override
	public void calculatePerimeter() {
		System.out.println("Permiter of circle is: " + (Math.PI * radius * 2));
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public void print() {
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "The Circle with radius: " + radius;
	}
	

}
