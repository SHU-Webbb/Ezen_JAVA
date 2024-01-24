package exercise;

import java.util.*;

public class HashSetTest {
	static int num;
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		HashSet<String> ps = new HashSet<>();

		Loop1: while (true) {
			menuDisplay();

			num = input.nextInt();

			switch (num) {
			case 1:

				addMember(ps);

				break;

			case 2:

				deletMember(ps);

				break;

			case 3:

				serchMember(ps);

				break;

			case 4:
				printMember(ps);

				break;

			case 0:
				System.out.println("종료합니다.");
				break Loop1;

			default:
				System.out.println("메뉴를 잘못 입력하였습니다.");
			}

		}

	}

	private static void printMember(HashSet<String> ps) {
		Iterator<String> it = ps.iterator();
		System.out.println("회원수 : " + ps.size());
		System.out.println("<<<회원 목록>>>");
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();

	}

	private static void serchMember(HashSet<String> ps) {
		System.out.println("검색할 회원명을 입력하세요 :");
		String name = input.next();

		if (ps.contains(name)) {
			System.out.println("존재합니다.");
		} else {
			System.out.println("존재하지 않습니다.");
		}

	}

	private static void deletMember(HashSet<String> ps) {
		System.out.println("삭제할 회원명을 입력하세요 :");
		String name = input.next();
		boolean result = ps.remove(name);
		if (result) {
			System.out.println("해지되었습니다.");
			System.out.println("회원명 : " + name);
		} else {

			System.out.println("해지할 회원이 존재하지 않습니다.");
		}

	}

	public static void menuDisplay() {
		System.out.println("<메뉴>");
		System.out.print("1:추가 2:삭제 3:검색 4:목록 0:종료");

	}

	private static void addMember(HashSet<String> ps) {
		System.out.print("회원명을 입력하세요 :");
		String name = input.next();
		ps.add(name);
	}

}
