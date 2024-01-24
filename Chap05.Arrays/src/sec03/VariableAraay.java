package sec03;

public class VariableAraay {

	public static void main(String[] args) {
		int[][] intArr = { 
				{ 87, 90, 78 }, 
				{ 90, 99 }, 
				{ 67, 56, 98, 70 } 
		};

		for (int i = 0; i < intArr.length; i++) {
			for (int j = 0; j < intArr[i].length; j++) {
				System.out.print(intArr[i][j] + " ");
			}
			System.out.println();
		}

		//intArr[1][3] = 60; // 존재하지 않은 인덱스

	}

}
