package sec02;

public class TwoDimArray {

	public static void main(String[] args) {
		int[][] scores = new int[3][3];

		scores[0][0] = 70;
		scores[0][1] = 80;
		scores[0][2] = 90;

		// 2차원 배열의 초기화(Initailization)
		int[][] points = {  
				{ 95, 90, 92 }, 
				{ 90, 85, 90 }, 
				{ 78, 77, 80 }
		};

		for (int i = 0; i < points.length; i++) {// 행별로 반복
			for (int k = 0; k < points[i].length; k++) { // 각 행의 열별로 반복
				System.out.print(points[i][k] + " ");
			}
			System.out.println();
		}
		

	}

}
