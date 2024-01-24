package sec02;

public class ArrayEx2 {

	public static void main(String[] args) {
		double[] arr1 = new double[3];

		arr1[0] = 3.5;
		arr1[1] = 4.5;
		arr1[2] = 3.8;
		// arr1[3] = 3.2; //Index out of bounds Exception 범위에서 벗어난 인덱스 지정 에러

		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}

		// char형 배열

		char[] chArr = { 'P', 'r', 'o', 'g', 'r', 'a', 'm' };

		for (int i = 0; i < chArr.length; i++) {
			System.out.println(chArr[i]);
		}

		// char 배열과 문자열
		String str = new String(chArr);
		System.out.println("str = " + str);

		char[] tmp = str.toCharArray();
		for (int i = 0; i < tmp.length; i++) {
			System.out.println(tmp[i]);
		}

	}

}
