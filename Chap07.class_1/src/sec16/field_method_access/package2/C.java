package sec16.field_method_access.package2;

import sec16.field_method_access.package1.A;

public class C {

	public C() {
		A a = new A();

		a.field1 = 10; // public 같은 패키지 안에서 사용 가
		//a.field2 = 10; // default 다른 패키지 안에서 사용 불가능
		//a.field3 = 10; // private 다른 클래스,패키지에서 사용 불가능

		a.method1(); // public 같은 패키지 안에서 사용 가
		//a.method2(); // default 다른 패키지 안에서 사용 불가능
		//a.method3(); // private 다른 클래스,패키지에서 사용 불가능

	}

}
