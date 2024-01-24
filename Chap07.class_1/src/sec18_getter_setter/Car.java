package sec18_getter_setter;

public class Car {

	// 멤버 변수
	int speed1; // 외부에서 사용 가능
	private int speed; // 클래서 내부에서만 사용 가능
	private boolean stop;

	// 메소드
	// Getter : 이 객체의 멤버 변수 값을 알려주는 역할
	int getSpeed() {
		return speed;
	}

	void setSpeed(int speed) {
		if (speed < 0) {
			this.speed = 0;
		} else {
			this.speed = speed;
		}
	}
	//boolean 타입의 Getter
	boolean isStop() {
		return stop;
	}
	
	void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
}
