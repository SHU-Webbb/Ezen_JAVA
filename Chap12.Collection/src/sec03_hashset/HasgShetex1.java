package sec03_hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class HasgShetex1 {

	public static void main(String[] args) {
		
		HashSet<String> fruits = new HashSet<>();
		
		// set에 데이터 추가
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Banana");
		
		//set이 비었는지 확인
		System.out.println("fruit set이 비어있는가? "+ fruits.isEmpty());
		
		//set 내에 값이 존재하는지 확인
		System.out.println("fruits set에 Apple이 존재하는가 ?" + fruits.contains("Apple"));
		System.out.println("fruits set에 Apple이 존재하는가 ?" + fruits.contains("Mango"));
		
		//set의 크기 (데이터 갯수)
		System.out.println("fruits 의 size (데이터 갯수)는 " +fruits.size());
		//List의 포한된 데이터를 fruits Set에 추가
		
		List<String> list1 = new ArrayList<>();
		
		list1.add("Grape");
		list1.add("Peach");
		list1.add("Strawberry");
		
		fruits.addAll(list1);
		System.out.println("데이터 추가 후 fruits의 내용은 ? " +fruits);
		
		System.out.println(">>> fruits의 데이터 목록");
		Iterator<String> it = fruits.iterator();
		while(it.hasNext()) { //it 객체 내에 처리할 다음 데이터가 있는가?
			System.out.println(it.next()); //next() - 다음으로 처리할 데이터를 꺼내온다.
		}
		
		//set에서 데이터 삭제
		fruits.remove("Banana");
		System.out.println("Banana 삭제 후 : " + fruits);
		
		fruits.add("Orange");
		System.out.println("Orange 추가 후 : " + fruits);
		
	}

}
