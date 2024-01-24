package sec01.intheritance_Basic;

class Vehicle {
	String color;
	int speed;
	int tireSize;
	
	void attributes() {
		System.out.println("Color : " + color);
		System.out.println("Speed : " + speed);
		System.out.println("tireSize : " + tireSize);
	}
}
class Car extends Vehicle {
	int CC;
	int gears;
	
	void attributesCar() {
		System.out.println("자동차 Color : " + color);
		System.out.println("자동차 Speed : " + speed);
		System.out.println("자동차 tireSize : " + tireSize);
		System.out.println("자동차 엔진크기 : " + CC);
		System.out.println("자동차 기어수 : " + gears);
	}
}
public class VehicleTest {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.color = "blue";
		c1.speed = 250;
		c1.tireSize = 20;
		
		c1.attributes();
		
		c1.CC = 2000;
		c1.gears = 5;
		c1.attributesCar();
		

	}

}
