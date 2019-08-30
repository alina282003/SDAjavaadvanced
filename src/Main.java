
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cat myCat = new Cat();
		
		Dog myDog = new Dog();
		
		Animal animal1 = new Cat();
		Animal animal2 = new Dog();
		
		Animal [] animals = {animal1, animal2};
		
		for(int i = 0; i < animals.length; i++) {
			animals[i].makeSound();
		}
		
		
		
//		myCat.sleep();
//		
//		myCat.play();
//		
//		myCat.feed();
//		
//		myCat.feed();
		
		
	}

}
