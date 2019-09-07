package generics;

public class Age<T> {
	
	private T anything;
	private int age;
	
	public Age(T anything, int age) {
		this.anything = anything;
		this.age = age;
	}

	public String getAge() {
		return anything + " has age: " + age;
	}
	
	public void aging() {
		this.age++;
	}
	
	
}
