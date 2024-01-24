package sec02;

public class StringExample {

	public static void main(String[] args) {
		String str = "abc";
//		char ch = 'ab';  두개 이상의 문자는 문자열이므로 char형 저장 불가능
		String str2 = "ab" + "cd";
		
		System.out.println("str = " + str);
		System.out.println("str2 = " + str2);
		
		System.out.println("7" + 7);
		System.out.println(""+7+7); //순서대로 인식 
		System.out.println(7+7+"");

	}

}
