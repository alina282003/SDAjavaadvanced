package collections;

import java.util.HashMap;
import java.util.Map;

public class MapManager {
	
	private Map<String, Person> myMap = new HashMap<String, Person>();
	
	public void printMap() {
		System.out.println(myMap);
	}
	
	public void addElement(String key, Person value) {
		myMap.put(key, value);
	}
	
	public void deleteElement(String key, Person value) {
		myMap.remove(key, value);
	}
	
	public void replaceElement(String key, Person value) {
		myMap.replace(key, value);
	}
	
	
	
	

}
