package sec01;

public class LogicalOp {

	public static void main(String[] args) {
		int x = 21;
		boolean result, result2;

		result = (x >= 10 && x <= 20);
		System.out.println("(x >= 10 && x <= 20) = " + result);

		result = (x % 2 == 0); // x가 2의 배수인지 알아내는 조건
		System.out.println("x가 2의 배수 인가요? " + result);

		result = (x % 2 == 0 || x % 3 == 0);
		System.out.println("x가 2의 배수 또는 3의 배수 인가요? " + result);

		// ch의 값이 소문자인지 대문자인지 판단하는 조건
		char ch = 'h';
		result = (ch >= 'a' && ch <= 'z');
		result2 = (ch >= 'A' && ch <= 'Z');
		System.out.println("ch의 값이 소문자 인가요? " + result);
		System.out.println("ch의 값이 대문자 인가요? " + result2);

	}

}
