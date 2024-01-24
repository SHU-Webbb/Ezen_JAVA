package exercise;

public class SwapTest {

	// Generic 메소드
	public static <T> void swap(T first, T second) {
		T temp = first;
		first = second;
		second = temp;
		
		System.out.println("(a, b) = (" + first + "," + second + ")");
	}
	
	public static void main(String[] args) {
		swap(Integer.valueOf(15), Integer.valueOf(24));

		swap("hi", "순이");
	}

}
