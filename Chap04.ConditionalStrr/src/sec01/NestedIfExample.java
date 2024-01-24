package sec01;

import java.awt.im.InputMethodHighlight;
import java.util.Scanner;

/*
 * score 정수변수에 0~100 사이의 임의의 정수를 입력 받는다.
 * 
 */
public class NestedIfExample {

	public static void main(String[] args) {
		// int score = 102;
		String grade = "";
		Scanner input = new Scanner(System.in);
		System.out.print("0~100사이의 정수를 입력해 주세요 : ");
		int score = input.nextInt();

		// 정수를 입력 받아서 0~100 사이인지 판단

		if (score >= 0 && score <= 100) {
			if (score >= 90) {
				if (score >= 95) {
					grade = "A+";
				} else {
					grade = "A0";
				}
			}else if (score >= 80) {
				if (score >= 85) {
					grade = "B+";
				} else {
					grade = "B0";
				}
			}else {
				grade = "C0";
			}
		} else {
			System.out.println("점수를 잘못 입력 하였습니다.\n");
		}
		System.out.printf("당신의 등급은 %s입니다\n", grade);
	}

}
