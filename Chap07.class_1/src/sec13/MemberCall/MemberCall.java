package sec13.MemberCall;

public class MemberCall {
	
	int iv = 10; //인스턴스 변수
	static int cv = 20; //static(클래스) 변수
	
	
	// static 메소드
	static void staticMethod1() {
		System.out.println(cv);
		//System.out.println(iv); static 메소드는 객체를 생성하지 않고 사용하므로 
								// 인스턴스 변수 사용 불가능함.
		// static 메소드에서 인스턴스 변수를 사용하려면 객체 생성 후 사용 가능함.
		MemberCall mc1 = new MemberCall();
		System.out.println(mc1.iv);
	}
	
	// 인스턴스 메소드
	void instanceMethod1() {
		System.out.println(cv); // static 변수 사용가능
		System.out.println(iv); // 인스턴스 변수 사용가능
	}
	
	static void staticMethod2() {
		staticMethod1();
		//instanceMethod1(); //staticMethod 에서는 인스턴스 메소드 호출 불가능
	}
	
	void instanceMethod2() {
		staticMethod1();
		instanceMethod1();
	}
	
	public static void main(String[] args) {
		MemberCall.staticMethod1(); //인스턴스 없이 바로 호출 가능
		
		MemberCall mc = new MemberCall();
		mc.instanceMethod1();

	}

}
