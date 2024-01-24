package sec03_overriding;

class Car {
	public void speedLimit() {
		System.out.println("최대속도는 200km/h입니다.");
	}
}
class Sonata extends Car {
	@Override
	public void speedLimit() {
		System.out.println("최대속도는 250km/h입니다.");
	}
	
}

public class CarTest {

	public static void main(String[] args) {
		Sonata car1 = new Sonata();
		car1.speedLimit();
		

	}

}
