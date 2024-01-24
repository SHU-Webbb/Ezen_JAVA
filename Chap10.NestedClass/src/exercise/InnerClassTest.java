package exercise;

class Car {
	private String name;

	public Car(String name) {

		this.name = name;

	}

	class Tire {
		private int size;

		Tire(int size) {
			this.size = size;
		}

		void display() {
			System.out.println("자동차 : " + name + "\n타이어 크기 : " + size + "인치");
		}
	}
}

public class InnerClassTest {

	public static void main(String[] args) {

		Car a = new Car("포르쉐");
		Car.Tire b = a.new Tire(20);

		b.display();

		Car a1 = new Car("모닝");
		Car.Tire b1 = a1.new Tire(15);

		b1.display();

		Car a2 = new Car("아반테");
		Car.Tire b2 = a2.new Tire(16);

		b2.display();

	}

}
