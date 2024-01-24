package sec03;

public class StringArray {

	public static void main(String[] args) {
		// 문자열 배열 선언
		String[] strArr = new String[3];

		strArr[0] = new String("Java");
		strArr[1] = "Java";
		strArr[2] = "Java";

		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}

		// Advance For문
		System.out.println();
		for (String str : strArr) {
			System.out.println(str);
		}
		
		if(strArr[0] == strArr[1]) {
			System.out.println("참조 주소가 같습니다.");
		}else {
			System.out.println("참조 주소가 다릅니다.");
			
		}
	}

}
