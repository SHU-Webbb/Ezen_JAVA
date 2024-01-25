package sec01_runtime_exception;

public class NumberFormatException {

	public static void main(String[] args) {
		String data1 = "123";
		String data2 = "a123";
		
		int value1 = Integer.parseInt(data1); //문자열을 숫자로 변환.
		//int value2 = Integer.parseInt(data2); //문자가 섞여있어 예외 발생.
		System.out.printf("%d",data2); // 문자를 숫자형식으로 출력시 예외발생 

	}

}
