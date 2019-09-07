package collections;

public class Chocolate {

	private String name;
	private String color;

	public Chocolate(String name, String color) {
		this.name = name;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Chocolate [name=" + name + ", color=" + color + "]" + this.hashCode();
	}

	@Override
	public int hashCode() {
		return name.hashCode() + color.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Chocolate) {
		Chocolate other = (Chocolate) obj;
		return this.name.equals(other.name) && this.color.equals(other.color);
		}
		else return false;
		
	}

}
