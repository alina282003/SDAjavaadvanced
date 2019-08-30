package vehicles;

public abstract class Motor {

	private int horsePower;
	private String name;
		
	public Motor(int horsePower, String name) {
		this.horsePower = horsePower;
		this.name = name;
	}

	public void start() {
		System.out.println("Motor " + name + " has started");
	}
	
	public void stop() {
		System.out.println("Motor " + name + " has stoped");
	}
	
}
