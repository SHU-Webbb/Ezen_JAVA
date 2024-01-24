package sec02;

public class NestedWhileExample {

	public static void main(String[] args) {
		int i = 2; // 구구단의 단 수를 저장
		
		while (i<=9) { //9단까지 반복 수행
			
			int j = 1;
			while (j<=9) {// 각 구구단에 곱해지는 변수 선언
				System.out.printf("%d * %d = %d\n" , i , j , i*j);
				j++;
			}
			
			System.out.println();
			i++;
		}

	}

}
	