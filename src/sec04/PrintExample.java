package sec04;



public class PrintExample {

	public static void main(String[] args) {
		int age =14;
		int year = 2024;
		
		System.out.printf("age:%d, year:%d\n", age, year);

		byte b = 1;
		short s = 2;
		char c = 'A';
		int finger = 10;
		String str = "Java";
		
		
		System.out.printf("b=%d\n", b);
		System.out.printf("s=%d\n", s);
		System.out.printf("c=%c (%d)\n", c ,(int)c );
		
		//출력할 자리수 정렬
		System.out.printf("finger =[%5d]\n",finger);
		System.out.printf("finger =[%-5d]\n",finger);
		System.out.printf("finger =[%05d]\n",finger);
		
		/*
		 * 여러라인에 걸쳐 주석을 쓸때 사용.
		 * 
		 * 큰 수의 출력
		 * 
		 */
		long big = 100_000_000_000L;
		System.out.printf("big=%d\n",big);
		
		//8진수 (0으로 시작), 16진수 (0x로 시작)
		
		int octNo = 010; // 8진수 , 10진수로 8임
		int hexNo = 0x10; // 16진수, 10진수로 16임
		System.out.printf("octNo = %#o , %d\n" , octNo , octNo);
		System.out.printf("hexNo = %#x , %d\n" , hexNo , hexNo);
		
		//문자열 출력
		System.out.printf("srt = %s\n" , str);
		// 문자열 자리수 지정
		System.out.printf("srt = %10s\n" , str);
		System.out.printf("srt = %50s\n" , str);
		System.out.printf("srt = %.3s\n" , str); // 앞에서부터 나타낼 숫자 갯수
		
		System.out.printf("\"백분율\" : 80%%");
		
				
	}

}
