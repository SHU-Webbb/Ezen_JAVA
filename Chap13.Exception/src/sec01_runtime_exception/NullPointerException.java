package sec01_runtime_exception;

public class NullPointerException {

	public static void main(String[] args) {
		String data = null; // 데이터를 저장할 메모리가 할당되지 않음
		
		//해결방법
		//data = new String("java"); //메모리 할당
		System.out.println(data.toString());
			
	}

}
