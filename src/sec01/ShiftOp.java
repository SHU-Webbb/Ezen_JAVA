package sec01;

public class ShiftOp {

	public static void main(String[] args) {
		int dec = -12;
		
		System.out.println("dec" + dec +"     ("+toBinary(dec) +")");
		//왼쪽으로 쉬프트
		System.out.println("dec<<1 = " + (dec<<1) + "     ("+toBinary(dec<<1) +")");
		System.out.println("dec<<2 = " + (dec<<2) + "     ("+toBinary(dec<<2) +")");

		//오른쪽으로 쉬프트
		System.out.println("dec>>1 = " + (dec>>1) + "     ("+toBinary(dec>>1) +")");
		System.out.println("dec>>>1 = " + (dec>>>1) + "     ("+toBinary(dec>>>1) +")");
	}

	public static String toBinary(int value) {
		String str = Integer.toBinaryString(value);
		
		// 이진수로 변환되는 수의 자리가 32가 아닐 경우 앞에 0을 채워줌.
		while(str.length() < 32) {
			str = "0" + str;
			}
		return str;	
	}
}
