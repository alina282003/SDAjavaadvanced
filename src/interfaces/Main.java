package interfaces;

import java.util.Scanner;

import utils.ScannerUtils;

public class Main {

	public static void main(String[] args) {
		Circle smallCircle = new Circle(1);
		Circle largeCircle = new Circle(10);

		Rectangle square = new Rectangle(2, 2);
		Rectangle rectangle = new Rectangle(2, 4);

		Shape circleShape = new Circle(5);
		Shape rectangleShape = new Rectangle(3, 5);

		Triangle triangle = new Triangle();

		Shape[] groupOfShapes = { smallCircle, largeCircle, square, rectangle, circleShape, rectangleShape };

		for (int i = 0; i < groupOfShapes.length; i++) {
			groupOfShapes[i].calculatePerimeter();
			groupOfShapes[i].calculateSurface();
			groupOfShapes[i].draw();
		}
		
		
		Scanner scanner = ScannerUtils.getScanner();
		
		
		
		
		
		
		ScannerUtils.closeScanner();

	}

}
