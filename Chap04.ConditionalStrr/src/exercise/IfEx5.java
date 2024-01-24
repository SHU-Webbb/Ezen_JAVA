package exercise;

public class IfEx5 {

	public static void main(String[] args) {
		/**
		 * 1. int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식
		 * 
		 * 2. char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식
		 * 
		 * 3. char형 변수 ch가 ‘x’ 또는 ‘X’일 때 true인 조건식
		 * 
		 * 4. char형 변수 ch가 숫자(‘0’~’9’)일 때 true인 조건식
		 * 
		 * 5. char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식
		 * 
		 * 6. int형 변수 year가 400으로 나눠 떨어지거나 또는 (4로 나눠 떨어지고 100으로 나눠 떨어지지 않을 때) true인 조건식
		 * 
		 * 7. boolean형 변수 powerOn이 false일 때 true인 조건식
		 * 
		 * 8. 문자열 참조변수 str이 “yes”일 때 true인 조건식
		 * 
		 */
		
		//1. int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식
		int x = 33;
		if(x>10 && x<20) {			
			System.out.println("x가 10보다 크고 20보다 작습니다.");
		}else {
			System.out.println("x가 10보다 크고 20보다 작지 않습니다.");
		}
		
		
		//2. char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식
		char ch = 'a';
		//!(ch == ' ' || ch == '\t')
		if(ch != ' ' && ch != '\t') {
			System.out.println("ch는 white space가 아닙니다");
			}
		else {
			System.out.println("ch는 white space 입니다.");
		}
		
		//3. char형 변수 ch가 ‘x’ 또는 ‘X’일 때 true인 조건식
		ch = 'x';
		
		
		if(ch == 'x' || ch == 'X' ) {
			System.out.println("ch는 x입니다.");
		}else {
			System.out.println("ch는 x가 아닙니다.");
		}
		
		
		//4. char형 변수 ch가 숫자(‘0’~’9’)일 때 true인 조건식
		if (ch >= '0' && ch <= '9') {
			System.out.println("ch는 숫자입니다.");
		}else {
			System.out.println("false");
		}
		
		//5. char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식
		ch ='k';
		if ((ch >= 'a' && ch <= 'z')||(ch >= 'A' && ch <= 'Z')) {
			System.out.println("영문자 입니다.");
		}else {
			System.out.println("영문자가 아닙니다.");
		}
		
		//6. int형 변수 year가 400으로 나눠 떨어지거나 또는 
		//(4로 나눠 떨어지고 100으로 나눠 떨어지지 않을 때) true인 조건식
		int year = 2024;
		//((year%400 == 0) || (year%4 ==0) && (year%100 !=0))
		if (year%400 == 0) {
			System.out.println("윤년입니다.");
		}else if ((year%4 ==0) && (year%100 !=0)) {
			System.out.println("윤년입니다.");
		}else {
			System.out.println("윤년이 아닙니다.");
		}
	
		//7. boolean형 변수 powerOn이 false일 때 true인 조건식
		boolean powerOn = false;
		if(!powerOn) {
			System.out.println("power가 off 상태입니다.");
		}else {
			System.out.println("power가 on 상태입니다.");
		}
		//8. 문자열 참조변수 str이 “yes”일 때 true인 조건식
		String str = "yes";
		if (str.equals("yes")) {
			System.out.println("yes입니다.");
		}else {
			System.out.println("yes가 아닙니다");
		}
	}

}
