package sec01_nested_class;

public class NestedTest {

	private static Object object;

	public static void main(String[] args) {
		// 인스턴스 멤버 클래스 객체 생성
		
		A a = new A(); //외부 클래스 객체 생성
		A.B b = a.new B(); // 내부 클래스 객체 생성
		
		b.field1 = 10;
		b.method1();
		
		//정적인 멤버 클래스 사용
		A.C.field2 = 10;
		A.C.method2();
		
		A.C c = new A.C();
		c.field1 = 5;
		c.method1();
		
		a.method();
		
	}

}
