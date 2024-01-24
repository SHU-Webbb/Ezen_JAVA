package sec03.constructor_declare;

public class CarTest {

	public static void main(String[] args) {
		Car myCar1 = new Car();
		
		System.out.println("제조회사는 " + myCar1.company);
		System.out.println("모델은 " + myCar1.model);
		System.out.println("색상은 " + myCar1.color);
		
	
		Car myCar2 = new Car("KIA","K7");
		
		System.out.println("제조회사는 " + myCar2.company);
		System.out.println("모델은 " + myCar2.model);
		System.out.println("색상은 " + myCar2.color);
		
	}

}
