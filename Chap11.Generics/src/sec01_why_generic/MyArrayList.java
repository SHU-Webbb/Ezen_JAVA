package sec01_why_generic;

/*
 * 여러가지 타입의 데이터를 저장하는 저장목록
 */
public class MyArrayList {
	private Object[] elements; // 모든 타입의 참조변수를 저장할 수 있는 변수
	private int size; // 저장 항목의 수

	// 생성자
	public MyArrayList() {
		elements = new Object[10]; // 초기에 10개의 데이터 저장소 생성
		size = 0;
	}

	// 하나의 데이터를 저장하는 메서드
	public void add(Object obj) {
		if (size < elements.length) { // 배열의 항목수보다 적어야 함.
			elements[size] = obj;
		} else {
			// 저장 불가능
		}
		size++;
	}
	
	// 리스트에서 특정 위치의 데이터를 얻어오는 메서드
	public Object get(int index) {
		if(index>= size) {
			System.out.println("index 지정이 잘못되었습니다.");
		}
		return elements[index];
	}
	
	//현재 저장된 항목의 수를 반환
	public int size() {
		return size;
	}
	
	
}
