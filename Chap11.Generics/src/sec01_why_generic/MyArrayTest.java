package sec01_why_generic;

public class MyArrayTest {

	public static void main(String[] args) {
		MyArrayList myList = new MyArrayList();

		myList.add("abc");
		myList.add("alpha");
		
		display(myList);
		
		
		//int타입의 1234를 참조형으로 변환
		myList.add(Integer.valueOf(1234));
		
		display(myList);
	}

	public static void display(MyArrayList list) {
		System.out.println(">>>>> ArrayList의 내용 <<<<<");
		for (int i = 0; i < list.size(); i++) {
			String str = (String)list.get(i);
			System.out.println(str);
		}
		System.out.println();
	}

}
