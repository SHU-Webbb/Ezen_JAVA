package sec08.method_return;

public class Calculator {
	int mul_result; // 곱셈 결과 저장

//	int a;; 기본형
//	Integer b; 참조형

	int add(int a, int b) {

		int result = a + b;

		return result;
	}

	int subrtact(int a, int b) {

		return a - b;
	}
	
	void multiply(int a, int b) {
		//리턴하지 않고 멤버변수에 결과를 저장
		mul_result = a * b;
	}
	// int... val == int[] val 동일한 의미
	int sum(int... val) {
		int result = 0; //계산 결과
		
		for(int i =0; i <val.length; i++) {
			result += val[i];
		}
		return result;
	}
	
	void dispResult() {
		System.out.println(mul_result);
	}
	
	/*
	 * if문에서 return문을 사용할 경우
	 * 모든 경우에 대해 return 문을 명시해야 한다.
	 */
	int max(int a, int b) {
		if(a>b) {
			return a;
		}else {
			return b;			
		}
	}
	
	
}
