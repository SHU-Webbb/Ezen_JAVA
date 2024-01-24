package sec09.method_call;

public class Car {
	//멤버 변수
	String model;
	int speed;
	
	//생성자
	Car(String model){
		this.model = model;
	}
	
	Car(int speed){
		this.speed = speed;
	}
	
	//메소드
	
	void setSpeed(int speed) {
		this.speed = speed;   // 객체를 만든 후 스피드를 변경 할 때 사용
		
	}
	//자동차가 달리는 기능
	void run() {
		for (int i =0; i <=50; i+=10) {
			setSpeed(i); //내부 메소드 호출
			System.out.println(this.model + "가 시속 "+ speed + "km로 달립니다.\n");
		}
	}
}
