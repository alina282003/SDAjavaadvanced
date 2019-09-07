package collections;

public class Person {

	private String name;
	private int age;
	private String cnp;
	private String gender;
	
	public Person(String name, int age, String cnp, String gender) {
		this.name = name;
		this.age = age;
		this.cnp = cnp;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCnp() {
		return cnp;
	}

	public void setCnp(String cnp) {
		this.cnp = cnp;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", cnp=" + cnp + ", gender=" + gender + "]";
	}
	
	
}
