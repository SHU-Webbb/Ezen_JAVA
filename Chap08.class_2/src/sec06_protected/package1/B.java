package sec06_protected.package1;

public class B {
	public void method() {
		A a = new A(); //다른 패키지내에서 protected 생성자 사용불가능
		a.field = "abc"; //다른 패키지내에서 protected 멤버 사용 불가능
		a.method(); // 다른 패키지내에서 protected 메소드 사용 불가능.
	}
	

}
