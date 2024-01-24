package sec01_why_generic;

public class MyListTest {

	public static void main(String[] args) {
		MyGenericArrayList<String> list1 = new MyGenericArrayList();
		MyGenericArrayList<Integer> list2 = new MyGenericArrayList();
		
		list1.add("abc"); //Generic 타입이 String이므로 문자열 저장 가능.
	//	list1.add(123); //Integer 데이터는 저장할 수 없음.
		
		list2.add(123); //Generic 타입이 Integer 이므로 숫자만 저장 가능.
	//	list2.add("abc"); // String 데이터는 저장할 수 없음.
		
		System.out.println(list1.get(0));
		
		
	
		

	}

}
