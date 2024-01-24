package sec02;

public class ArrayEx1 {

	public static void main(String[] args) {
		// 배열 선언 
		int[] scores;
		
		// 값을 저장하기 위한 공간 확보
		scores = new int[5];
		
		// 배열에 값을 저장
		scores[0] = 50;
		scores[1] = 60;
		scores[2] = 70;
		scores[3] = 80;
		scores[4] = 90;
		
		System.out.println("scores의 3번째 항목의 값 = "+ scores[2]);
		
		for(int i =0; i <5 ; i++) {
			System.out.println(scores[i]);
		}
	}

}
