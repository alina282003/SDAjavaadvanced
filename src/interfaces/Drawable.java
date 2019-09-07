package interfaces;

public interface Drawable {

	default void draw() {
		System.out.println("drawing " + this);
	}
		
}
