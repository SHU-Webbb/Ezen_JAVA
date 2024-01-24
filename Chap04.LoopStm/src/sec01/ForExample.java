package sec01;

public class ForExample {

	public static void main(String[] args) {

		for (int i = 1; i <= 1; ++i) {
			System.out.println(i);
		}

		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1~10까지의 합계 :" + sum);
	}

}
