package exercise;

public class Ex2 {

	public static void main(String[] args) {

		int f = 100; // 화씨 온도
		float c = 0;
		c = (5f / 9) * (f - 32);
//		c = (int) (c * 1000f)/1000f; //소수 이하 셋째자리까지 구하기
		c = (int)((c * 1000f)+0.5)/1000f;//소수 네째자리에서 반올림
		System.out.println("화씨온도 : " + f);
		System.out.println("섭씨온도 : " + c);

		// 섭씨온도를 계산하는 프로그램을 작성
		// 화씨온도 = 5/9 *(화씨온도 -32)

	}

}
