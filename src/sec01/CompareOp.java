package sec01;

public class CompareOp {

	public static void main(String[] args) {
		int a = 10;
		int b = 7;

		System.out.println("a =" + a);
		System.out.println("b =" + b);
		boolean result = (a == b);
		System.out.println("(a==b):" + result);

		result = (a != b);
		System.out.println("(a!=b):" + result);

		result = (a >= b);
		System.out.println("(a>=b):" + result);

		char c1 = 'A';
		char c2 = 'B';
		result = (c1 < c2);
		System.out.println("(c1 < c2):" + result);

		// 부동 소수 비교
		float f1 = 10.0f;
		double d1 = 10.0;
		result = (f1 == d1);
		System.out.println("(10.0f1 == 10.0d1):" + result);

		f1 = 0.1f;
		d1 = 0.1; // double형 리터럴
		result = (f1 == d1);
		System.out.println("(0.1f == 0.1d):" + result);
		System.out.printf("d1=%19.17f\n", d1);
		System.out.printf("f1=%19.17f\n", f1); // float이 double로 변환되면서 부정확한숫자로 나타남
		
		
		//문자열 비교 
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		result = (str1 == str2);
		System.out.println(result);
		
		result = str1.equals(str2);
		System.out.println(result);
		
		
	}

}
