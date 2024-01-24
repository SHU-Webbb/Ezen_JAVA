package sec01_nested_class;

//외부 클래스 (Outer class)
public class A {

	A() {
		System.out.println("A 객체가 생성됨.");
	}

	// 인스턴스 멤버 클래스
	public class B {
		B() {
			System.out.println("B 객체가 생성됨.");
		}

		int field1;
		static int field2; // 사용할 수 없음.

		void method1() {

		}
	}

	// 정적인 멤버 클래스
	static class C {
		C() {
			System.out.println("C 객체가 생성됨.");
		}

		int field1;
		static int field2;

		void method1() {

		}

		static void method2() {

		}
	}

	// 로컬 클래스
	void method() {
		// 메서드 내에서만 사용할 수 있음.
		class D {
			D() {
				System.out.println("D 객체를 생성합니다.");
			}

			int feild1;

			void method1() {

			}

			static int feild2; //사용 불가능
			static void method2() {  //사용 불가능
			}
		}
		
		D d = new D();
		d.feild1 = 3;
		d.method1();
	}
}
