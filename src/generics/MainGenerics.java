package generics;


import interfaces.Rectangle;

import interfaces.Circle;

public class MainGenerics {

	public static void main(String[] args) {
		
//		Pair<String, String> name = new Pair("Alina", "Noge");
//		
//		Pair<String, Integer> studentGrade = new Pair("Alina Noge", 10);
//		
//		int grade = studentGrade.getValue();
		
		Age<Circle> circleAge = new Age(new Circle(5), 2);
		circleAge.aging();
		circleAge.aging();
		circleAge.aging();
		circleAge.aging();
		circleAge.aging();
		System.out.println(circleAge.getAge());
		
		Age<Rectangle> rectangleAge = new Age(new Rectangle(2,3), 1);
		rectangleAge.aging();
		
		System.out.println(rectangleAge.getAge());
	}

}
