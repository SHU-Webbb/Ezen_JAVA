package sec04_wildcrad;

import java.util.ArrayList;
import java.util.List;

public class TestWildCard {
	public static void printList(List<?> list) {
	//public static void printList(List<Object> list) {  // Object 타입의 목록만 처리 가능
		for (Object obj : list) {
			System.out.println(obj);
		}
	}

	
	public static void main(String[] args) {
		
		List<Object> objList = new ArrayList<>();
		objList.add(55);
		objList.add(47);
		printList(objList);
		
		List<String> strList = new ArrayList<>();
		strList.add("one");
		strList.add("two");
		printList(strList);

	}

}
