package sec14.final_field;


public class StaticFinalTest {
	
	static final double PI = 3.141592; //상수선언

	public static void main(String[] args) {
		
		System.out.println("반지름이 5.0인 원의 면적은 " + PI * Math.pow(5.0,2));
//		PI = 3.14; // 수정 불가능

		
	}

}
