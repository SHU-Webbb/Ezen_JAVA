package sec05_final_method;

public class Car {
	int speed;
	
	public void speedUp() {
		speed += 10;
	}

	/*
	 * final 메소드 => 자손에서 override 할 수 없음.
	 */
	public final void stop() {
		System.out.println("차를 멈춘다");
		speed = 0;
	}
}

class SportsCar extends Car {
	// overriding 메서드
	public void speedUp() {
		speed += 10;
	}
	
//	public void stop() {
//		System.out.println("스포츠카를 멈춘다");
//		speed = 0;
//	}
//	
}
