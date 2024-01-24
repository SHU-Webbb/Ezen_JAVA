package sec02;

/*
 * 회원의 등급을 구분하는 예제
 * s, s : 최우수 회원
 * A, a : 우수 회원
 * B, b : 일반 회원
 * 기타 : 손님
 */
public class SwitchExample2 {

	public static void main(String[] args) {
		char member_grade = 'e';

		switch (member_grade) {
		case 'S':
		case 's':
			System.out.println("최우수 회원입니다.");
			break;
		case 'A':
		case 'a':
			System.out.println("우수 회원입니다.");
			break;
		case 'B':
		case 'b':
			System.out.println("일반 회원입니다.");
			break;
		default:
			System.out.println("손님입니다.");
		}

	}

}
