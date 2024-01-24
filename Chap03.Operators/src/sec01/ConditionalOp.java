package sec01;

public class ConditionalOp {

	public static void main(String[] args) {
		int x;
		int result;

		x = -10;
		// 어떤 값의 절대값을 구하는 식
		result = x >= 0 ? x : -x;
		System.out.printf("%d의 절대값은 %d\n", x, result);
		// 삼하연산자 내에 삼항 연산자 사용
		int score = 75;
		char grade;

		grade = score >= 90 ? 'A' : (score >= 80? 'B': 'C');
		System.out.println("나의 점수는 " + score);
		System.out.println("등급은 " + grade);
		
		// 정수 변수 num에 임의의 정수를 저장
		// num이 짝수이면 "num은 짝수입니다." 를 출력
		// 홀수이면 "num은 홀수입니다."를 출력
		
		int num;
		num = 9;
				
		String str = "";			
		str = (num%2 == 0 ? "짝수입니다." : "홀수입니다.\n");
		
		System.out.printf("%d는 %s", num, str);
		
		// 정수 변수 num에 대해
		// num이 양수이면 "양수입니다.", 음수이면 "음수입니다."
		// 0이면 "0입니다."를 출력
		
	
		String result2 = "";
		
		result2 = num>0 ? "양수" :(num < 0 ? "음수" : "0");
		System.out.printf("%d는 %s입니다.", num , result2);
			
		
	}

}
