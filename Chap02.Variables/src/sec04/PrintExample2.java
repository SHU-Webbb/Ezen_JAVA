package sec04;

public class PrintExample2 {

	public static void main(String[] args) {
		float f1 = .10f; // 0.10 의 의미
		float f2 = 1e1f; // 1 * 10^1 = 10.0
		double d = 1.23456789;

		System.out.printf("f1=%f, %e\n", f1, f1);
		System.out.printf("f2=%f, %e\n", f2, f2);
		System.out.printf("d=%3.1f\n", d);
		System.out.printf("d=%8.1f\n", d);
		System.out.printf("d=%08.1f\n", d);
		System.out.printf("d=%-8.1f\n", d);
	}

}
