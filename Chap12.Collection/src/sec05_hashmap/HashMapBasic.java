package sec05_hashmap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapBasic {

	public static void main(String[] args) {

		HashMap<String, String> map = new HashMap<>();

		// 데이터 저장
		map.put("철수", "1");
		map.put("영희", "2");
		map.put("길동", "3");
		map.put("호동", "4");
		map.put(null, "100");

		// 데이터 불러오기
		String value = map.get("길동");
		System.out.println("Key : 길동, Vlaue : " + value);
		// 항목에 없는 키값 요청
		value = map.get("이순신");
		System.out.println("Key : 이순신, Vlaue : " + value);
		// 키에 대한 값이 없을 경우 기본값 설정
		value = map.getOrDefault("이순신","기본값"); //두번째 매개변수 : 값이 없을 경우 사용할 값 지정
		System.out.println("Key : 이순신, Vlaue : " + value);
		
		//키 존재 여부 확인
		System.out.println("영희 키 값이 존재하는가: " + map.containsKey("영희"));
		//Value 존재 여부 확인
		System.out.println("99라는 value가 존재하는가: " + map.containsValue("99"));
		
		Set<Entry<String,String>> entrySet = map.entrySet();
		System.out.println(entrySet);
		
		//전제 map의 크기
		System.out.println("map size = " + map.size());
		
	}

}
