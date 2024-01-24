package exercise;

import java.util.Scanner;

public class SwitchEx1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int season = 0;
		System.out.println("현재 월을 입력해주세요. : ");
		String grade = " ";
		season = input.nextInt();

		switch (season) {
		case 3:
		case 4:
		case 5:
			grade = "봄";
			break;
		case 6:
		case 7:
		case 8:
			grade = "여름";
			break;
		case 9:
		case 10:
		case 11:
			grade = "가을";
			break;
		case 12:
		case 1:
		case 2:
			grade = "겨울";
			break;
		default:
			System.out.println("입력오류입니다.");
		}
		System.out.printf("현재 계절은 %s 입니다.",grade);
	}

}
