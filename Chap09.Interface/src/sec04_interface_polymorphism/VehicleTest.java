package sec04_interface_polymorphism;

interface Vehicle {

	public void run();
}

class Bus implements Vehicle {

	@Override
	public void run() {
		System.out.println("버스가 달립니다.");

	}

}

class Taxi implements Vehicle{

	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
		
	}
	
}

public class VehicleTest {

	public static void main(String[] args) {
		
		Vehicle v1 = new Bus();
		move(v1);
		
		Taxi t1 = new Taxi();
		move(t1);
		
		
	
		
	}
	
	public static void move(Vehicle v) {
		v.run();
	}
}
