package sec01;

public class StringExample1 {

	public static void main(String[] args) {

		String str1 = new String("Java Program");
		String str2 = new String("Java Program");

		// 문자열에서 지정한 위치의 문자값을 얻어오기
		System.out.println("str1의 5번 인덱스의 값 = " + str1.charAt(5));
		System.out.println("str1의 0번 인덱스의 값 = " + str1.charAt(0));
		
		//문자열의 길이
		System.out.println("str1의 문자열의 길이 = " + str1.length());
		
		//부분 문자열의 추출
		// (1) 시작 위치만 지정
		System.out.println("5번 인텍스 이후의 문자열 = "+ str1.substring(5) );
		// (2) 시작과 끝 위치 지정
		// 끝 위치의 문자는 포함하지 않는다.
		System.out.println("5와 9번 인텍스 사이의 문자열 = "+ str1.substring(5,9) );
		
		//특정 글자의 인덱스 알아보기
		System.out.println("str1에서 a의 위치 = "+ str1.indexOf('a'));
		
		//문자열의 마지막에서 특정 글자의 인덱스
		System.out.println("str1에서 마지막에서 시작하는 a의 위치 = "+ str1.lastIndexOf('a'));
		
		//문자열의 내용이 같은지 비교
		if (str1 == str2){
			System.out.println("문자열의 주소값이 같습니다.");
		}else {
			System.out.println("문자열의 주소값이 다릅니다.");
		}
		
		if(str1.equals(str2)) {
			System.out.println("문자열의 내용이 같습니다.");
		}else {
			System.out.println("문자열의 내용이 같지 않습니다.");
		}
		String str3 = "Java";
		String str4 = "Java";
		if (str3 == str4){
			System.out.println("str3과 str4의 주소값이 같습니다.");
		}else {
			System.out.println("str3과 str4의 주소값이 다릅니다.");
		}
	}
}
