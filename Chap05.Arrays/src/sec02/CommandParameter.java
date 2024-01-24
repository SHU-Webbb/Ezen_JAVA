package sec02;

public class CommandParameter {

	public static void main(String[] args) {
		System.out.println("커멘드 라인 Argument : ");

		if (args.length < 2) {
			System.out.println("2개의 정수를 입력해주세요.");
		} else {
			for (int i = 0; i < args.length; i++) {

				System.out.println(args[i]);

			}
			// 커멘드 라인에서 2개의 수를 입력받아 덧셈 수행
			int num1 = Integer.parseInt(args[0]); // 문자열을 정수로 변환
			int num2 = Integer.parseInt(args[1]);

			System.out.println("num1 + num2 = " + (num1 + num2));
		}
	}
}