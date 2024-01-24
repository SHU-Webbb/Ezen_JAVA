package sec08_typecasting;

class Car {
	String color;
	
	void drive() {
		System.out.println("자동차가 달립니다.");
	}
	
	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
}

class FireEngine extends Car {
	void water() {
		System.out.println("물을 뿌립니다.");
	}
}

class Ambulance extends Car {
	void siren() {
		System.out.println("사이렌을 울립니다.");
	}
}

public class CarTest {

	public static void main(String[] args) {
		//조상 타입의 참조변수 선언
		Car car = null;
		
		//자손 타입의 참조변수 선언
		FireEngine fe = new FireEngine();
		fe.water();
		
		car = fe; //자손타입의 객체 -> 조상타입의 참조변수에 대입
		          // Upcasting.명시적 형변환을 하지 않아도 됨
				  //car = (Car)fe; 하지 않아도 됨
		//car.water(); // 자손의 메소드를 사용할 수 없음.
		
		FireEngine fe2 = (FireEngine)car; //조상타입 -> 자손타입에 대입할 때.
							  //Downcasting. 명시적 형변환 필요
		
		fe2.water();
		
		
}

}
