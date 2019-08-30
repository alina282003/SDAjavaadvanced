package vehicles;

public class Bmw extends Car{

	public Bmw(String color, String model, int numberOfWheels, int numberOfDoors, Motor engine) {
		super(color, model, numberOfWheels, numberOfDoors, engine);
	}

	@Override
	public void horn() {
		System.out.println("Beep beep");
	}
	
}
