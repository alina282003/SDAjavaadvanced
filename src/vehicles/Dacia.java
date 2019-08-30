package vehicles;

public class Dacia extends Car{
	
	public Dacia(String color, String model, int numberOfWheels, int numberOfDoors, Motor engine) {
		super(color, model, numberOfWheels, numberOfDoors, engine);
	}

	@Override
	public void horn() {
		System.out.println("Tit tit");
	}
	
}
