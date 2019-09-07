package collections;

import java.util.List;
import java.util.Stack;
import java.util.ArrayList;
import java.util.LinkedList;;

public class MainCollections {

	public static void main(String[] args) {

		// here we work with set
		SetManager manager = new SetManager();

		Chocolate chocolateMilkaWhite = new Chocolate("Milka", "white");
		manager.addChocolate(new Chocolate("Milka", "white"));
		manager.addChocolate(new Chocolate("Milka", "white"));
		manager.addChocolate(chocolateMilkaWhite);

		manager.printChocolateSet();

		manager.addChocolate(new Chocolate("Heidi", "black"));

		manager.printChocolateSet();

		// from this line below will work with maps
		System.out.println("-----------------------------------------------");
		System.out.println("-------------Maps------------------------------");

		MapManager mapManager = new MapManager();

		Person myPerson = new Person("Andrei", 38, "1234", "masculin");
		mapManager.addElement(myPerson.getCnp(), myPerson);
		mapManager.printMap();
		myPerson.setAge(36);
		mapManager.replaceElement(myPerson.getCnp(), myPerson);
		mapManager.printMap();
		mapManager.deleteElement(myPerson.getCnp(), myPerson);
		mapManager.printMap();

//		Person newPerson = new Person("Andrei", 36, "1234", "masculin");
//		mapManager.replaceElement(myPerson.getCnp(), newPerson);
//		
//		//Other variant to change person age and replace in map
//		Person otherPerson = new Person(myPerson.getName(), 36, myPerson.getCnp(), myPerson.getGender());
//		

//		List<String> personNames = new Stack<String>();
//		
//		personNames.add("Sebastian");
//		personNames.add("Anca");
//		personNames.add("Vasile");
//		personNames.add("Dacian");
//		personNames.add("Vasile");
//		
//		ListUtils.printList(personNames);
//		
//		while (personNames.contains("Vasile")) {
//			personNames.remove("Vasile");
//		}
//		ListUtils.printList(personNames);
//		personNames.set(2, "Alina");
//		System.out.println(personNames);
//				
//		personNames.clear();
//		ListUtils.printList(personNames);
//		
//		personNames = null;
//		personNames.isEmpty();

//		
//		personNames.remove("Vasile");
//		System.out.println(personNames);
//		personNames.remove(3);
//		personNames.add(3, "Alina");
//		System.out.println(personNames);
//		
//		personNames.remove(3);
//		personNames.remove("Alina");
//		System.out.println(personNames);
//		
//		
//		personNames.add(0, "Alina");
//		System.out.println(personNames);

	}

}
