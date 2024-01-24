package sec02;

public class FloatExample {

	public static void main(String[] args) {
		float f1 = 3.14f; // float형 숫자를 표현할때는 반드시 f접미사를 붙여줌.
		double d1 = 3.14;
		
		System.out.println("float f1 = "+ f1);
		System.out.println("double d1 = "+ d1);
		
		float f2 = 0.12345687698583434f;
		double d2 = 0.12345687698583434;
		
		System.out.println("float f2 "+ f2);
		System.out.println("double d2= "+ d2);
		
		//소수의 지수적 표현
		double var2 = 3e6; // 3 * 10^6
		double var3 = 3e-3; // 3 * 10^-3
		System.out.println(var2);
		System.out.println(var3);
		
	}

}
