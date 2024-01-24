package sec05.constructor_overloading;

class Car {
	//필드 (멤버변수)
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	int speed;
	
	//생성자
	//기본 생성자
	Car() { 
		// 입력 매개변수가 없을 경우 멤버 변수에 기본적인 값을 설정, 첫번째 문장에서만 사용 가능
		
		this("소나타","흰색",250);
	} 
	
	Car(String model){
		this.model = model;
	}
	Car(String model,String color){
		this.model = model;
		this.color = color;
	}
	Car(String model,String color,int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	}


public class CarTest {
	
	

	public static void main(String[] args) {
		
		Car car1 = new Car();
		System.out.println("car1.company = "+ car1.company);
		System.out.println("car1.model = "+ car1.model);
		System.out.println("car1.color = "+ car1.color);
		System.out.println("car1.color = "+ car1.maxSpeed);
		
		System.out.println();
		
		Car car2 = new Car("소나타");
		System.out.println("car2.company = "+ car2.company);
		System.out.println("car2.model = "+ car2.model);
	
		System.out.println();
		
		Car car3 = new Car("그랜저","흰색");
		System.out.println("car3.company = "+ car3.company);
		System.out.println("car3.model = "+ car3.model);
		System.out.println("car3.color = "+ car3.color);
		
		System.out.println();
		
		Car car4 = new Car("산타페","검정",250);
		System.out.println("car4.company = "+ car4.company);
		System.out.println("car4.model = "+ car4.model);
		System.out.println("car4.color = "+ car4.color);
		System.out.println("car4.color = "+ car4.maxSpeed);
				
				
	}
	

}
