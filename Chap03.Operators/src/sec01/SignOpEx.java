package sec01;

import javax.print.DocFlavor.BYTE_ARRAY;

public class SignOpEx {

	public static void main(String[] args) {
		int a = -100;
		
		int result1 = +a;
		int result2 = -a;
		
		System.out.println("a= " + a);
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		System.out.println(result1+result2);
		
		short s = 100;
		
		//short s1 = -s; // short 값에 -를 붙이면 -1이 곱해지면서 int타입으로 변환됨. 그래서 오류가 남
		int s1 = -s;
		
				
		
		

	}

}
