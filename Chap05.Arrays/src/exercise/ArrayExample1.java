package exercise;

/*
 * 로또 번호 생성 프로그램
 */
public class ArrayExample1 {

	public static void main(String[] args) {
		int index = 0;

		// (1) 숫자 45개를 저장할 배열 생성
		int[] lotto = new int[45];

		// (2) 위에서 선언한 배열에 1~45의 숫자를 차례로 저장
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;
			System.out.printf("%3d", lotto[i]);
			if (i % 6 == 5)
				System.out.println();
		}

		// (3) 배열의 내용을 섞는다.
		int temp = 0; // 배열의 첫번째 위치 값을 임시 저장
		for (int k = 0; k < 100; k++) {
			// lotto의 임의의 index 번호를 추출
			index = (int) (Math.random() * 45);

			// lotto 배열의 첫번째 요소와 임의의 위치의 값을 서로 교환
			temp = lotto[0];
			lotto[0] = lotto[index];
			lotto[index] = temp;

		}

		// 섞은 후의 배열 내용 출력
		System.out.println("\n\n");
		for (int i = 0; i < lotto.length; i++) {

			System.out.printf("%3d", lotto[i]);
			if (i % 6 == 5)
				System.out.println();
		}
			// (4) 배열 앞에서 6개의 번호만 출력
			System.out.println("\n생성된 로또번호: ");
			for (int i = 0; i < 6; i++) {
				System.out.printf("%3d ", lotto[i]);
			}

		}

	}


