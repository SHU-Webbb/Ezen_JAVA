package sec06_protected.package2;

import sec06_protected.package1.A;

public class D extends A {
	public D() {
		super(); // 조상(A클래스)의 생성자 호출
		this.field = "abc"; // 자손클래스에서 protected 멤버 사용가능
		this.method(); // 자손클래스에서 protected 멤버 사용가능
	}
}
