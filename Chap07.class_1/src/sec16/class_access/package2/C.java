package sec16.class_access.package2;

import sec16.class_access.package1.B;
public class C {
	//A a; //default제어자이므로 다른 패키지 내의 클래스는 사용할 수 없음.
	B b;   // public 으로 지정된 클래스는 다름 패키지에서 import 해서 사용.
}
