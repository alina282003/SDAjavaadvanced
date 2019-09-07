package collections;

import java.util.HashSet;
import java.util.Set;

public class SetManager {
	
	private Set<Chocolate> chocolateSet = new HashSet<Chocolate>();
	
	public void addChocolate(Chocolate chocolate) {
		chocolateSet.add(chocolate);
	}
	
	public void removeChocolate(Chocolate chocolate) {
		chocolateSet.remove(chocolate);
	}
	
	public void printChocolateSet() {
		System.out.println(chocolateSet);
	}
	

}
