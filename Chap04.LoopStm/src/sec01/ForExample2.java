package sec01;

public class ForExample2 {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i += 2) {
			System.out.println(i);
		}
		
		//i값 출력
		System.out.println();// i는 for문 내에서 선언된 변수이므로 사용할 수 없다.
		
		for (int j = 10; j > 0; j--) {
			System.out.println(j);
		}
		

	}

}
