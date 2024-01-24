package sec17_Singleton;

public class Singleton {
	
	// 자신의 클래스 내에서 객체를 만들어 준다.
	private static Singleton singleton = new Singleton();

	// private 제어자를 가진 생성자
	private Singleton() {
		
	}
	
	//만들어진 객체를 제공하는 메소드
	static Singleton getInstance() {
		
		return singleton; //위에서 생성한 singleton 객체를 반환
	}
}
