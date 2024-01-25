package sec10_treemap;

import java.util.*;

public class TreeMapEx1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String answer = "";
		
		TreeMap<String, String> tMap = new TreeMap<>();
		
		tMap.put("baby","아기");
		tMap.put("love" ,"사랑");
		tMap.put("tree" ,"나무");
		tMap.put("apple" ,"사과");
		tMap.put("music" ,"음악");
		tMap.put("rain" ,"비");
		tMap.put("student" ,"학생");
		
		do {
			System.out.print("알고 싶은 단어를 입력하세요:");
			answer = input.next();
			
			if(tMap.containsKey(answer)) {
				System.out.println(answer + " : " + tMap.get(answer));
			}else {
				System.out.println(answer + " 는 저장되어 있지 않습니다.");
			}
		}while (!answer.equals("0"));
		
		System.out.println("프로그램 종료...");
	}

}
