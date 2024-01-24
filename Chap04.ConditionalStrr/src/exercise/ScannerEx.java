package exercise;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// 키보드를 통해서 프로그램에 데이터를 입력하는 기능
		Scanner input = new Scanner(System.in); // System.in 표준입력장치 키보드로 데이터를 받는다.
								// Scanner는 프로그램
		
		System.out.print("정수를 입력해 주세요: ");
		int num = input.nextInt();  // 키보드로 정수를 입력
		System.out.println("입력한 숫자는 " + num);
		
		System.out.print("문장을 입력해 주세요 : ");
		// next() - 한 단어만 입력
		// nextLine () - 입력한 전체형을 가져옴.
		String str = input.next();
		System.out.println("입력한 내용은 " + str);
	}

}
