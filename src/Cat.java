
public class Cat extends Animal{

	private int mood = 0;
	private int energy = 0;
	private int hunger = 0;
		
	private void meow() {
		System.out.println("meow");
	}
		
	public void feed() {
		mood++;
		energy++;
		hunger--;
		System.out.println("Inside feed: Cat mood: " + mood + ", energy: " + energy + ", hunger: " + hunger);
		meow();
		
	}
		
	public void play() {
		mood++;
		energy--;
		hunger++;
		System.out.println("Inside play: Cat mood: " + mood + ", energy: " + energy + ", hunger: " + hunger);
		meow();
	}
	
	public void sleep() {
		hunger++;
		energy++;
		System.out.println("Inside sleep: Cat mood: " + mood + ", energy: " + energy + ", hunger: " + hunger);
	}

	@Override
	public void makeSound() {
		System.out.println("meow meow");
	}
		
}
