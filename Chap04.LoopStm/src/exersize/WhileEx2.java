package exersize;

public class WhileEx2 {

	public static void main(String[] args) {
		// 1~10까지 3또는 5의 배수의 합
		int i = 1;
		int sum = 0;

		while (i <= 10) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum = i + sum;
			}
			i++;
		}
		System.out.println(sum);
	}
}
