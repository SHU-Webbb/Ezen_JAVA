package sec03;

import java.io.IOException;

public class DoWhileExample1 {

	public static void main(String[] args) throws IOException {
		int input = 0; // 키보드에서 입력된 글자를 코드로 저장하는 변수

		System.out.println("글자를 입력하세요 : ");
		System.out.println("입력을 마치려면 'x'를 입력하세요");
		do {
			input = System.in.read();
			System.out.print((char) input);

		} while (input != 'x');

		// while 문으로 수정하는 경우
		/*
		 * input = System.in.read(); while (input != 'x') { System.out.print((char)
		 * input);
		 * 
		 * input = System.in.read();
		 */
//		}
		System.out.println("프로그램 종료");
	}
}
