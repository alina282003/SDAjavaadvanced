package vehicles;

public class Main {

	public static void main(String[] args) {
		
		Motor motorDiesel = new Diesel(200, "Combustibil diesel");
		Motor motorBenzina = new Benzina(300, "Combustibil benzina");
		
		Car dacia = new Dacia("rosie", "berlina", 4, 4, motorBenzina);
		Car bmw = new Bmw("negru", "coupe", 4, 3, motorDiesel);
		
//		dacia.startEngine();
//		dacia.startDriving();
		
		Car myBicycle = new Bmw("carbon", "bicicleta", 2, 0, null);
		
//		dacia.isCarMoving();
//		bmw.startEngine();
//		bmw.startDriving();
//		dacia.stopDriving();
		
		Car [] cars = {dacia, bmw};
		
		for(int index = 0; index < cars.length; index++) {
			cars[index].makeSound();
		}
		Radio radio = new Radio();
		radio.makeSound();
		
		
//		dacia.stopEngine();
//		dacia.isCarMoving();
//		
//		bmw.isCarMoving();
//		bmw.stopDriving();
//		bmw.stopEngine();
//		bmw.isCarMoving();
//		
//		myBicycle.startEngine();
		
	}

}
