package sec02;

/*
 * 사용자의 타입 구분
 * 0: 일반 사용자, 1: 관리자, 2: 손님
 */

public class SwitchExample {

	public static void main(String[] args) {
		int user_type = 2;

		switch (user_type) {
		case 0:
			System.out.println("일반 사용자로 로그인하였습니다.");
			break;
		case 1:
			System.out.println("관리자로 로그인하였습니다.");
			break;
		case 2:
			System.out.println("손님로 로그인하였습니다.");
			break;
		default:
			System.out.println("잘못된 사용자입니다.");
		}
	}
}
