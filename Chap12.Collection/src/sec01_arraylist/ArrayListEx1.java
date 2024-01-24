package sec01_arraylist;

import java.util.ArrayList;

public class ArrayListEx1 {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<>();
		
		
		//리스트에 데이터 추가
		list1.add(5);
		list1.add(4);
		list1.add(Integer.valueOf(1)); //기본형 데이터를 참조형으로 변환하여 추가
		list1.add(2);
		System.out.println("list1 = " + list1);
		list1.add(3,3);   //인덱스3번에 3추가
		System.out.println("list1 = "+ list1);
		list1.set(3, 6);   // 인덱스 3번에 6으로 변환
		System.out.println("list1 = "+ list1);
		
		//list2에  데이터 추가
		list2.add(4);
		list2.add(5);
		list2.add(6);
		list2.add(4);
		System.out.println("list2= " + list2);
		
		//주요 메서드
		System.out.println("4가 저장된 제일 처음 위치는 " + list2.indexOf(4));
		System.out.println("4가 저장된 제일 마지막 위치는 " + list2.lastIndexOf(4));
		System.out.println("list2의 항목의 갯수는 " + list2.size());
		
		// 1,2번이 나옴 마지막번호는 포함하지 않음.
		System.out.println("list2의 1~3 위치의 서브리스트는 " + list2.subList(1, 3));  
		System.out.println(">>>>> list2의 내용을 배열로 변환 : ");
		Object[] intArr = list2.toArray();
		System.out.println("Integer 배열은 : ");
		for (Object item : intArr) {
			System.out.print(item + " ");
		}
		System.out.println();
		
		list1.retainAll(list2);  //list1에서 list2의 내용만을 남겨두고 나머지 삭제
		System.out.println("list1.retainAll(list2) = " + list1);
		System.out.println("list1.contains(3) = " + list1.contains(3));
		
		//list1에서 0번 인덱스 내용 삭제
		list1.remove(0);
		System.out.println("list1 = " + list1);
		
		System.out.println("list1에서 1번 인덱스의 값은 " + list1.get(1));
		
		
	}
}
