package exersize;

import java.util.Scanner;

public class DoWhileBreakEx {

	public static void main(String[] args) {
		int answer = 0; // 컴퓨터가 생각한 임의의 숫자
		int user = 0; // 사용자가 입력한 값

		// (1) 키보드 입력준비
		Scanner input = new Scanner(System.in);

		// (2) 컴퓨터가 1~100사이의 임의의 수 생각
		answer = (int) (Math.random() * 100) + 1;

		// (3) 반복적으로 사용자 값을 추출

		do {
			// (4) 사용자에게 숫자 입력 받기
			System.out.print("1~100 사이의 정수를 입력하세요 : ");
			user = input.nextInt();
			// (5)컴퓨터가 생각한 결과 사용자 입력값 비교

			if (user < answer) {
				System.out.println("더 큰 숫자를 입력하세요!");

			} else if (user > answer) {
				System.out.println("더 작은 수를 입력하세요!");
			} else if (user == answer) {
				System.out.println("정답입니다!!!");
				break; // 반복문 밖으로 빠져나간다.
			}

		} while (true);

	}
}