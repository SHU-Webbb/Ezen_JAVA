package sec03_generic_method;

public class GenericMEthodTest {
	
	/*
	 * GenericMethod 예
	 * 
	 * 배열의 내용을 출력하는 메소드
	 */
	
	public static <E> void printArray(E[] arr) {
		for (E element : arr) {
			System.out.print(element + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		Integer[] intArr = {60, 50, 80, 70, 90};
		Character[] chArr = {'H', 'E','L','L','O'};
		
		printArray(intArr);
		
		printArray(chArr);
	}

}
