package sec01_runtime_exception;

public class ArrayIndex {

	public static void main(String[] args) {
		int[] intArr = { 10, 20, 30, 40, 50 };

		//배열의 인덱스가 범위를 벗어난 값을 지정
		for (int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);
		}

	}

}
