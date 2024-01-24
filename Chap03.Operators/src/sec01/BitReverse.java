package sec01;

public class BitReverse {

	public static void main(String[] args) {
		int val1 = 10;
		int val2 = ~val1;
		int val3 = val2 + 1; // 10의 음수값이 됨.
		
		System.out.printf("%d + %d = %d\n", val1 , val3 , val1 + val3);

	}

}
