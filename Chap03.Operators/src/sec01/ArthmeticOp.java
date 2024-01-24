package sec01;

public class ArthmeticOp {

	public static void main(String[] args) {
		int v1 = 14;
		int v2 = 5;
		int result = 0; // 연산 할때 같은 타입으로하면 결과도 같은 타입으로 나옴

		result = v1 + v2;
		System.out.println("v1 + v2 = " + result);

		result = v1 - v2;
		System.out.println("v1 - v2 = " + result);

		result = v1 * v2;
		System.out.println("v1 * v2 = " + result);

		result = v1 / v2;
		System.out.println("v1 / v2 = " + result);

		result= v1 % v2;
		System.out.println("v1 %v2 = " + result);
		
		double result2 = (double)v1/v2;
		System.out.println("v1/v2 = " + result2);

		// 산술 변환
		int i = 10;
		float f = 20.0f;
		
		float result3= i + f;//i 변수가 float 타입으로 자동 변환되어 계산됨.
							// float + float = flat 결과 산출됨.
		/*
		 * int 보다 작은 타입의 산술연산
		 * byte, short, char
		 * 
		 */
		short s = 100;
		byte b = 50;
		
		int result4 = s + b;
		short s2 = (short)(s + b); // 결과를 short에 저장하려면 short로 타입변환 필요
		
		// char 타입의 산술 연산
		char c1 = 'A' + 1; //문자 리터럴에 수를 더하면 char 타입이 유지됨.
		System.out.println("c1=" + c1);
		
		char c2 = 'A';
		int result5 = c2 + 1; // char형 변수가 산술연산에 참여시 int형으로 변환됨.
		
		c2 = ++c1; // char형의 변수를 증감연사자 사용시 type이 그대로 유지됨
		System.out.println(c2);
		
		//문자 리터럴의 산술 연산
		int val1 = 'B' - 'A';
		System.out.println(val1);
		
		val1 = '2' - '0';
		System.out.println(val1); // '2' -> 코드값 50, '0' -> 코드값 48
		
		//나머지 연산결과 부호
		System.out.println("10 % 8 = " + (10 % 8));
		System.out.println("10 % -8 = " + (10 % -8));
		System.out.println("-10 % 8 = " + (-10 % 8));
		System.out.println("-10 % -8 = " + (-10 % -8));
		
		
	}

}
