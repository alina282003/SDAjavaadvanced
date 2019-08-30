package vehicles;

public abstract class Car extends Vehicle {

	private String model;
	private int numberOfWheels;
	private int numberOfDoors;
	private Motor engine;

	public Car(String color, String model, int numberOfWheels, int numberOfDoors, Motor engine) {
		super(color);
		this.model = model;
		this.numberOfWheels = numberOfWheels;
		this.numberOfDoors = numberOfDoors;
		this.engine = engine;
	}

	public void startEngine() {
		if (engine != null) {
			engine.start();
		} else {
			System.out.println("This vehicle does not have an engine");
		}
	}

	public void startDriving() {
		setMoving(true);
		System.out.println("The car model: " + model + " has started driving");
	}

	public void stopDriving() {
		setMoving(false);
		System.out.println("The car model: " + model + " has stoped driving");
	}

	public void stopEngine() {
		engine.stop();
	}

	public void isCarMoving() {
		System.out.println("Car " + model + " is moving: " + isMoving());
	}

}
