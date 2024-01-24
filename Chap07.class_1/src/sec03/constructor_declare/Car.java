package sec03.constructor_declare;

public class Car {
	//필드 (멤버변수)
	String company = "현대자동차";
	String model = "소나타";
	String color = "흰색";
	int maxSpeed = 250;
	int speed;
	
	//생성자
	//기본 생성자
	Car() { } 
	
	Car(String c, String m) {
		// 멤버 변수 color에 입력 매개변수 c를 저장
		company = c;
		model = m;
	}

}
