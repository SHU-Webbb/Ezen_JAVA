package sec09_instanceof;

class Parent {

}

class Child extends Parent {

}

public class InstanceofEx {

	// instanceof 를 사용하지 않은 예
	public static void method1(Parent parent) {
		Child child = (Child) parent; // Downcasting
		System.out.println("method1(): Child 타입으로 변환 성공..");
	}

	// instanceof 를 사용한 예
	public static void method2(Parent parent) {
		//parent 참조병수가 Child 타입으로 변환 가능한지 판단.
		if (parent instanceof Child) {
			Child child = (Child) parent; // Downcasting
			System.out.println("method2(): Child 타입으로 변환 성공..");
		}else {
			System.out.println("method2(): Child 타입으로 변환할 수 없음..");
		}

	}

	public static void main(String[] args) {

		Parent parentA = new Child();
		System.out.println("Child 타입의 객체를 부모 참조변수에 대입");
		method1(parentA);

		System.out.println("부모 타입의 객체를 부모타입의 참조변수에 대입");
		Parent parentB = new Parent();
		method2(parentB);
		method1(parentB);

	}

}
