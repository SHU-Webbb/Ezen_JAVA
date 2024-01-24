package sec01_why_generic;

public class MyGenericArrayTest {

	public static void main(String[] args) {
		MyGenericArrayList<String> myList = new MyGenericArrayList();

		myList.add("abc");
		myList.add("alpha");
		
		display(myList);
		
		
		//int타입의 1234를 참조형으로 변환
		//myList.add(Integer.valueOf(1234));
		
		display(myList);
	}

	public static void display(MyGenericArrayList<String> list) {
		System.out.println(">>>>> ArrayList의 내용 <<<<<");
		for (int i = 0; i < list.size(); i++) {
			String str = (String)list.get(i);
			System.out.println(str);
		}
		System.out.println();
	}

}
