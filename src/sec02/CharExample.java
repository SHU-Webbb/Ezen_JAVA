package sec02;

public class CharExample {

	public static void main(String[] args) {
		// char 타입은 하나의 문자를 저장하는 타입 (숫자로 저장됨)
		char c1 = 'A';
		int code = c1;
		int code3 = 'a';
		
		System.out.println("c1=" + c1);
		System.out.println("code = " + code);
		System.out.println("code3 = " + code3);
	
		char c2 ='가';
		int code2 = c2;
		
		System.out.println("code2 = " + code2);
		
		// 0 1 2 3 4 5 6 7 8 = 10진수
		// 0 1 => 2진수
		// 0 1 2 3 4 5 6 => 8진수 7 -> 010 앞에 0은 8진수를 말함
		// 0 1 2 3 4 5 6 7 8 9 11 12 13 14 15 
		// 0 1 2 3 4 5 6 7 8 9  A  B  C  D  E
		// F -> 0x10 0x는 16진수를 말함 
		//B0A1 1011 0000 1010 0001
		
		char c3 = '\uac00'; 
		System.out.println("c3" + c3);
		
		
	}

}
