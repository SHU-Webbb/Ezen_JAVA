package sec07.using_method;

public class UsingMethod {

	public static void main(String[] args) {
		int[] arr1 = { 30, 56, 23, 65, 22 };

//		for (int i = 0; i < arr1.length; i++) {
//			System.out.print(arr1[i] + " ");
//		}
		dispArray(arr1);
		System.out.println();

		arr1[1] = 99;
//		for (int i = 0; i < arr1.length; i++) {
//			System.out.print(arr1[i] + " ");
//		}
		dispArray(arr1);	
		System.out.println();

		int temp = arr1[1];
		arr1[1] = arr1[2];
		arr1[2] = temp;
//		for (int i = 0; i < arr1.length; i++) {
//			System.out.print(arr1[i] + " ");
//		}
		dispArray(arr1);
		System.out.println();
	}

	public static void dispArray(int[] intArr) {
// 반환할 값이 없을때 void
		for (int i = 0; i < intArr.length; i++) {
			System.out.print(intArr[i] + " ");
		}
		System.out.println();
	}

}
