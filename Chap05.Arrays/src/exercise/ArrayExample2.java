package exercise;

public class ArrayExample2 {

	public static void main(String[] args) {

		int[][] arr = new int[4][4];
		int i = 0;
		int k = (arr.length * arr[i].length);

		for (i = 0; i < arr.length; i++) {

			int j = 0;

			for (j = 0; j < arr[i].length; j++) {
				arr[i][j] = k--;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
