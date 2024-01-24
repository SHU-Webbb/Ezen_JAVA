package sec02_linkedlist;

import java.util.*;

public class LinkedListEx1 {

	public static void main(String[] args) {
		LinkedList<String> aList = new LinkedList<>();
		String[] alphabet = { "A", "B", "C", "D", "E" };
		
		//배열의 내용을 리스트로 추가 
		for (String s : alphabet) {
			aList.add(s);
		}
		System.out.println("aList = " + aList);
		
		
		//배열의 내용을 list로 변환
		//List<String> bList = Arrays.asList(alphabet);
		
		//peek(), poll()
		System.out.println(aList.peek()); //리스트에서 제일 첫번째 내용 확인
		System.out.println("aList = " + aList);
		System.out.println(aList.poll());  //리스트에스 제일 첫번째 내용을 꺼내서 지운다.
		System.out.println("aList = " + aList);
		
		for(int i = 0; i<aList.size();i++) {
			
		}
	}

}
