package sec03_anonymous;

// Person 클래스를 상속받아 이름이 존재한 클래스 선언
class Student extends Person {

	@Override
	void wakeup() {
		System.out.println("학생은 6시에 일어납니다.");
	}
	
}
public class AnonymousTest {

	Person s = new Student(); //인스턴스 멤버
	
	//필드의 초기값으로 익명의 클래스 생성.
	//참조변수를 선언하는 것과 마찬가지임.
	Person field1 = new Person() {
		
		int wakeup_time;
		
		void work() {
			System.out.println("출근합니다.");
		}
		
		@Override
		void wakeup() {
			super.wakeup();
		}
		
	};
	
	void method1() {
		field1.wakeup();
		
		//로컬메서드 내에 익명의 클래스 생성
		Person lv = new Person() {
			
			@Override
			void wakeup() {
				System.out.println("8시에 일어납니다.");
			}
		};
		
		lv.wakeup();//method1() 호출시 실행됨.
		
	}
	
	public static void main(String[] args) {
		AnonymousTest test = new AnonymousTest();
			
		test.s.wakeup();
		
		test.field1.wakeup();
		
		test.method1();
		
	}

}
