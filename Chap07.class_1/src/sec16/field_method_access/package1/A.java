package sec16.field_method_access.package1;

public class A {
	//멤버변수
	public int field1; 
	int field2;//default 변수
	private int field3;
	
	//생성자
	public A() {
		//같은 클래스 내에서 다양한 제어자를 가진 변수 모두 사용 가능.
		field1 = 10;
		field2 = 10;
		field3 = 10;
		
		//같은 클래스 내에서 다양한 제어자를 가진 메소드 모두 사용 가능.
		method1();
		method2();
		method3();
	}
	
	//메소드
	public void method1 () {}
	void method2 () {}
	private void method3() {}
	
}	
