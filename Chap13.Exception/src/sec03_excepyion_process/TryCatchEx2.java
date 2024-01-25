package sec03_excepyion_process;

public class TryCatchEx2 {
	/*
	 * try-catch 흐름
	 */
	public static void main(String[] args) {
		System.out.println("1");
		System.out.println("2");

		try {
			System.out.println("3");
			System.out.println(0 / 0);
			System.out.println("4");
		} catch (ArithmeticException ae) {
			if (ae instanceof ArithmeticException)
				System.out.println("true");
			System.out.println("ArithmeticException");
		} catch (Exception a) {
			System.out.println("Exception");//모든 예외의 최고조상 Exception
		}
		System.out.println("6");

	}

}
