package sec11_instance_member;

class Car {
	String model;
	int    speed;
	
	Car(String model) {
		this.model = model;
	}
	
	Car(String model, int speed){
		this.model = model;
		this.speed = speed;
	}
	
	// 메소드
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		for (int i=10; i<=50; i+=10) {
			setSpeed(i);
			System.out.println(this.model+"가 달립니다.(시속:"+this.speed+"km/h)");
		}
	}
}

public class CarTest {

	public static void main(String[] args) {
		Car car1 = new Car("소나타",50);
		Car car2 = new Car("그랜져",60);
		
		System.out.println("car1 : 모델명 = " + car1.model );
		System.out.println("car1 : 속도 = " + car1.speed );
		
		System.out.println("car1 : 모델명 = " + car2.model );
		System.out.println("car1 : 속도 = " + car2.speed );
		
	}
}
