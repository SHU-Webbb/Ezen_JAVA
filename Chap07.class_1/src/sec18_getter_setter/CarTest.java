package sec18_getter_setter;

public class CarTest {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		
		car1.speed1 = -10;
//		car1.speed = -10; 변경 안됨

		car1.setSpeed(-10);
		System.out.println("car1의 속도 = " + car1.getSpeed());
		
		car1.setStop(true);
		System.out.println("car1 이 정지상태인가요? " + car1.isStop());
		System.out.println("car1의 속도는 " + car1.getSpeed());
	}

}
