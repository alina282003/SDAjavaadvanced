package vehicles;

public abstract class Vehicle implements SoundMaker{
	
	private String color;
	private boolean moving;
	
	public Vehicle(String color) {
		this.color = color;
	}

	public abstract void horn();

	public String getColor() {
		return color;
	}

	public boolean isMoving() {
		return moving;
	}

	public void setMoving(boolean moving) {
		this.moving = moving;
	}

	@Override
	public void makeSound() {
		horn();
	}
	
}
